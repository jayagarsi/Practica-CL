// Generated from /home/jaya/Escritorio/FIB/Practica-CL/asl/Asl.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AslLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ASSIGN=9, 
		ARRAY=10, EQUAL=11, NEQ=12, LET=13, LEQ=14, GET=15, GEQ=16, NOT=17, AND=18, 
		OR=19, PLUS=20, MINUS=21, MUL=22, DIV=23, MOD=24, VAR=25, INT=26, FLOAT=27, 
		CHAR=28, BOOL=29, IF=30, THEN=31, ELSE=32, ENDIF=33, WHILE=34, DO=35, 
		ENDWHILE=36, FUNC=37, ENDFUNC=38, READ=39, WRITE=40, RETURN=41, ID=42, 
		MULTID=43, INTVAL=44, FLOATNUM=45, CHAREXPR=46, STRING=47, COMMENT=48, 
		WS=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "ASSIGN", 
			"ARRAY", "EQUAL", "NEQ", "LET", "LEQ", "GET", "GEQ", "NOT", "AND", "OR", 
			"PLUS", "MINUS", "MUL", "DIV", "MOD", "VAR", "INT", "FLOAT", "CHAR", 
			"BOOL", "IF", "THEN", "ELSE", "ENDIF", "WHILE", "DO", "ENDWHILE", "FUNC", 
			"ENDFUNC", "READ", "WRITE", "RETURN", "ID", "MULTID", "INTVAL", "FLOATNUM", 
			"CHAREXPR", "STRING", "ESC_SEQ", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "';'", "':'", "'['", "']'", "'of'", "','", "'='", 
			"'array'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'not'", "'and'", 
			"'or'", "'+'", "'-'", "'*'", "'/'", "'%'", "'var'", "'int'", "'float'", 
			"'char'", "'bool'", "'if'", "'then'", "'else'", "'endif'", "'while'", 
			"'do'", "'endwhile'", "'func'", "'endfunc'", "'read'", "'write'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ASSIGN", "ARRAY", 
			"EQUAL", "NEQ", "LET", "LEQ", "GET", "GEQ", "NOT", "AND", "OR", "PLUS", 
			"MINUS", "MUL", "DIV", "MOD", "VAR", "INT", "FLOAT", "CHAR", "BOOL", 
			"IF", "THEN", "ELSE", "ENDIF", "WHILE", "DO", "ENDWHILE", "FUNC", "ENDFUNC", 
			"READ", "WRITE", "RETURN", "ID", "MULTID", "INTVAL", "FLOATNUM", "CHAREXPR", 
			"STRING", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public AslLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Asl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0147\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+"+
		"\3+\7+\u0104\n+\f+\16+\u0107\13+\3,\3,\6,\u010b\n,\r,\16,\u010c\3-\6-"+
		"\u0110\n-\r-\16-\u0111\3.\6.\u0115\n.\r.\16.\u0116\3.\3.\7.\u011b\n.\f"+
		".\16.\u011e\13.\3/\3/\3/\3/\3\60\3\60\3\60\7\60\u0127\n\60\f\60\16\60"+
		"\u012a\13\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u0135\n"+
		"\62\f\62\16\62\u0138\13\62\3\62\5\62\u013b\n\62\3\62\3\62\3\62\3\62\3"+
		"\63\6\63\u0142\n\63\r\63\16\63\u0143\3\63\3\63\2\2\64\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\2c\62e\63\3\2\b\4\2C\\c|\6\2\62;C\\aac|\4"+
		"\2$$^^\n\2$$))^^ddhhppttvv\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u014f\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\3g\3\2\2\2\5i\3\2\2\2\7k\3\2\2\2\tm\3\2\2\2\13o\3\2\2"+
		"\2\rq\3\2\2\2\17s\3\2\2\2\21v\3\2\2\2\23x\3\2\2\2\25z\3\2\2\2\27\u0080"+
		"\3\2\2\2\31\u0083\3\2\2\2\33\u0086\3\2\2\2\35\u0088\3\2\2\2\37\u008b\3"+
		"\2\2\2!\u008d\3\2\2\2#\u0090\3\2\2\2%\u0094\3\2\2\2\'\u0098\3\2\2\2)\u009b"+
		"\3\2\2\2+\u009d\3\2\2\2-\u009f\3\2\2\2/\u00a1\3\2\2\2\61\u00a3\3\2\2\2"+
		"\63\u00a5\3\2\2\2\65\u00a9\3\2\2\2\67\u00ad\3\2\2\29\u00b3\3\2\2\2;\u00b8"+
		"\3\2\2\2=\u00bd\3\2\2\2?\u00c0\3\2\2\2A\u00c5\3\2\2\2C\u00ca\3\2\2\2E"+
		"\u00d0\3\2\2\2G\u00d6\3\2\2\2I\u00d9\3\2\2\2K\u00e2\3\2\2\2M\u00e7\3\2"+
		"\2\2O\u00ef\3\2\2\2Q\u00f4\3\2\2\2S\u00fa\3\2\2\2U\u0101\3\2\2\2W\u010a"+
		"\3\2\2\2Y\u010f\3\2\2\2[\u0114\3\2\2\2]\u011f\3\2\2\2_\u0123\3\2\2\2a"+
		"\u012d\3\2\2\2c\u0130\3\2\2\2e\u0141\3\2\2\2gh\7*\2\2h\4\3\2\2\2ij\7+"+
		"\2\2j\6\3\2\2\2kl\7=\2\2l\b\3\2\2\2mn\7<\2\2n\n\3\2\2\2op\7]\2\2p\f\3"+
		"\2\2\2qr\7_\2\2r\16\3\2\2\2st\7q\2\2tu\7h\2\2u\20\3\2\2\2vw\7.\2\2w\22"+
		"\3\2\2\2xy\7?\2\2y\24\3\2\2\2z{\7c\2\2{|\7t\2\2|}\7t\2\2}~\7c\2\2~\177"+
		"\7{\2\2\177\26\3\2\2\2\u0080\u0081\7?\2\2\u0081\u0082\7?\2\2\u0082\30"+
		"\3\2\2\2\u0083\u0084\7#\2\2\u0084\u0085\7?\2\2\u0085\32\3\2\2\2\u0086"+
		"\u0087\7>\2\2\u0087\34\3\2\2\2\u0088\u0089\7>\2\2\u0089\u008a\7?\2\2\u008a"+
		"\36\3\2\2\2\u008b\u008c\7@\2\2\u008c \3\2\2\2\u008d\u008e\7@\2\2\u008e"+
		"\u008f\7?\2\2\u008f\"\3\2\2\2\u0090\u0091\7p\2\2\u0091\u0092\7q\2\2\u0092"+
		"\u0093\7v\2\2\u0093$\3\2\2\2\u0094\u0095\7c\2\2\u0095\u0096\7p\2\2\u0096"+
		"\u0097\7f\2\2\u0097&\3\2\2\2\u0098\u0099\7q\2\2\u0099\u009a\7t\2\2\u009a"+
		"(\3\2\2\2\u009b\u009c\7-\2\2\u009c*\3\2\2\2\u009d\u009e\7/\2\2\u009e,"+
		"\3\2\2\2\u009f\u00a0\7,\2\2\u00a0.\3\2\2\2\u00a1\u00a2\7\61\2\2\u00a2"+
		"\60\3\2\2\2\u00a3\u00a4\7\'\2\2\u00a4\62\3\2\2\2\u00a5\u00a6\7x\2\2\u00a6"+
		"\u00a7\7c\2\2\u00a7\u00a8\7t\2\2\u00a8\64\3\2\2\2\u00a9\u00aa\7k\2\2\u00aa"+
		"\u00ab\7p\2\2\u00ab\u00ac\7v\2\2\u00ac\66\3\2\2\2\u00ad\u00ae\7h\2\2\u00ae"+
		"\u00af\7n\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7v\2\2"+
		"\u00b28\3\2\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7j\2\2\u00b5\u00b6\7c\2"+
		"\2\u00b6\u00b7\7t\2\2\u00b7:\3\2\2\2\u00b8\u00b9\7d\2\2\u00b9\u00ba\7"+
		"q\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7n\2\2\u00bc<\3\2\2\2\u00bd\u00be"+
		"\7k\2\2\u00be\u00bf\7h\2\2\u00bf>\3\2\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2"+
		"\7j\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7p\2\2\u00c4@\3\2\2\2\u00c5\u00c6"+
		"\7g\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7g\2\2\u00c9"+
		"B\3\2\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7f\2\2\u00cd"+
		"\u00ce\7k\2\2\u00ce\u00cf\7h\2\2\u00cfD\3\2\2\2\u00d0\u00d1\7y\2\2\u00d1"+
		"\u00d2\7j\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7g\2\2"+
		"\u00d5F\3\2\2\2\u00d6\u00d7\7f\2\2\u00d7\u00d8\7q\2\2\u00d8H\3\2\2\2\u00d9"+
		"\u00da\7g\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7y\2\2"+
		"\u00dd\u00de\7j\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1"+
		"\7g\2\2\u00e1J\3\2\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5"+
		"\7p\2\2\u00e5\u00e6\7e\2\2\u00e6L\3\2\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9"+
		"\7p\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb\7h\2\2\u00eb\u00ec\7w\2\2\u00ec"+
		"\u00ed\7p\2\2\u00ed\u00ee\7e\2\2\u00eeN\3\2\2\2\u00ef\u00f0\7t\2\2\u00f0"+
		"\u00f1\7g\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7f\2\2\u00f3P\3\2\2\2\u00f4"+
		"\u00f5\7y\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7v\2\2"+
		"\u00f8\u00f9\7g\2\2\u00f9R\3\2\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc\7g\2"+
		"\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100"+
		"\7p\2\2\u0100T\3\2\2\2\u0101\u0105\t\2\2\2\u0102\u0104\t\3\2\2\u0103\u0102"+
		"\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"V\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7.\2\2\u0109\u010b\5U+\2\u010a"+
		"\u0108\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010dX\3\2\2\2\u010e\u0110\4\62;\2\u010f\u010e\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112Z\3\2\2\2\u0113"+
		"\u0115\4\62;\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011c\7\60\2\2\u0119"+
		"\u011b\4\62;\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\\\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120"+
		"\7)\2\2\u0120\u0121\t\2\2\2\u0121\u0122\7)\2\2\u0122^\3\2\2\2\u0123\u0128"+
		"\7$\2\2\u0124\u0127\5a\61\2\u0125\u0127\n\4\2\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7$\2\2\u012c"+
		"`\3\2\2\2\u012d\u012e\7^\2\2\u012e\u012f\t\5\2\2\u012fb\3\2\2\2\u0130"+
		"\u0131\7\61\2\2\u0131\u0132\7\61\2\2\u0132\u0136\3\2\2\2\u0133\u0135\n"+
		"\6\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013b\7\17"+
		"\2\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\7\f\2\2\u013d\u013e\3\2\2\2\u013e\u013f\b\62\2\2\u013fd\3\2\2\2"+
		"\u0140\u0142\t\7\2\2\u0141\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\b\63\2\2"+
		"\u0146f\3\2\2\2\r\2\u0105\u010c\u0111\u0116\u011c\u0126\u0128\u0136\u013a"+
		"\u0143\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}