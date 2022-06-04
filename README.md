# ASL Language Compiler

Compiler for the ASL language described in the subject's web [page](https://www.cs.upc.edu/~padro/CL/practica/project.html). The project has been realized using ANTLR, which provided the tools to generate the grammar, the lexer and the parser. This compiler has three fases:
* **SymbolsVisitor**: the first one visits the abstract sintax tree to keep record of all the symbols and their types, that the program has and store them in the Symbols Table.
* **TypeCheckVisitor**: the second one traverses again the tree but now to look for semantic errors such as incoherent type operations among others. 
* **CodeGenVisitor**: the last fase is the code generation in which we traverse again the tree now generating a three address t-Code, which can be executed on the TVM virtual machine. All the documentation for this language can be found in [here](https://www.cs.upc.edu/~padro/CL/practica/tvm.html).

To ease our job, we were given a set of complementary modules, which can be found in common and perfectly explained in the web [page](https://www.cs.upc.edu/~padro/CL/practica/modules.html). Among these, we can find the implementation for the Symbol Table, the Tree Decorator, classes to make the error printing easier and to generate code. 

Our job has been:

1. Create the grammar for the ASL
2. Complete the SymbolsVisitor class to put the correct type to each expression
3. Complete the TypeCheckVisitor class to ensure the abort of the program when some semantic error has been found.
4. Complete the CodeGenVisitor class to generate the 3 address code when we're sure that no semantic or lexical error has been found.

Each step was perfectly guided with this [scheme](https://www.cs.upc.edu/~padro/CL/practica/steps.html) that we followed, which explains for every test, which part of the language it is testing.

# Authors
* Jaya García
* César Mellado
