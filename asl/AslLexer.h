
// Generated from Asl.g4 by ANTLR 4.9.2

#pragma once


#include "antlr4-runtime.h"




class  AslLexer : public antlr4::Lexer {
public:
  enum {
    T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, 
    T__7 = 8, ASSIGN = 9, ARRAY = 10, EQUAL = 11, NEQ = 12, LET = 13, LEQ = 14, 
    GET = 15, GEQ = 16, NOT = 17, AND = 18, OR = 19, PLUS = 20, MINUS = 21, 
    MUL = 22, DIV = 23, MOD = 24, VAR = 25, INT = 26, FLOAT = 27, CHAR = 28, 
    BOOL = 29, IF = 30, THEN = 31, ELSE = 32, ENDIF = 33, WHILE = 34, DO = 35, 
    ENDWHILE = 36, FUNC = 37, ENDFUNC = 38, READ = 39, WRITE = 40, RETURN = 41, 
    ID = 42, MULTID = 43, INTVAL = 44, FLOATNUM = 45, CHAREXPR = 46, STRING = 47, 
    COMMENT = 48, WS = 49
  };

  explicit AslLexer(antlr4::CharStream *input);
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

