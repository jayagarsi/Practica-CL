
// Generated from Asl.g4 by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"




class  AslLexer : public antlr4::Lexer {
public:
  enum {
    T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, 
    T__7 = 8, ASSIGN = 9, ARRAY = 10, EQUAL = 11, NEQ = 12, LET = 13, LEQ = 14, 
    GET = 15, GEQ = 16, NOT = 17, AND = 18, TRUE = 19, FALSE = 20, OR = 21, 
    PLUS = 22, MINUS = 23, MUL = 24, DIV = 25, MOD = 26, VAR = 27, INT = 28, 
    FLOAT = 29, CHAR = 30, BOOL = 31, IF = 32, THEN = 33, ELSE = 34, ENDIF = 35, 
    WHILE = 36, DO = 37, ENDWHILE = 38, FUNC = 39, ENDFUNC = 40, READ = 41, 
    WRITE = 42, RETURN = 43, ID = 44, INTVAL = 45, FLOATNUM = 46, CHAREXPR = 47, 
    STRING = 48, COMMENT = 49, WS = 50
  };

  AslLexer(antlr4::CharStream *input);
  ~AslLexer();

  virtual std::string getGrammarFileName() const override;
  virtual const std::vector<std::string>& getRuleNames() const override;

  virtual const std::vector<std::string>& getChannelNames() const override;
  virtual const std::vector<std::string>& getModeNames() const override;
  virtual const std::vector<std::string>& getTokenNames() const override; // deprecated, use vocabulary instead
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;

  virtual const std::vector<uint16_t> getSerializedATN() const override;
  virtual const antlr4::atn::ATN& getATN() const override;

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;
  static std::vector<std::string> _channelNames;
  static std::vector<std::string> _modeNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  // Individual action functions triggered by action() above.

  // Individual semantic predicate functions triggered by sempred() above.

  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

