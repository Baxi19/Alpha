// Generated from C:/Users/Baxi/Desktop/Alpha\AlphaParser.g4 by ANTLR 4.8
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlphaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyCOMMA=1, TWO_P=2, L_PARENT=3, R_PARENT=4, VIR=5, ASSING=6, SUM=7, SUB=8, 
		MUL=9, DIV=10, NOT_EQUAL=11, IF=12, THEN=13, ELSE=14, WHILE=15, DO=16, 
		LET=17, IN=18, BEGIN=19, END=20, CONST=21, VAR=22, INTEGER=23, IDENT=24, 
		LITERAL=25, WS=26;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_single_command = 2, RULE_declaration = 3, 
		RULE_single_declaration = 4, RULE_operator = 5, RULE_expression = 6, RULE_primary_exp = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command", "single_command", "declaration", "single_declaration", 
			"operator", "expression", "primary_exp"
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

	@Override
	public String getGrammarFileName() { return "AlphaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlphaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Single_commandContext single_command() {
			return getRuleContext(Single_commandContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaParserVisitor ) return ((AlphaParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			single_command();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(AlphaParser.IDENT, 0); }
		public List<TerminalNode> PyCOMMA() { return getTokens(AlphaParser.PyCOMMA); }
		public TerminalNode PyCOMMA(int i) {
			return getToken(AlphaParser.PyCOMMA, i);
		}
		public List<Single_commandContext> single_command() {
			return getRuleContexts(Single_commandContext.class);
		}
		public Single_commandContext single_command(int i) {
			return getRuleContext(Single_commandContext.class,i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaParserVisitor ) return ((AlphaParserVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(IDENT);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PyCOMMA) {
				{
				{
				setState(19);
				match(PyCOMMA);
				setState(20);
				single_command();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_commandContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(AlphaParser.IDENT, 0); }
		public TerminalNode ASSING() { return getToken(AlphaParser.ASSING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode L_PARENT() { return getToken(AlphaParser.L_PARENT, 0); }
		public TerminalNode R_PARENT() { return getToken(AlphaParser.R_PARENT, 0); }
		public TerminalNode IF() { return getToken(AlphaParser.IF, 0); }
		public TerminalNode THEN() { return getToken(AlphaParser.THEN, 0); }
		public List<Single_commandContext> single_command() {
			return getRuleContexts(Single_commandContext.class);
		}
		public Single_commandContext single_command(int i) {
			return getRuleContext(Single_commandContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AlphaParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(AlphaParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(AlphaParser.DO, 0); }
		public TerminalNode LET() { return getToken(AlphaParser.LET, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode IN() { return getToken(AlphaParser.IN, 0); }
		public TerminalNode BEGIN() { return getToken(AlphaParser.BEGIN, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode END() { return getToken(AlphaParser.END, 0); }
		public Single_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_command; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaParserVisitor ) return ((AlphaParserVisitor<? extends T>)visitor).visitSingle_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_commandContext single_command() throws RecognitionException {
		Single_commandContext _localctx = new Single_commandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_single_command);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(IDENT);
				setState(33);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSING:
					{
					setState(27);
					match(ASSING);
					setState(28);
					expression();
					}
					break;
				case L_PARENT:
					{
					setState(29);
					match(L_PARENT);
					setState(30);
					expression();
					setState(31);
					match(R_PARENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(IF);
				setState(36);
				expression();
				setState(37);
				match(THEN);
				setState(38);
				single_command();
				setState(39);
				match(ELSE);
				setState(40);
				single_command();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(WHILE);
				setState(43);
				expression();
				setState(44);
				match(DO);
				setState(45);
				single_command();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(LET);
				setState(48);
				declaration();
				setState(49);
				match(IN);
				setState(50);
				single_command();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				match(BEGIN);
				setState(53);
				command();
				setState(54);
				match(END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public List<Single_declarationContext> single_declaration() {
			return getRuleContexts(Single_declarationContext.class);
		}
		public Single_declarationContext single_declaration(int i) {
			return getRuleContext(Single_declarationContext.class,i);
		}
		public List<TerminalNode> PyCOMMA() { return getTokens(AlphaParser.PyCOMMA); }
		public TerminalNode PyCOMMA(int i) {
			return getToken(AlphaParser.PyCOMMA, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaParserVisitor ) return ((AlphaParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			single_declaration();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PyCOMMA) {
				{
				{
				setState(59);
				match(PyCOMMA);
				setState(60);
				single_declaration();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_declarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(AlphaParser.CONST, 0); }
		public List<TerminalNode> IDENT() { return getTokens(AlphaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(AlphaParser.IDENT, i);
		}
		public TerminalNode VIR() { return getToken(AlphaParser.VIR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAR() { return getToken(AlphaParser.VAR, 0); }
		public TerminalNode TWO_P() { return getToken(AlphaParser.TWO_P, 0); }
		public Single_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaParserVisitor ) return ((AlphaParserVisitor<? extends T>)visitor).visitSingle_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_declarationContext single_declaration() throws RecognitionException {
		Single_declarationContext _localctx = new Single_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_single_declaration);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(CONST);
				setState(67);
				match(IDENT);
				setState(68);
				match(VIR);
				setState(69);
				expression();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(VAR);
				setState(71);
				match(IDENT);
				setState(72);
				match(TWO_P);
				setState(73);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(AlphaParser.SUM, 0); }
		public TerminalNode SUB() { return getToken(AlphaParser.SUB, 0); }
		public TerminalNode DIV() { return getToken(AlphaParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(AlphaParser.MUL, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaParserVisitor ) return ((AlphaParserVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<Primary_expContext> primary_exp() {
			return getRuleContexts(Primary_expContext.class);
		}
		public Primary_expContext primary_exp(int i) {
			return getRuleContext(Primary_expContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaParserVisitor ) return ((AlphaParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			primary_exp();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) {
				{
				{
				setState(79);
				operator();
				setState(80);
				primary_exp();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(AlphaParser.LITERAL, 0); }
		public TerminalNode IDENT() { return getToken(AlphaParser.IDENT, 0); }
		public TerminalNode L_PARENT() { return getToken(AlphaParser.L_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARENT() { return getToken(AlphaParser.R_PARENT, 0); }
		public Primary_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_exp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaParserVisitor ) return ((AlphaParserVisitor<? extends T>)visitor).visitPrimary_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expContext primary_exp() throws RecognitionException {
		Primary_expContext _localctx = new Primary_expContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primary_exp);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(LITERAL);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(IDENT);
				}
				break;
			case L_PARENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(L_PARENT);
				setState(90);
				expression();
				setState(91);
				match(R_PARENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34b\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\3\3"+
		"\7\3\30\n\3\f\3\16\3\33\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4$\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\7\5@\n\5\f\5\16\5C\13\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6M\n\6\3\7\3\7\3\b\3\b\3\b\3\b\7\bU\n\b\f\b\16\b"+
		"X\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t`\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2"+
		"\3\3\2\t\f\2d\2\22\3\2\2\2\4\24\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\nL\3\2\2"+
		"\2\fN\3\2\2\2\16P\3\2\2\2\20_\3\2\2\2\22\23\5\6\4\2\23\3\3\2\2\2\24\31"+
		"\7\32\2\2\25\26\7\3\2\2\26\30\5\6\4\2\27\25\3\2\2\2\30\33\3\2\2\2\31\27"+
		"\3\2\2\2\31\32\3\2\2\2\32\5\3\2\2\2\33\31\3\2\2\2\34#\7\32\2\2\35\36\7"+
		"\b\2\2\36$\5\16\b\2\37 \7\5\2\2 !\5\16\b\2!\"\7\6\2\2\"$\3\2\2\2#\35\3"+
		"\2\2\2#\37\3\2\2\2$;\3\2\2\2%&\7\16\2\2&\'\5\16\b\2\'(\7\17\2\2()\5\6"+
		"\4\2)*\7\20\2\2*+\5\6\4\2+;\3\2\2\2,-\7\21\2\2-.\5\16\b\2./\7\22\2\2/"+
		"\60\5\6\4\2\60;\3\2\2\2\61\62\7\23\2\2\62\63\5\b\5\2\63\64\7\24\2\2\64"+
		"\65\5\6\4\2\65;\3\2\2\2\66\67\7\25\2\2\678\5\4\3\289\7\26\2\29;\3\2\2"+
		"\2:\34\3\2\2\2:%\3\2\2\2:,\3\2\2\2:\61\3\2\2\2:\66\3\2\2\2;\7\3\2\2\2"+
		"<A\5\n\6\2=>\7\3\2\2>@\5\n\6\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2"+
		"B\t\3\2\2\2CA\3\2\2\2DE\7\27\2\2EF\7\32\2\2FG\7\7\2\2GM\5\16\b\2HI\7\30"+
		"\2\2IJ\7\32\2\2JK\7\4\2\2KM\7\32\2\2LD\3\2\2\2LH\3\2\2\2M\13\3\2\2\2N"+
		"O\t\2\2\2O\r\3\2\2\2PV\5\20\t\2QR\5\f\7\2RS\5\20\t\2SU\3\2\2\2TQ\3\2\2"+
		"\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\17\3\2\2\2XV\3\2\2\2Y`\7\33\2\2Z`\7"+
		"\32\2\2[\\\7\5\2\2\\]\5\16\b\2]^\7\6\2\2^`\3\2\2\2_Y\3\2\2\2_Z\3\2\2\2"+
		"_[\3\2\2\2`\21\3\2\2\2\t\31#:ALV_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}