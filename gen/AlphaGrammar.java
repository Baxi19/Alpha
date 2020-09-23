// Generated from C:/Users/Baxi/Desktop/Alpha\AlphaGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlphaGrammar extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, ELSE=3, WHILE=4, DO=5, LET=6, IN=7, BEGIN=8, END=9, CONST=10, 
		VAR=11, ASSING=12, SUM=13, SUB=14, MUL=15, DIV=16, NOT_EQUAL=17, PYCOMMA=18, 
		L_PARENT=19, R_PARENT=20, VIRG=21, TWO_P=22, INTEGER=23, IDENT=24, LITERAL=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "THEN", "ELSE", "WHILE", "DO", "LET", "IN", "BEGIN", "END", "CONST", 
			"VAR", "ASSING", "SUM", "SUB", "MUL", "DIV", "NOT_EQUAL", "PYCOMMA", 
			"L_PARENT", "R_PARENT", "VIRG", "TWO_P", "INTEGER", "ZERO", "DIGIT", 
			"IDENT", "LETTER", "LITERAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'else'", "'while'", "'do'", "'let'", "'in'", 
			"'begin'", "'end'", "'const'", "'var'", "':='", "'+'", "'-'", "'*'", 
			"'/'", "'/='", "';'", "'('", "')'", "'~'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "THEN", "ELSE", "WHILE", "DO", "LET", "IN", "BEGIN", "END", 
			"CONST", "VAR", "ASSING", "SUM", "SUB", "MUL", "DIV", "NOT_EQUAL", "PYCOMMA", 
			"L_PARENT", "R_PARENT", "VIRG", "TWO_P", "INTEGER", "IDENT", "LITERAL"
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


	public AlphaGrammar(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AlphaGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00a3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\7\30\u0087\n\30\f\30\16\30\u008a\13\30\3\30"+
		"\5\30\u008d\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\7\33\u0096\n\33\f"+
		"\33\16\33\u0099\13\33\3\34\3\34\3\35\3\35\7\35\u009f\n\35\f\35\16\35\u00a2"+
		"\13\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\2\63\2\65\32\67"+
		"\29\33\3\2\6\3\2\63;\3\2\62;\3\2\62\62\3\2c|\2\u00a4\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\65\3\2\2\2\29\3"+
		"\2\2\2\3;\3\2\2\2\5>\3\2\2\2\7C\3\2\2\2\tH\3\2\2\2\13N\3\2\2\2\rQ\3\2"+
		"\2\2\17U\3\2\2\2\21X\3\2\2\2\23^\3\2\2\2\25b\3\2\2\2\27h\3\2\2\2\31l\3"+
		"\2\2\2\33o\3\2\2\2\35q\3\2\2\2\37s\3\2\2\2!u\3\2\2\2#w\3\2\2\2%z\3\2\2"+
		"\2\'|\3\2\2\2)~\3\2\2\2+\u0080\3\2\2\2-\u0082\3\2\2\2/\u008c\3\2\2\2\61"+
		"\u008e\3\2\2\2\63\u0090\3\2\2\2\65\u0092\3\2\2\2\67\u009a\3\2\2\29\u009c"+
		"\3\2\2\2;<\7k\2\2<=\7h\2\2=\4\3\2\2\2>?\7v\2\2?@\7j\2\2@A\7g\2\2AB\7p"+
		"\2\2B\6\3\2\2\2CD\7g\2\2DE\7n\2\2EF\7u\2\2FG\7g\2\2G\b\3\2\2\2HI\7y\2"+
		"\2IJ\7j\2\2JK\7k\2\2KL\7n\2\2LM\7g\2\2M\n\3\2\2\2NO\7f\2\2OP\7q\2\2P\f"+
		"\3\2\2\2QR\7n\2\2RS\7g\2\2ST\7v\2\2T\16\3\2\2\2UV\7k\2\2VW\7p\2\2W\20"+
		"\3\2\2\2XY\7d\2\2YZ\7g\2\2Z[\7i\2\2[\\\7k\2\2\\]\7p\2\2]\22\3\2\2\2^_"+
		"\7g\2\2_`\7p\2\2`a\7f\2\2a\24\3\2\2\2bc\7e\2\2cd\7q\2\2de\7p\2\2ef\7u"+
		"\2\2fg\7v\2\2g\26\3\2\2\2hi\7x\2\2ij\7c\2\2jk\7t\2\2k\30\3\2\2\2lm\7<"+
		"\2\2mn\7?\2\2n\32\3\2\2\2op\7-\2\2p\34\3\2\2\2qr\7/\2\2r\36\3\2\2\2st"+
		"\7,\2\2t \3\2\2\2uv\7\61\2\2v\"\3\2\2\2wx\7\61\2\2xy\7?\2\2y$\3\2\2\2"+
		"z{\7=\2\2{&\3\2\2\2|}\7*\2\2}(\3\2\2\2~\177\7+\2\2\177*\3\2\2\2\u0080"+
		"\u0081\7\u0080\2\2\u0081,\3\2\2\2\u0082\u0083\7<\2\2\u0083.\3\2\2\2\u0084"+
		"\u0088\t\2\2\2\u0085\u0087\t\3\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008d\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008d\5\61\31\2\u008c\u0084\3\2\2\2\u008c\u008b\3"+
		"\2\2\2\u008d\60\3\2\2\2\u008e\u008f\t\4\2\2\u008f\62\3\2\2\2\u0090\u0091"+
		"\t\3\2\2\u0091\64\3\2\2\2\u0092\u0097\5\67\34\2\u0093\u0096\5\67\34\2"+
		"\u0094\u0096\5\63\32\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\u0099"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\66\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009b\t\5\2\2\u009b8\3\2\2\2\u009c\u00a0\5\63\32"+
		"\2\u009d\u009f\5\63\32\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1:\3\2\2\2\u00a2\u00a0\3\2\2\2"+
		"\b\2\u0088\u008c\u0095\u0097\u00a0\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}