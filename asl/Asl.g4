//////////////////////////////////////////////////////////////////////
//
//    Asl - Another simple language (grammar)
//
//    Copyright (C) 2017-2022  Universitat Politecnica de Catalunya
//
//    This library is free software; you can redistribute it and/or
//    modify it under the terms of the GNU General Public License
//    as published by the Free Software Foundation; either version 3
//    of the License, or (at your option) any later version.
//
//    This library is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//    Affero General Public License for more details.
//
//    You should have received a copy of the GNU Affero General Public
//    License along with this library; if not, write to the Free Software
//    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
//
//    contact: José Miguel Rivero (rivero@cs.upc.edu)
//             Computer Science Department
//             Universitat Politecnica de Catalunya
//             despatx Omega.110 - Campus Nord UPC
//             08034 Barcelona.  SPAIN
//
//////////////////////////////////////////////////////////////////////

grammar Asl;

//////////////////////////////////////////////////
/// Parser Rules
//////////////////////////////////////////////////

// A program is a list of functions
program : function+ EOF
        ;

// A function has a name, a list of parameters and a list of statements
function
        : FUNC ID '(' parameters? ')' returnvalue? declarations statements (RETURN (expr)? ';')* ENDFUNC
        ;

parameters
        : ID ':' type (',' (ID ':' type))*
        ;

returnvalue
        : ':' type
        ;

declarations
        : (variable_decl)*
        ;

variable_decl
        : VAR ID (',' ID)* ':' type // VAR ID (',' ID)*;  for   ctx->ID()
        ;

type : basictype
     | arraytype
     ;

basictype    : INT
             | FLOAT
             | BOOL
             | CHAR
             ;

arraytype : ARRAY '[' INTVAL ']' 'of' basictype
          ;

paramexp
        : (expr (',' expr)*)?
        ;

statements
        : (statement)*
        ;

// The different types of instructions
statement
          // Assignment
        : left_expr ASSIGN expr ';'                              # assignStmt
          // if-then-else statement (else is optional)
        | IF expr THEN statements (ELSE statements)? ENDIF   # ifStmt
          // while statement
        | WHILE expr DO statements ENDWHILE                      # whileStmt
          // A function/procedure call has a list of arguments in parenthesis (possibly empty)
        | ident '(' paramexp ')' ';'                             # procCall
          // Read a variable
        | READ left_expr ';'                                     # readStmt
          // Write an expression
        | WRITE expr ';'                                         # writeExpr
          // Write a string
        | WRITE STRING ';'                                       # writeString
        ;

// Grammar for left expressions (l-values in C++)
left_expr
        : ident
        ;

// Grammar for expressions with boolean, relational and aritmetic operators
expr    : '(' expr ')'                              # parenthesis
        | op=(MINUS|PLUS|NOT) expr                  # unary
        | ID '[' expr ']'                           # relational
        | (PLUS | MINUS) expr                       # arithmetic
        | expr op=(MUL|DIV|MOD) expr                # arithmetic
        | expr op=(PLUS|MINUS) expr                 # arithmetic
        | expr op=(LET|LEQ|EQUAL|NEQ|GET|GEQ) expr  # relational
        | expr op=AND expr                             # boolean
        | expr op=OR expr                              # boolean
        | ident '(' paramexp ')'                    # funcCall
        | (INTVAL | FLOATNUM | CHAREXPR)            # value
        | ident                                     # exprIdent
        ;

// Identifiers
ident   : ID
        | ID '[' expr ']'
        ;

//////////////////////////////////////////////////
/// Lexer Rules
//////////////////////////////////////////////////

ASSIGN    : '=' ;
ARRAY     : 'array';
EQUAL     : '==' ;
NEQ       : '!=' ;
LET       : '<';
LEQ       : '<=';
GET       : '>';
GEQ       : '>=';
NOT       : 'not';
AND       : 'and';
OR        : 'or';
PLUS      : '+' ;
MINUS     : '-' ;
MUL       : '*';
DIV       : '/';
MOD       : '%';
VAR       : 'var';
INT       : 'int';
FLOAT     : 'float';
CHAR      : 'char';
BOOL      : 'bool';
IF        : 'if' ;
THEN      : 'then' ;
ELSE      : 'else' ;
ENDIF     : 'endif' ;
WHILE     : 'while';
DO        : 'do';
ENDWHILE  : 'endwhile';
FUNC      : 'func' ;
ENDFUNC   : 'endfunc' ;
READ      : 'read' ;
WRITE     : 'write' ;
RETURN    : 'return';
ID        : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ;
INTVAL    : ('0'..'9')+ ;
FLOATNUM  : ('0'..'9')+ '.' ('0'..'9')*;
CHAREXPR  : '\'' ('a'..'z'|'A'..'Z') '\'';

// Strings (in quotes) with escape sequences
STRING    : '"' ( ESC_SEQ | ~('\\'|'"') )* '"' ;

fragment
ESC_SEQ   : '\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\') ;

// Comments (inline C++-style)
COMMENT   : '//' ~('\n'|'\r')* '\r'? '\n' -> skip ;

// White spaces
WS        : (' '|'\t'|'\r'|'\n')+ -> skip ;
// Alternative description
// WS        : [ \t\r\n]+ -> skip ;