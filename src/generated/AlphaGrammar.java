// Generated from C:/Users/Baxi/Desktop/Alpha\AlphaGrammar.g4 by ANTLR 4.8
package generated;
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
		PyCOMMA=1, TWO_P=2, L_PARENT=3, R_PARENT=4, VIR=5, ASSING=6, SUM=7, SUB=8, 
		MUL=9, DIV=10, NOT_EQUAL=11, IF=12, THEN=13, ELSE=14, WHILE=15, DO=16, 
		LET=17, IN=18, BEGIN=19, END=20, CONST=21, VAR=22, INTEGER=23, IDENT=24, 
		LITERAL=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PyCOMMA", "TWO_P", "L_PARENT", "R_PARENT", "VIR", "ASSING", "SUM", "SUB", 
			"MUL", "DIV", "NOT_EQUAL", "IF", "THEN", "ELSE", "WHILE", "DO", "LET", 
			"IN", "BEGIN", "END", "CONST", "VAR", "INTEGER", "ZERO", "DIGIT", "IDENT", 
			"LETTER", "LITERAL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':'", "'('", "')'", "'~'", "':='", "'+'", "'-'", "'*'", 
			"'/'", "'/='", "'if'", "'then'", "'else'", "'while'", "'do'", "'let'", 
			"'in'", "'begin'", "'end'", "'const'", "'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PyCOMMA", "TWO_P", "L_PARENT", "R_PARENT", "VIR", "ASSING", "SUM", 
			"SUB", "MUL", "DIV", "NOT_EQUAL", "IF", "THEN", "ELSE", "WHILE", "DO", 
			"LET", "IN", "BEGIN", "END", "CONST", "VAR", "INTEGER", "IDENT", "LITERAL", 
			"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00ac\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\7\30\u0089"+
		"\n\30\f\30\16\30\u008c\13\30\3\30\5\30\u008f\n\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\33\7\33\u0098\n\33\f\33\16\33\u009b\13\33\3\34\3\34\3\35"+
		"\3\35\7\35\u00a1\n\35\f\35\16\35\u00a4\13\35\3\36\6\36\u00a7\n\36\r\36"+
		"\16\36\u00a8\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\2\63\2\65\32\67\29\33;\34\3\2\7\3\2\63;\3\2\62;\3\2\62\62\3\2c|\4\2\13"+
		"\f\17\17\2\u00ae\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\65\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2"+
		"\2\2\7A\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rG\3\2\2\2\17J\3\2\2\2\21L\3\2"+
		"\2\2\23N\3\2\2\2\25P\3\2\2\2\27R\3\2\2\2\31U\3\2\2\2\33X\3\2\2\2\35]\3"+
		"\2\2\2\37b\3\2\2\2!h\3\2\2\2#k\3\2\2\2%o\3\2\2\2\'r\3\2\2\2)x\3\2\2\2"+
		"+|\3\2\2\2-\u0082\3\2\2\2/\u008e\3\2\2\2\61\u0090\3\2\2\2\63\u0092\3\2"+
		"\2\2\65\u0094\3\2\2\2\67\u009c\3\2\2\29\u009e\3\2\2\2;\u00a6\3\2\2\2="+
		">\7=\2\2>\4\3\2\2\2?@\7<\2\2@\6\3\2\2\2AB\7*\2\2B\b\3\2\2\2CD\7+\2\2D"+
		"\n\3\2\2\2EF\7\u0080\2\2F\f\3\2\2\2GH\7<\2\2HI\7?\2\2I\16\3\2\2\2JK\7"+
		"-\2\2K\20\3\2\2\2LM\7/\2\2M\22\3\2\2\2NO\7,\2\2O\24\3\2\2\2PQ\7\61\2\2"+
		"Q\26\3\2\2\2RS\7\61\2\2ST\7?\2\2T\30\3\2\2\2UV\7k\2\2VW\7h\2\2W\32\3\2"+
		"\2\2XY\7v\2\2YZ\7j\2\2Z[\7g\2\2[\\\7p\2\2\\\34\3\2\2\2]^\7g\2\2^_\7n\2"+
		"\2_`\7u\2\2`a\7g\2\2a\36\3\2\2\2bc\7y\2\2cd\7j\2\2de\7k\2\2ef\7n\2\2f"+
		"g\7g\2\2g \3\2\2\2hi\7f\2\2ij\7q\2\2j\"\3\2\2\2kl\7n\2\2lm\7g\2\2mn\7"+
		"v\2\2n$\3\2\2\2op\7k\2\2pq\7p\2\2q&\3\2\2\2rs\7d\2\2st\7g\2\2tu\7i\2\2"+
		"uv\7k\2\2vw\7p\2\2w(\3\2\2\2xy\7g\2\2yz\7p\2\2z{\7f\2\2{*\3\2\2\2|}\7"+
		"e\2\2}~\7q\2\2~\177\7p\2\2\177\u0080\7u\2\2\u0080\u0081\7v\2\2\u0081,"+
		"\3\2\2\2\u0082\u0083\7x\2\2\u0083\u0084\7c\2\2\u0084\u0085\7t\2\2\u0085"+
		".\3\2\2\2\u0086\u008a\t\2\2\2\u0087\u0089\t\3\2\2\u0088\u0087\3\2\2\2"+
		"\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008f"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\5\61\31\2\u008e\u0086\3\2\2\2"+
		"\u008e\u008d\3\2\2\2\u008f\60\3\2\2\2\u0090\u0091\t\4\2\2\u0091\62\3\2"+
		"\2\2\u0092\u0093\t\3\2\2\u0093\64\3\2\2\2\u0094\u0099\5\67\34\2\u0095"+
		"\u0098\5\67\34\2\u0096\u0098\5\63\32\2\u0097\u0095\3\2\2\2\u0097\u0096"+
		"\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\66\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\t\5\2\2\u009d8\3\2\2\2\u009e"+
		"\u00a2\5\63\32\2\u009f\u00a1\5\63\32\2\u00a0\u009f\3\2\2\2\u00a1\u00a4"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3:\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a7\t\6\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\b\36\2\2\u00ab<\3\2\2\2\t\2\u008a\u008e\u0097\u0099\u00a2\u00a8"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}