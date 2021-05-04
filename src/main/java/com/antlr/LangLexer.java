// Generated from D:/Û˜Â·‡/ﬂœ»—/myCompiler/src/grammar\Lang.g4 by ANTLR 4.9.1
package com.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEWLINE", "SPACE", "MAIN", "FUN_DECLARE", "TYPE_INT", "TYPE_FLOAT", 
			"TYPE_CHAR", "TYPE_ARRAY", "TYPE_STRING", "FUN_PRINT", "END", "IF", "FI", 
			"ELSE", "FOR", "WHILE", "AND", "OR", "NOT", "DO", "OD", "TO", "PLUS", 
			"MINUS", "MULT", "DIVIDE", "MOD", "L_CBR", "R_CBR", "L_BR", "R_BR", "QUOTES", 
			"COMMA", "COLON", "SEMICOLON", "ASSIGN", "EQUALS", "NOT_EQUALS", "MORE_THAN", 
			"LESS_THAN", "INT", "FLOAT", "CHAR", "STRING", "NULL", "ID"
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


	public LangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u011e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\5\2a\n\2\3\2\3\2\3\3\6\3f\n\3\r\3\16\3g"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3*\7*\u00f2\n*\f*\16*\u00f5\13*\5*\u00f7\n*\3+"+
		"\3+\3+\6+\u00fc\n+\r+\16+\u00fd\3,\5,\u0101\n,\3-\3-\3-\3-\7-\u0107\n"+
		"-\f-\16-\u010a\13-\3-\3-\3.\3.\3.\3.\3.\3/\3/\5/\u0115\n/\3/\3/\3/\7/"+
		"\u011a\n/\f/\16/\u011d\13/\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"\3\2\6\5\2\13\f\17\17\"\"\3\2\63;\3\2\62;\4\2C\\c|\2\u0129\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3`\3\2\2\2\5e\3\2\2\2\7k\3\2"+
		"\2\2\tp\3\2\2\2\13y\3\2\2\2\r}\3\2\2\2\17\u0083\3\2\2\2\21\u0088\3\2\2"+
		"\2\23\u008e\3\2\2\2\25\u0095\3\2\2\2\27\u009b\3\2\2\2\31\u009f\3\2\2\2"+
		"\33\u00a2\3\2\2\2\35\u00a5\3\2\2\2\37\u00aa\3\2\2\2!\u00ae\3\2\2\2#\u00b4"+
		"\3\2\2\2%\u00b8\3\2\2\2\'\u00bb\3\2\2\2)\u00bf\3\2\2\2+\u00c2\3\2\2\2"+
		"-\u00c5\3\2\2\2/\u00c8\3\2\2\2\61\u00ca\3\2\2\2\63\u00cc\3\2\2\2\65\u00ce"+
		"\3\2\2\2\67\u00d0\3\2\2\29\u00d2\3\2\2\2;\u00d4\3\2\2\2=\u00d6\3\2\2\2"+
		"?\u00d8\3\2\2\2A\u00da\3\2\2\2C\u00dc\3\2\2\2E\u00de\3\2\2\2G\u00e0\3"+
		"\2\2\2I\u00e2\3\2\2\2K\u00e4\3\2\2\2M\u00e7\3\2\2\2O\u00ea\3\2\2\2Q\u00ec"+
		"\3\2\2\2S\u00f6\3\2\2\2U\u00f8\3\2\2\2W\u0100\3\2\2\2Y\u0102\3\2\2\2["+
		"\u010d\3\2\2\2]\u0114\3\2\2\2_a\7\17\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2"+
		"bc\7\f\2\2c\4\3\2\2\2df\t\2\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2"+
		"\2hi\3\2\2\2ij\b\3\2\2j\6\3\2\2\2kl\7o\2\2lm\7c\2\2mn\7k\2\2no\7p\2\2"+
		"o\b\3\2\2\2pq\7h\2\2qr\7w\2\2rs\7p\2\2st\7e\2\2tu\7v\2\2uv\7k\2\2vw\7"+
		"q\2\2wx\7p\2\2x\n\3\2\2\2yz\7k\2\2z{\7p\2\2{|\7v\2\2|\f\3\2\2\2}~\7h\2"+
		"\2~\177\7n\2\2\177\u0080\7q\2\2\u0080\u0081\7c\2\2\u0081\u0082\7v\2\2"+
		"\u0082\16\3\2\2\2\u0083\u0084\7e\2\2\u0084\u0085\7j\2\2\u0085\u0086\7"+
		"c\2\2\u0086\u0087\7t\2\2\u0087\20\3\2\2\2\u0088\u0089\7c\2\2\u0089\u008a"+
		"\7t\2\2\u008a\u008b\7t\2\2\u008b\u008c\7c\2\2\u008c\u008d\7{\2\2\u008d"+
		"\22\3\2\2\2\u008e\u008f\7u\2\2\u008f\u0090\7v\2\2\u0090\u0091\7t\2\2\u0091"+
		"\u0092\7k\2\2\u0092\u0093\7p\2\2\u0093\u0094\7i\2\2\u0094\24\3\2\2\2\u0095"+
		"\u0096\7r\2\2\u0096\u0097\7t\2\2\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2"+
		"\u0099\u009a\7v\2\2\u009a\26\3\2\2\2\u009b\u009c\7g\2\2\u009c\u009d\7"+
		"p\2\2\u009d\u009e\7f\2\2\u009e\30\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1"+
		"\7h\2\2\u00a1\32\3\2\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4\7k\2\2\u00a4\34"+
		"\3\2\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7u\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\36\3\2\2\2\u00aa\u00ab\7h\2\2\u00ab\u00ac\7q\2\2\u00ac"+
		"\u00ad\7t\2\2\u00ad \3\2\2\2\u00ae\u00af\7y\2\2\u00af\u00b0\7j\2\2\u00b0"+
		"\u00b1\7k\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7g\2\2\u00b3\"\3\2\2\2\u00b4"+
		"\u00b5\7c\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7f\2\2\u00b7$\3\2\2\2\u00b8"+
		"\u00b9\7q\2\2\u00b9\u00ba\7t\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7p\2\2\u00bc"+
		"\u00bd\7q\2\2\u00bd\u00be\7v\2\2\u00be(\3\2\2\2\u00bf\u00c0\7f\2\2\u00c0"+
		"\u00c1\7q\2\2\u00c1*\3\2\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7f\2\2\u00c4"+
		",\3\2\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7q\2\2\u00c7.\3\2\2\2\u00c8\u00c9"+
		"\7-\2\2\u00c9\60\3\2\2\2\u00ca\u00cb\7/\2\2\u00cb\62\3\2\2\2\u00cc\u00cd"+
		"\7,\2\2\u00cd\64\3\2\2\2\u00ce\u00cf\7\61\2\2\u00cf\66\3\2\2\2\u00d0\u00d1"+
		"\7\'\2\2\u00d18\3\2\2\2\u00d2\u00d3\7]\2\2\u00d3:\3\2\2\2\u00d4\u00d5"+
		"\7_\2\2\u00d5<\3\2\2\2\u00d6\u00d7\7*\2\2\u00d7>\3\2\2\2\u00d8\u00d9\7"+
		"+\2\2\u00d9@\3\2\2\2\u00da\u00db\7$\2\2\u00dbB\3\2\2\2\u00dc\u00dd\7."+
		"\2\2\u00ddD\3\2\2\2\u00de\u00df\7<\2\2\u00dfF\3\2\2\2\u00e0\u00e1\7=\2"+
		"\2\u00e1H\3\2\2\2\u00e2\u00e3\7?\2\2\u00e3J\3\2\2\2\u00e4\u00e5\7?\2\2"+
		"\u00e5\u00e6\7?\2\2\u00e6L\3\2\2\2\u00e7\u00e8\7>\2\2\u00e8\u00e9\7@\2"+
		"\2\u00e9N\3\2\2\2\u00ea\u00eb\7@\2\2\u00ebP\3\2\2\2\u00ec\u00ed\7>\2\2"+
		"\u00edR\3\2\2\2\u00ee\u00f7\7\62\2\2\u00ef\u00f3\t\3\2\2\u00f0\u00f2\t"+
		"\4\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00ee\3\2"+
		"\2\2\u00f6\u00ef\3\2\2\2\u00f7T\3\2\2\2\u00f8\u00f9\5S*\2\u00f9\u00fb"+
		"\7\60\2\2\u00fa\u00fc\t\4\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2"+
		"\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00feV\3\2\2\2\u00ff\u0101\t"+
		"\5\2\2\u0100\u00ff\3\2\2\2\u0101X\3\2\2\2\u0102\u0108\5A!\2\u0103\u0107"+
		"\5W,\2\u0104\u0107\5S*\2\u0105\u0107\7\"\2\2\u0106\u0103\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010c\5A!\2\u010cZ\3\2\2\2\u010d\u010e\7p\2\2\u010e\u010f\7w\2\2\u010f"+
		"\u0110\7n\2\2\u0110\u0111\7n\2\2\u0111\\\3\2\2\2\u0112\u0115\5W,\2\u0113"+
		"\u0115\7a\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u011b\3\2"+
		"\2\2\u0116\u011a\5W,\2\u0117\u011a\5S*\2\u0118\u011a\7a\2\2\u0119\u0116"+
		"\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c^\3\2\2\2\u011d\u011b\3\2\2\2"+
		"\16\2`g\u00f3\u00f6\u00fd\u0100\u0106\u0108\u0114\u0119\u011b\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}