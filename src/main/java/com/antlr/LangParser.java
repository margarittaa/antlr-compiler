// Generated from D:/Û˜Â·‡/ﬂœ»—/myCompiler/src/grammar\Lang.g4 by ANTLR 4.9.1
package com.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, SPACE=2, MAIN=3, FUN_DECLARE=4, TYPE_INT=5, TYPE_FLOAT=6, TYPE_CHAR=7, 
		TYPE_ARRAY=8, TYPE_STRING=9, FUN_PRINT=10, END=11, IF=12, FI=13, ELSE=14, 
		FOR=15, WHILE=16, AND=17, OR=18, NOT=19, DO=20, OD=21, TO=22, PLUS=23, 
		MINUS=24, MULT=25, DIVIDE=26, MOD=27, L_CBR=28, R_CBR=29, L_BR=30, R_BR=31, 
		QUOTES=32, COMMA=33, COLON=34, SEMICOLON=35, ASSIGN=36, EQUALS=37, NOT_EQUALS=38, 
		MORE_THAN=39, LESS_THAN=40, INT=41, FLOAT=42, CHAR=43, STRING=44, NULL=45, 
		ID=46;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_statement = 2, RULE_function_call = 3, 
		RULE_var_define = 4, RULE_type = 5, RULE_var_value = 6, RULE_assign = 7, 
		RULE_fun_print = 8, RULE_if_stat = 9, RULE_while_stat = 10, RULE_for_stat = 11, 
		RULE_for_expr = 12, RULE_expr = 13, RULE_mult = 14, RULE_subexpr = 15, 
		RULE_comparison = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "statement", "function_call", "var_define", "type", 
			"var_value", "assign", "fun_print", "if_stat", "while_stat", "for_stat", 
			"for_expr", "expr", "mult", "subexpr", "comparison"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'main'", "'function'", "'int'", "'float'", "'char'", 
			"'array'", "'string'", "'print'", "'end'", "'if'", "'fi'", "'else'", 
			"'for'", "'while'", "'and'", "'or'", "'not'", "'do'", "'od'", "'to'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'['", "']'", "'('", "')'", "'\"'", 
			"','", "':'", "';'", "'='", "'=='", "'<>'", "'>'", "'<'", null, null, 
			null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "SPACE", "MAIN", "FUN_DECLARE", "TYPE_INT", "TYPE_FLOAT", 
			"TYPE_CHAR", "TYPE_ARRAY", "TYPE_STRING", "FUN_PRINT", "END", "IF", "FI", 
			"ELSE", "FOR", "WHILE", "AND", "OR", "NOT", "DO", "OD", "TO", "PLUS", 
			"MINUS", "MULT", "DIVIDE", "MOD", "L_CBR", "R_CBR", "L_BR", "R_BR", "QUOTES", 
			"COMMA", "COLON", "SEMICOLON", "ASSIGN", "EQUALS", "NOT_EQUALS", "MORE_THAN", 
			"LESS_THAN", "INT", "FLOAT", "CHAR", "STRING", "NULL", "ID"
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
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(LangParser.MAIN, 0); }
		public TerminalNode L_BR() { return getToken(LangParser.L_BR, 0); }
		public TerminalNode R_BR() { return getToken(LangParser.R_BR, 0); }
		public TerminalNode NEWLINE() { return getToken(LangParser.NEWLINE, 0); }
		public TerminalNode END() { return getToken(LangParser.END, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUN_DECLARE) {
				{
				{
				setState(34);
				function();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(MAIN);
			setState(41);
			match(L_BR);
			setState(42);
			match(R_BR);
			setState(43);
			match(NEWLINE);
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				statement();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_FLOAT) | (1L << TYPE_CHAR) | (1L << TYPE_ARRAY) | (1L << TYPE_STRING) | (1L << FUN_PRINT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << ID))) != 0) );
			setState(49);
			match(END);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUN_DECLARE() { return getToken(LangParser.FUN_DECLARE, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode L_BR() { return getToken(LangParser.L_BR, 0); }
		public TerminalNode R_BR() { return getToken(LangParser.R_BR, 0); }
		public TerminalNode NEWLINE() { return getToken(LangParser.NEWLINE, 0); }
		public TerminalNode END() { return getToken(LangParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(FUN_DECLARE);
			setState(52);
			match(ID);
			setState(53);
			match(L_BR);
			setState(54);
			match(R_BR);
			setState(55);
			match(NEWLINE);
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				statement();
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_FLOAT) | (1L << TYPE_CHAR) | (1L << TYPE_ARRAY) | (1L << TYPE_STRING) | (1L << FUN_PRINT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << ID))) != 0) );
			setState(61);
			match(END);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(LangParser.NEWLINE, 0); }
		public Var_defineContext var_define() {
			return getRuleContext(Var_defineContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Fun_printContext fun_print() {
			return getRuleContext(Fun_printContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(63);
				var_define();
				}
				break;
			case 2:
				{
				setState(64);
				assign();
				}
				break;
			case 3:
				{
				setState(65);
				fun_print();
				}
				break;
			case 4:
				{
				setState(66);
				if_stat();
				}
				break;
			case 5:
				{
				setState(67);
				while_stat();
				}
				break;
			case 6:
				{
				setState(68);
				for_stat();
				}
				break;
			case 7:
				{
				setState(69);
				function_call();
				}
				break;
			}
			setState(72);
			match(NEWLINE);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode L_BR() { return getToken(LangParser.L_BR, 0); }
		public TerminalNode R_BR() { return getToken(LangParser.R_BR, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(ID);
			setState(75);
			match(L_BR);
			setState(76);
			match(R_BR);
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

	public static class Var_defineContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(LangParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(LangParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TYPE_ARRAY() { return getToken(LangParser.TYPE_ARRAY, 0); }
		public TerminalNode L_CBR() { return getToken(LangParser.L_CBR, 0); }
		public TerminalNode R_CBR() { return getToken(LangParser.R_CBR, 0); }
		public List<Var_valueContext> var_value() {
			return getRuleContexts(Var_valueContext.class);
		}
		public Var_valueContext var_value(int i) {
			return getRuleContext(Var_valueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public Var_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterVar_define(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitVar_define(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitVar_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defineContext var_define() throws RecognitionException {
		Var_defineContext _localctx = new Var_defineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_define);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_INT:
			case TYPE_FLOAT:
			case TYPE_CHAR:
			case TYPE_STRING:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(78);
				type();
				setState(79);
				match(ID);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ASSIGN) {
					{
					{
					setState(80);
					match(ASSIGN);
					setState(81);
					expr();
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case TYPE_ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(87);
				match(TYPE_ARRAY);
				setState(88);
				match(ID);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(89);
					match(ASSIGN);
					setState(90);
					match(L_CBR);
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING) | (1L << NULL) | (1L << ID))) != 0)) {
						{
						setState(91);
						var_value();
						}
					}

					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(94);
						match(COMMA);
						setState(95);
						var_value();
						}
						}
						setState(100);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(101);
					match(R_CBR);
					}
				}

				}
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE_INT() { return getToken(LangParser.TYPE_INT, 0); }
		public TerminalNode TYPE_STRING() { return getToken(LangParser.TYPE_STRING, 0); }
		public TerminalNode TYPE_CHAR() { return getToken(LangParser.TYPE_CHAR, 0); }
		public TerminalNode TYPE_FLOAT() { return getToken(LangParser.TYPE_FLOAT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_FLOAT) | (1L << TYPE_CHAR) | (1L << TYPE_STRING))) != 0)) ) {
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

	public static class Var_valueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LangParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(LangParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(LangParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(LangParser.NULL, 0); }
		public Var_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterVar_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitVar_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitVar_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_valueContext var_value() throws RecognitionException {
		Var_valueContext _localctx = new Var_valueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING) | (1L << NULL) | (1L << ID))) != 0)) ) {
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(ID);
			setState(111);
			match(ASSIGN);
			setState(112);
			expr();
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

	public static class Fun_printContext extends ParserRuleContext {
		public TerminalNode FUN_PRINT() { return getToken(LangParser.FUN_PRINT, 0); }
		public TerminalNode L_BR() { return getToken(LangParser.L_BR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BR() { return getToken(LangParser.R_BR, 0); }
		public Fun_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFun_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFun_print(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFun_print(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_printContext fun_print() throws RecognitionException {
		Fun_printContext _localctx = new Fun_printContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fun_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(FUN_PRINT);
			setState(115);
			match(L_BR);
			setState(116);
			expr();
			setState(117);
			match(R_BR);
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

	public static class If_statContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public List<TerminalNode> L_BR() { return getTokens(LangParser.L_BR); }
		public TerminalNode L_BR(int i) {
			return getToken(LangParser.L_BR, i);
		}
		public List<TerminalNode> R_BR() { return getTokens(LangParser.R_BR); }
		public TerminalNode R_BR(int i) {
			return getToken(LangParser.R_BR, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LangParser.NEWLINE, i);
		}
		public TerminalNode FI() { return getToken(LangParser.FI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(LangParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(LangParser.ELSE, i);
		}
		public List<TerminalNode> AND() { return getTokens(LangParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(LangParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(LangParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(LangParser.OR, i);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(IF);
			setState(120);
			match(L_BR);
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(121);
				expr();
				}
				break;
			case 2:
				{
				setState(122);
				comparison();
				}
				break;
			}
			setState(125);
			match(R_BR);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(126);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(127);
				match(L_BR);
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(128);
					expr();
					}
					break;
				case 2:
					{
					setState(129);
					comparison();
					}
					break;
				}
				setState(132);
				match(R_BR);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(NEWLINE);
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140);
				statement();
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_FLOAT) | (1L << TYPE_CHAR) | (1L << TYPE_ARRAY) | (1L << TYPE_STRING) | (1L << FUN_PRINT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << ID))) != 0) );
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(145);
				match(ELSE);
				setState(146);
				match(NEWLINE);
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(147);
					statement();
					}
					}
					setState(150); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_FLOAT) | (1L << TYPE_CHAR) | (1L << TYPE_ARRAY) | (1L << TYPE_STRING) | (1L << FUN_PRINT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << ID))) != 0) );
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(FI);
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LangParser.WHILE, 0); }
		public List<TerminalNode> L_BR() { return getTokens(LangParser.L_BR); }
		public TerminalNode L_BR(int i) {
			return getToken(LangParser.L_BR, i);
		}
		public List<TerminalNode> R_BR() { return getTokens(LangParser.R_BR); }
		public TerminalNode R_BR(int i) {
			return getToken(LangParser.R_BR, i);
		}
		public TerminalNode NEWLINE() { return getToken(LangParser.NEWLINE, 0); }
		public TerminalNode OD() { return getToken(LangParser.OD, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(LangParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(LangParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(LangParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(LangParser.OR, i);
		}
		public TerminalNode DO() { return getToken(LangParser.DO, 0); }
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_stat);
		int _la;
		try {
			int _alt;
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(159);
				match(WHILE);
				setState(160);
				match(L_BR);
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(161);
					expr();
					}
					break;
				case 2:
					{
					setState(162);
					comparison();
					}
					break;
				}
				setState(165);
				match(R_BR);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(166);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(167);
					match(L_BR);
					setState(170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(168);
						expr();
						}
						break;
					case 2:
						{
						setState(169);
						comparison();
						}
						break;
					}
					setState(172);
					match(R_BR);
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(179);
				match(NEWLINE);
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(180);
					statement();
					}
					}
					setState(183); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_FLOAT) | (1L << TYPE_CHAR) | (1L << TYPE_ARRAY) | (1L << TYPE_STRING) | (1L << FUN_PRINT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << ID))) != 0) );
				setState(185);
				match(OD);
				}
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(187);
				match(DO);
				setState(188);
				match(NEWLINE);
				setState(190); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(189);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(192); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(194);
				match(WHILE);
				setState(195);
				match(L_BR);
				setState(198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(196);
					expr();
					}
					break;
				case 2:
					{
					setState(197);
					comparison();
					}
					break;
				}
				setState(200);
				match(R_BR);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(201);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(202);
					match(L_BR);
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(203);
						expr();
						}
						break;
					case 2:
						{
						setState(204);
						comparison();
						}
						break;
					}
					setState(207);
					match(R_BR);
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class For_statContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LangParser.FOR, 0); }
		public TerminalNode L_BR() { return getToken(LangParser.L_BR, 0); }
		public For_exprContext for_expr() {
			return getRuleContext(For_exprContext.class,0);
		}
		public TerminalNode R_BR() { return getToken(LangParser.R_BR, 0); }
		public TerminalNode NEWLINE() { return getToken(LangParser.NEWLINE, 0); }
		public TerminalNode OD() { return getToken(LangParser.OD, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFor_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFor_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFor_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_for_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(FOR);
			setState(217);
			match(L_BR);
			setState(218);
			for_expr();
			setState(219);
			match(R_BR);
			setState(220);
			match(NEWLINE);
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				statement();
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_FLOAT) | (1L << TYPE_CHAR) | (1L << TYPE_ARRAY) | (1L << TYPE_STRING) | (1L << FUN_PRINT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << ID))) != 0) );
			setState(226);
			match(OD);
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

	public static class For_exprContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode TO() { return getToken(LangParser.TO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(LangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LangParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(LangParser.COLON, 0); }
		public For_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFor_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFor_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_exprContext for_expr() throws RecognitionException {
		For_exprContext _localctx = new For_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_expr);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				assign();
				setState(229);
				match(TO);
				setState(230);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(ID);
				setState(233);
				match(COLON);
				setState(234);
				match(ID);
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public List<MultContext> mult() {
			return getRuleContexts(MultContext.class);
		}
		public MultContext mult(int i) {
			return getRuleContext(MultContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(LangParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(LangParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(LangParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(LangParser.MINUS, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			mult();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(238);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(239);
				mult();
				}
				}
				setState(244);
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

	public static class MultContext extends ParserRuleContext {
		public List<SubexprContext> subexpr() {
			return getRuleContexts(SubexprContext.class);
		}
		public SubexprContext subexpr(int i) {
			return getRuleContext(SubexprContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(LangParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(LangParser.MULT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(LangParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(LangParser.DIVIDE, i);
		}
		public List<TerminalNode> MOD() { return getTokens(LangParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(LangParser.MOD, i);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			subexpr();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				{
				setState(246);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(247);
				subexpr();
				}
				}
				setState(252);
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

	public static class SubexprContext extends ParserRuleContext {
		public TerminalNode L_BR() { return getToken(LangParser.L_BR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BR() { return getToken(LangParser.R_BR, 0); }
		public Var_valueContext var_value() {
			return getRuleContext(Var_valueContext.class,0);
		}
		public SubexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterSubexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitSubexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitSubexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubexprContext subexpr() throws RecognitionException {
		SubexprContext _localctx = new SubexprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_subexpr);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_BR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(253);
				match(L_BR);
				setState(254);
				expr();
				setState(255);
				match(R_BR);
				}
				}
				break;
			case INT:
			case FLOAT:
			case CHAR:
			case STRING:
			case NULL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				var_value();
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(LangParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(LangParser.NOT_EQUALS, 0); }
		public TerminalNode MORE_THAN() { return getToken(LangParser.MORE_THAN, 0); }
		public TerminalNode LESS_THAN() { return getToken(LangParser.LESS_THAN, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			expr();
			setState(261);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOT_EQUALS) | (1L << MORE_THAN) | (1L << LESS_THAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(262);
			expr();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u010b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\2\3\2\3\2\6\2\60\n\2\r\2\16\2\61"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\6\3<\n\3\r\3\16\3=\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4I\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7"+
		"\6U\n\6\f\6\16\6X\13\6\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\6\3\6\7\6c\n\6\f"+
		"\6\16\6f\13\6\3\6\5\6i\n\6\5\6k\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13~\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0085\n\13\3\13\3\13\7\13\u0089\n\13\f\13\16\13\u008c\13\13"+
		"\3\13\3\13\6\13\u0090\n\13\r\13\16\13\u0091\3\13\3\13\3\13\6\13\u0097"+
		"\n\13\r\13\16\13\u0098\7\13\u009b\n\13\f\13\16\13\u009e\13\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\5\f\u00a6\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ad\n\f\3\f\3"+
		"\f\7\f\u00b1\n\f\f\f\16\f\u00b4\13\f\3\f\3\f\6\f\u00b8\n\f\r\f\16\f\u00b9"+
		"\3\f\3\f\3\f\3\f\3\f\6\f\u00c1\n\f\r\f\16\f\u00c2\3\f\3\f\3\f\3\f\5\f"+
		"\u00c9\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d0\n\f\3\f\3\f\7\f\u00d4\n\f\f\f"+
		"\16\f\u00d7\13\f\5\f\u00d9\n\f\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00e1\n\r\r"+
		"\r\16\r\u00e2\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ee\n"+
		"\16\3\17\3\17\3\17\7\17\u00f3\n\17\f\17\16\17\u00f6\13\17\3\20\3\20\3"+
		"\20\7\20\u00fb\n\20\f\20\16\20\u00fe\13\20\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u0105\n\21\3\22\3\22\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"\2\b\4\2\7\t\13\13\3\2+\60\3\2\23\24\3\2\31\32\3\2\33"+
		"\35\3\2\'*\2\u011b\2\'\3\2\2\2\4\65\3\2\2\2\6H\3\2\2\2\bL\3\2\2\2\nj\3"+
		"\2\2\2\fl\3\2\2\2\16n\3\2\2\2\20p\3\2\2\2\22t\3\2\2\2\24y\3\2\2\2\26\u00d8"+
		"\3\2\2\2\30\u00da\3\2\2\2\32\u00ed\3\2\2\2\34\u00ef\3\2\2\2\36\u00f7\3"+
		"\2\2\2 \u0104\3\2\2\2\"\u0106\3\2\2\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'"+
		"%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7\5\2\2+,\7 \2\2,-\7!\2\2"+
		"-/\7\3\2\2.\60\5\6\4\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2"+
		"\2\62\63\3\2\2\2\63\64\7\r\2\2\64\3\3\2\2\2\65\66\7\6\2\2\66\67\7\60\2"+
		"\2\678\7 \2\289\7!\2\29;\7\3\2\2:<\5\6\4\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2"+
		"\2=>\3\2\2\2>?\3\2\2\2?@\7\r\2\2@\5\3\2\2\2AI\5\n\6\2BI\5\20\t\2CI\5\22"+
		"\n\2DI\5\24\13\2EI\5\26\f\2FI\5\30\r\2GI\5\b\5\2HA\3\2\2\2HB\3\2\2\2H"+
		"C\3\2\2\2HD\3\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2IJ\3\2\2\2JK\7\3\2\2"+
		"K\7\3\2\2\2LM\7\60\2\2MN\7 \2\2NO\7!\2\2O\t\3\2\2\2PQ\5\f\7\2QV\7\60\2"+
		"\2RS\7&\2\2SU\5\34\17\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2Wk\3\2"+
		"\2\2XV\3\2\2\2YZ\7\n\2\2Zh\7\60\2\2[\\\7&\2\2\\^\7\36\2\2]_\5\16\b\2^"+
		"]\3\2\2\2^_\3\2\2\2_d\3\2\2\2`a\7#\2\2ac\5\16\b\2b`\3\2\2\2cf\3\2\2\2"+
		"db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gi\7\37\2\2h[\3\2\2\2hi\3\2\2"+
		"\2ik\3\2\2\2jP\3\2\2\2jY\3\2\2\2k\13\3\2\2\2lm\t\2\2\2m\r\3\2\2\2no\t"+
		"\3\2\2o\17\3\2\2\2pq\7\60\2\2qr\7&\2\2rs\5\34\17\2s\21\3\2\2\2tu\7\f\2"+
		"\2uv\7 \2\2vw\5\34\17\2wx\7!\2\2x\23\3\2\2\2yz\7\16\2\2z}\7 \2\2{~\5\34"+
		"\17\2|~\5\"\22\2}{\3\2\2\2}|\3\2\2\2~\177\3\2\2\2\177\u008a\7!\2\2\u0080"+
		"\u0081\t\4\2\2\u0081\u0084\7 \2\2\u0082\u0085\5\34\17\2\u0083\u0085\5"+
		"\"\22\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\7!\2\2\u0087\u0089\3\2\2\2\u0088\u0080\3\2\2\2\u0089\u008c\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008f\7\3\2\2\u008e\u0090\5\6\4\2\u008f\u008e\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u009c\3\2\2\2\u0093\u0094\7\20\2\2\u0094\u0096\7\3\2\2\u0095\u0097\5"+
		"\6\4\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0093\3\2\2\2\u009b\u009e\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a0\7\17\2\2\u00a0\25\3\2\2\2\u00a1\u00a2\7\22"+
		"\2\2\u00a2\u00a5\7 \2\2\u00a3\u00a6\5\34\17\2\u00a4\u00a6\5\"\22\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00b2\7!"+
		"\2\2\u00a8\u00a9\t\4\2\2\u00a9\u00ac\7 \2\2\u00aa\u00ad\5\34\17\2\u00ab"+
		"\u00ad\5\"\22\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3"+
		"\2\2\2\u00ae\u00af\7!\2\2\u00af\u00b1\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\7\3\2\2\u00b6\u00b8\5\6\4\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\27\2\2\u00bc\u00d9\3\2\2\2\u00bd"+
		"\u00be\7\26\2\2\u00be\u00c0\7\3\2\2\u00bf\u00c1\5\6\4\2\u00c0\u00bf\3"+
		"\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\7\22\2\2\u00c5\u00c8\7 \2\2\u00c6\u00c9\5\34"+
		"\17\2\u00c7\u00c9\5\"\22\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00d5\7!\2\2\u00cb\u00cc\t\4\2\2\u00cc\u00cf\7 \2"+
		"\2\u00cd\u00d0\5\34\17\2\u00ce\u00d0\5\"\22\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7!\2\2\u00d2\u00d4\3\2"+
		"\2\2\u00d3\u00cb\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00a1\3\2"+
		"\2\2\u00d8\u00bd\3\2\2\2\u00d9\27\3\2\2\2\u00da\u00db\7\21\2\2\u00db\u00dc"+
		"\7 \2\2\u00dc\u00dd\5\32\16\2\u00dd\u00de\7!\2\2\u00de\u00e0\7\3\2\2\u00df"+
		"\u00e1\5\6\4\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7\27\2\2\u00e5"+
		"\31\3\2\2\2\u00e6\u00e7\5\20\t\2\u00e7\u00e8\7\30\2\2\u00e8\u00e9\5\34"+
		"\17\2\u00e9\u00ee\3\2\2\2\u00ea\u00eb\7\60\2\2\u00eb\u00ec\7$\2\2\u00ec"+
		"\u00ee\7\60\2\2\u00ed\u00e6\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ee\33\3\2\2"+
		"\2\u00ef\u00f4\5\36\20\2\u00f0\u00f1\t\5\2\2\u00f1\u00f3\5\36\20\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\35\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fc\5 \21\2\u00f8\u00f9"+
		"\t\6\2\2\u00f9\u00fb\5 \21\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\37\3\2\2\2\u00fe\u00fc\3\2\2"+
		"\2\u00ff\u0100\7 \2\2\u0100\u0101\5\34\17\2\u0101\u0102\7!\2\2\u0102\u0105"+
		"\3\2\2\2\u0103\u0105\5\16\b\2\u0104\u00ff\3\2\2\2\u0104\u0103\3\2\2\2"+
		"\u0105!\3\2\2\2\u0106\u0107\5\34\17\2\u0107\u0108\t\7\2\2\u0108\u0109"+
		"\5\34\17\2\u0109#\3\2\2\2\37\'\61=HV^dhj}\u0084\u008a\u0091\u0098\u009c"+
		"\u00a5\u00ac\u00b2\u00b9\u00c2\u00c8\u00cf\u00d5\u00d8\u00e2\u00ed\u00f4"+
		"\u00fc\u0104";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}