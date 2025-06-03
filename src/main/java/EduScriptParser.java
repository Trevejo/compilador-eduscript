// Generated from EduScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EduScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMA=1, FIMPROGRAMA=2, FUNCAO=3, PROCEDIMENTO=4, INICIO=5, FIM=6, 
		VAR=7, CONST=8, SE=9, ENTAO=10, SENAO=11, FIMSE=12, ENQUANTO=13, FACA=14, 
		FIMENQUANTO=15, PARA=16, ATE=17, PASSO=18, FIMPARA=19, LER=20, ESCREVER=21, 
		RETORNAR=22, REF=23, ARRAY=24, DE=25, REGISTRO=26, FIMREGISTRO=27, INTEIRO=28, 
		REAL=29, LOGICO=30, TEXTO=31, E=32, OU=33, NAO=34, IGUAL=35, DIFERENTE=36, 
		MENOR=37, MENORIGUAL=38, MAIOR=39, MAIORIGUAL=40, MAIS=41, MENOS=42, MULTIPLICACAO=43, 
		DIVISAO=44, RESTO=45, LPAREN=46, RPAREN=47, LBRACKET=48, RBRACKET=49, 
		COMMA=50, SEMICOLON=51, COLON=52, NUMERO_INTEIRO=53, NUMERO_REAL=54, STRING=55, 
		BOOLEAN=56, ID=57, COMENTARIO_LINHA=58, COMENTARIO_BLOCO=59, WS=60;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_funcao = 2, RULE_procedimento = 3, 
		RULE_parametros = 4, RULE_parametro = 5, RULE_declaracaoVar = 6, RULE_listaVar = 7, 
		RULE_declaracaoConst = 8, RULE_bloco = 9, RULE_comandos = 10, RULE_comando = 11, 
		RULE_atribuicao = 12, RULE_chamadaFuncao = 13, RULE_argumentos = 14, RULE_condicional = 15, 
		RULE_laco = 16, RULE_lacoEnquanto = 17, RULE_lacoPara = 18, RULE_entrada = 19, 
		RULE_saida = 20, RULE_listaExpressoes = 21, RULE_retorno = 22, RULE_expressao = 23, 
		RULE_expressaoLogica = 24, RULE_expressaoRelacional = 25, RULE_expressaoAritmetica = 26, 
		RULE_termo = 27, RULE_fator = 28, RULE_operadorLogico = 29, RULE_operadorRelacional = 30, 
		RULE_operadorAditivo = 31, RULE_operadorMultiplicativo = 32, RULE_operadorUnario = 33, 
		RULE_literal = 34, RULE_tipo = 35, RULE_tipoBasico = 36, RULE_tipoArray = 37, 
		RULE_tipoRegistro = 38, RULE_camposRegistro = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "funcao", "procedimento", "parametros", "parametro", 
			"declaracaoVar", "listaVar", "declaracaoConst", "bloco", "comandos", 
			"comando", "atribuicao", "chamadaFuncao", "argumentos", "condicional", 
			"laco", "lacoEnquanto", "lacoPara", "entrada", "saida", "listaExpressoes", 
			"retorno", "expressao", "expressaoLogica", "expressaoRelacional", "expressaoAritmetica", 
			"termo", "fator", "operadorLogico", "operadorRelacional", "operadorAditivo", 
			"operadorMultiplicativo", "operadorUnario", "literal", "tipo", "tipoBasico", 
			"tipoArray", "tipoRegistro", "camposRegistro"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprograma'", "'funcao'", "'procedimento'", "'inicio'", 
			"'fim'", "'var'", "'const'", "'se'", "'entao'", "'senao'", "'fimse'", 
			"'enquanto'", "'faca'", "'fimenquanto'", "'para'", "'ate'", "'passo'", 
			"'fimpara'", "'ler'", "'escrever'", "'retornar'", "'ref'", "'array'", 
			"'de'", "'registro'", "'fimregistro'", "'inteiro'", "'real'", "'logico'", 
			"'texto'", "'e'", "'ou'", "'nao'", "'='", "'<>'", "'<'", "'<='", "'>'", 
			"'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'['", "']'", 
			"','", "';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAMA", "FIMPROGRAMA", "FUNCAO", "PROCEDIMENTO", "INICIO", 
			"FIM", "VAR", "CONST", "SE", "ENTAO", "SENAO", "FIMSE", "ENQUANTO", "FACA", 
			"FIMENQUANTO", "PARA", "ATE", "PASSO", "FIMPARA", "LER", "ESCREVER", 
			"RETORNAR", "REF", "ARRAY", "DE", "REGISTRO", "FIMREGISTRO", "INTEIRO", 
			"REAL", "LOGICO", "TEXTO", "E", "OU", "NAO", "IGUAL", "DIFERENTE", "MENOR", 
			"MENORIGUAL", "MAIOR", "MAIORIGUAL", "MAIS", "MENOS", "MULTIPLICACAO", 
			"DIVISAO", "RESTO", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "COMMA", 
			"SEMICOLON", "COLON", "NUMERO_INTEIRO", "NUMERO_REAL", "STRING", "BOOLEAN", 
			"ID", "COMENTARIO_LINHA", "COMENTARIO_BLOCO", "WS"
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
	public String getGrammarFileName() { return "EduScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EduScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(EduScriptParser.PROGRAMA, 0); }
		public TerminalNode ID() { return getToken(EduScriptParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(EduScriptParser.SEMICOLON, 0); }
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FIMPROGRAMA() { return getToken(EduScriptParser.FIMPROGRAMA, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(PROGRAMA);
			setState(81);
			match(ID);
			setState(82);
			match(SEMICOLON);
			setState(83);
			declaracoes();
			setState(84);
			bloco();
			setState(85);
			match(FIMPROGRAMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracoesContext extends ParserRuleContext {
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public List<ProcedimentoContext> procedimento() {
			return getRuleContexts(ProcedimentoContext.class);
		}
		public ProcedimentoContext procedimento(int i) {
			return getRuleContext(ProcedimentoContext.class,i);
		}
		public List<DeclaracaoVarContext> declaracaoVar() {
			return getRuleContexts(DeclaracaoVarContext.class);
		}
		public DeclaracaoVarContext declaracaoVar(int i) {
			return getRuleContext(DeclaracaoVarContext.class,i);
		}
		public List<DeclaracaoConstContext> declaracaoConst() {
			return getRuleContexts(DeclaracaoConstContext.class);
		}
		public DeclaracaoConstContext declaracaoConst(int i) {
			return getRuleContext(DeclaracaoConstContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 408L) != 0)) {
				{
				setState(91);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNCAO:
					{
					setState(87);
					funcao();
					}
					break;
				case PROCEDIMENTO:
					{
					setState(88);
					procedimento();
					}
					break;
				case VAR:
					{
					setState(89);
					declaracaoVar();
					}
					break;
				case CONST:
					{
					setState(90);
					declaracaoConst();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(95);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode FUNCAO() { return getToken(EduScriptParser.FUNCAO, 0); }
		public TerminalNode ID() { return getToken(EduScriptParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(EduScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EduScriptParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(EduScriptParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode INICIO() { return getToken(EduScriptParser.INICIO, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FIM() { return getToken(EduScriptParser.FIM, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(FUNCAO);
			setState(97);
			match(ID);
			setState(98);
			match(LPAREN);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF || _la==ID) {
				{
				setState(99);
				parametros();
				}
			}

			setState(102);
			match(RPAREN);
			setState(103);
			match(COLON);
			setState(104);
			tipo();
			setState(105);
			match(INICIO);
			setState(106);
			comandos();
			setState(107);
			match(FIM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedimentoContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(EduScriptParser.PROCEDIMENTO, 0); }
		public TerminalNode ID() { return getToken(EduScriptParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(EduScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EduScriptParser.RPAREN, 0); }
		public TerminalNode INICIO() { return getToken(EduScriptParser.INICIO, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FIM() { return getToken(EduScriptParser.FIM, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ProcedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterProcedimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitProcedimento(this);
		}
	}

	public final ProcedimentoContext procedimento() throws RecognitionException {
		ProcedimentoContext _localctx = new ProcedimentoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procedimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(PROCEDIMENTO);
			setState(110);
			match(ID);
			setState(111);
			match(LPAREN);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF || _la==ID) {
				{
				setState(112);
				parametros();
				}
			}

			setState(115);
			match(RPAREN);
			setState(116);
			match(INICIO);
			setState(117);
			comandos();
			setState(118);
			match(FIM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EduScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EduScriptParser.COMMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			parametro();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(121);
				match(COMMA);
				setState(122);
				parametro();
				}
				}
				setState(127);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EduScriptParser.ID, 0); }
		public TerminalNode COLON() { return getToken(EduScriptParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode REF() { return getToken(EduScriptParser.REF, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF) {
				{
				setState(128);
				match(REF);
				}
			}

			setState(131);
			match(ID);
			setState(132);
			match(COLON);
			setState(133);
			tipo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoVarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(EduScriptParser.VAR, 0); }
		public ListaVarContext listaVar() {
			return getRuleContext(ListaVarContext.class,0);
		}
		public TerminalNode COLON() { return getToken(EduScriptParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EduScriptParser.SEMICOLON, 0); }
		public DeclaracaoVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterDeclaracaoVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitDeclaracaoVar(this);
		}
	}

	public final DeclaracaoVarContext declaracaoVar() throws RecognitionException {
		DeclaracaoVarContext _localctx = new DeclaracaoVarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracaoVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(VAR);
			setState(136);
			listaVar();
			setState(137);
			match(COLON);
			setState(138);
			tipo();
			setState(139);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaVarContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(EduScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EduScriptParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EduScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EduScriptParser.COMMA, i);
		}
		public ListaVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterListaVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitListaVar(this);
		}
	}

	public final ListaVarContext listaVar() throws RecognitionException {
		ListaVarContext _localctx = new ListaVarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listaVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ID);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(142);
				match(COMMA);
				setState(143);
				match(ID);
				}
				}
				setState(148);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoConstContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(EduScriptParser.CONST, 0); }
		public TerminalNode ID() { return getToken(EduScriptParser.ID, 0); }
		public TerminalNode COLON() { return getToken(EduScriptParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(EduScriptParser.IGUAL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EduScriptParser.SEMICOLON, 0); }
		public DeclaracaoConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterDeclaracaoConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitDeclaracaoConst(this);
		}
	}

	public final DeclaracaoConstContext declaracaoConst() throws RecognitionException {
		DeclaracaoConstContext _localctx = new DeclaracaoConstContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracaoConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(CONST);
			setState(150);
			match(ID);
			setState(151);
			match(COLON);
			setState(152);
			tipo();
			setState(153);
			match(IGUAL);
			setState(154);
			expressao();
			setState(155);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(EduScriptParser.INICIO, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(INICIO);
			setState(158);
			comandos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandosContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 144115188083270144L) != 0)) {
				{
				{
				setState(160);
				comando();
				}
				}
				setState(165);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EduScriptParser.SEMICOLON, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public LacoContext laco() {
			return getRuleContext(LacoContext.class,0);
		}
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public SaidaContext saida() {
			return getRuleContext(SaidaContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comando);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				chamadaFuncao();
				setState(168);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				condicional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				laco();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				entrada();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				saida();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				retorno();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EduScriptParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(EduScriptParser.IGUAL, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(EduScriptParser.SEMICOLON, 0); }
		public TerminalNode LBRACKET() { return getToken(EduScriptParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(EduScriptParser.RBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(EduScriptParser.COMMA, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ID);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(178);
				match(LBRACKET);
				setState(179);
				expressao();
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(180);
					match(COMMA);
					setState(181);
					expressao();
					}
				}

				setState(184);
				match(RBRACKET);
				}
			}

			setState(188);
			match(IGUAL);
			setState(189);
			expressao();
			setState(190);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChamadaFuncaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EduScriptParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(EduScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EduScriptParser.RPAREN, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public ChamadaFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitChamadaFuncao(this);
		}
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_chamadaFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(ID);
			setState(193);
			match(LPAREN);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 279300159890784256L) != 0)) {
				{
				setState(194);
				argumentos();
				}
			}

			setState(197);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EduScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EduScriptParser.COMMA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitArgumentos(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			expressao();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(200);
				match(COMMA);
				setState(201);
				expressao();
				}
				}
				setState(206);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(EduScriptParser.SE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(EduScriptParser.ENTAO, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public TerminalNode FIMSE() { return getToken(EduScriptParser.FIMSE, 0); }
		public TerminalNode SENAO() { return getToken(EduScriptParser.SENAO, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(SE);
			setState(208);
			expressao();
			setState(209);
			match(ENTAO);
			setState(210);
			comandos();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(211);
				match(SENAO);
				setState(212);
				comandos();
				}
			}

			setState(215);
			match(FIMSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LacoContext extends ParserRuleContext {
		public LacoEnquantoContext lacoEnquanto() {
			return getRuleContext(LacoEnquantoContext.class,0);
		}
		public LacoParaContext lacoPara() {
			return getRuleContext(LacoParaContext.class,0);
		}
		public LacoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_laco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterLaco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitLaco(this);
		}
	}

	public final LacoContext laco() throws RecognitionException {
		LacoContext _localctx = new LacoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_laco);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENQUANTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				lacoEnquanto();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				lacoPara();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LacoEnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(EduScriptParser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FACA() { return getToken(EduScriptParser.FACA, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FIMENQUANTO() { return getToken(EduScriptParser.FIMENQUANTO, 0); }
		public LacoEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lacoEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterLacoEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitLacoEnquanto(this);
		}
	}

	public final LacoEnquantoContext lacoEnquanto() throws RecognitionException {
		LacoEnquantoContext _localctx = new LacoEnquantoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lacoEnquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(ENQUANTO);
			setState(222);
			expressao();
			setState(223);
			match(FACA);
			setState(224);
			comandos();
			setState(225);
			match(FIMENQUANTO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LacoParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(EduScriptParser.PARA, 0); }
		public TerminalNode ID() { return getToken(EduScriptParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(EduScriptParser.IGUAL, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode ATE() { return getToken(EduScriptParser.ATE, 0); }
		public TerminalNode FACA() { return getToken(EduScriptParser.FACA, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FIMPARA() { return getToken(EduScriptParser.FIMPARA, 0); }
		public TerminalNode PASSO() { return getToken(EduScriptParser.PASSO, 0); }
		public LacoParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lacoPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterLacoPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitLacoPara(this);
		}
	}

	public final LacoParaContext lacoPara() throws RecognitionException {
		LacoParaContext _localctx = new LacoParaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lacoPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(PARA);
			setState(228);
			match(ID);
			setState(229);
			match(IGUAL);
			setState(230);
			expressao();
			setState(231);
			match(ATE);
			setState(232);
			expressao();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PASSO) {
				{
				setState(233);
				match(PASSO);
				setState(234);
				expressao();
				}
			}

			setState(237);
			match(FACA);
			setState(238);
			comandos();
			setState(239);
			match(FIMPARA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EntradaContext extends ParserRuleContext {
		public TerminalNode LER() { return getToken(EduScriptParser.LER, 0); }
		public TerminalNode LPAREN() { return getToken(EduScriptParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(EduScriptParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(EduScriptParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(EduScriptParser.SEMICOLON, 0); }
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitEntrada(this);
		}
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(LER);
			setState(242);
			match(LPAREN);
			setState(243);
			match(ID);
			setState(244);
			match(RPAREN);
			setState(245);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SaidaContext extends ParserRuleContext {
		public TerminalNode ESCREVER() { return getToken(EduScriptParser.ESCREVER, 0); }
		public TerminalNode LPAREN() { return getToken(EduScriptParser.LPAREN, 0); }
		public ListaExpressoesContext listaExpressoes() {
			return getRuleContext(ListaExpressoesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EduScriptParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(EduScriptParser.SEMICOLON, 0); }
		public SaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitSaida(this);
		}
	}

	public final SaidaContext saida() throws RecognitionException {
		SaidaContext _localctx = new SaidaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_saida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(ESCREVER);
			setState(248);
			match(LPAREN);
			setState(249);
			listaExpressoes();
			setState(250);
			match(RPAREN);
			setState(251);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaExpressoesContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EduScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EduScriptParser.COMMA, i);
		}
		public ListaExpressoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExpressoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterListaExpressoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitListaExpressoes(this);
		}
	}

	public final ListaExpressoesContext listaExpressoes() throws RecognitionException {
		ListaExpressoesContext _localctx = new ListaExpressoesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_listaExpressoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			expressao();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(254);
				match(COMMA);
				setState(255);
				expressao();
				}
				}
				setState(260);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETORNAR() { return getToken(EduScriptParser.RETORNAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(EduScriptParser.SEMICOLON, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_retorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(RETORNAR);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 279300159890784256L) != 0)) {
				{
				setState(262);
				expressao();
				}
			}

			setState(265);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			expressaoLogica();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoLogicaContext extends ParserRuleContext {
		public List<ExpressaoRelacionalContext> expressaoRelacional() {
			return getRuleContexts(ExpressaoRelacionalContext.class);
		}
		public ExpressaoRelacionalContext expressaoRelacional(int i) {
			return getRuleContext(ExpressaoRelacionalContext.class,i);
		}
		public List<OperadorLogicoContext> operadorLogico() {
			return getRuleContexts(OperadorLogicoContext.class);
		}
		public OperadorLogicoContext operadorLogico(int i) {
			return getRuleContext(OperadorLogicoContext.class,i);
		}
		public ExpressaoLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterExpressaoLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitExpressaoLogica(this);
		}
	}

	public final ExpressaoLogicaContext expressaoLogica() throws RecognitionException {
		ExpressaoLogicaContext _localctx = new ExpressaoLogicaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressaoLogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			expressaoRelacional();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==E || _la==OU) {
				{
				{
				setState(270);
				operadorLogico();
				setState(271);
				expressaoRelacional();
				}
				}
				setState(277);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoRelacionalContext extends ParserRuleContext {
		public List<ExpressaoAritmeticaContext> expressaoAritmetica() {
			return getRuleContexts(ExpressaoAritmeticaContext.class);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica(int i) {
			return getRuleContext(ExpressaoAritmeticaContext.class,i);
		}
		public OperadorRelacionalContext operadorRelacional() {
			return getRuleContext(OperadorRelacionalContext.class,0);
		}
		public ExpressaoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterExpressaoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitExpressaoRelacional(this);
		}
	}

	public final ExpressaoRelacionalContext expressaoRelacional() throws RecognitionException {
		ExpressaoRelacionalContext _localctx = new ExpressaoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expressaoRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			expressaoAritmetica();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2164663517184L) != 0)) {
				{
				setState(279);
				operadorRelacional();
				setState(280);
				expressaoAritmetica();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<OperadorAditivoContext> operadorAditivo() {
			return getRuleContexts(OperadorAditivoContext.class);
		}
		public OperadorAditivoContext operadorAditivo(int i) {
			return getRuleContext(OperadorAditivoContext.class,i);
		}
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitExpressaoAritmetica(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressaoAritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			termo();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAIS || _la==MENOS) {
				{
				{
				setState(285);
				operadorAditivo();
				setState(286);
				termo();
				}
				}
				setState(292);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<OperadorMultiplicativoContext> operadorMultiplicativo() {
			return getRuleContexts(OperadorMultiplicativoContext.class);
		}
		public OperadorMultiplicativoContext operadorMultiplicativo(int i) {
			return getRuleContext(OperadorMultiplicativoContext.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			fator();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61572651155456L) != 0)) {
				{
				{
				setState(294);
				operadorMultiplicativo();
				setState(295);
				fator();
				}
				}
				setState(301);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EduScriptParser.LPAREN, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(EduScriptParser.RPAREN, 0); }
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public TerminalNode ID() { return getToken(EduScriptParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(EduScriptParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(EduScriptParser.RBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(EduScriptParser.COMMA, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperadorUnarioContext operadorUnario() {
			return getRuleContext(OperadorUnarioContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fator);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(LPAREN);
				setState(303);
				expressao();
				setState(304);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				chamadaFuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(ID);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(308);
					match(LBRACKET);
					setState(309);
					expressao();
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(310);
						match(COMMA);
						setState(311);
						expressao();
						}
					}

					setState(314);
					match(RBRACKET);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(319);
				operadorUnario();
				setState(320);
				fator();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorLogicoContext extends ParserRuleContext {
		public TerminalNode E() { return getToken(EduScriptParser.E, 0); }
		public TerminalNode OU() { return getToken(EduScriptParser.OU, 0); }
		public OperadorLogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorLogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterOperadorLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitOperadorLogico(this);
		}
	}

	public final OperadorLogicoContext operadorLogico() throws RecognitionException {
		OperadorLogicoContext _localctx = new OperadorLogicoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operadorLogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if ( !(_la==E || _la==OU) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorRelacionalContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(EduScriptParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(EduScriptParser.DIFERENTE, 0); }
		public TerminalNode MENOR() { return getToken(EduScriptParser.MENOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(EduScriptParser.MENORIGUAL, 0); }
		public TerminalNode MAIOR() { return getToken(EduScriptParser.MAIOR, 0); }
		public TerminalNode MAIORIGUAL() { return getToken(EduScriptParser.MAIORIGUAL, 0); }
		public OperadorRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterOperadorRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitOperadorRelacional(this);
		}
	}

	public final OperadorRelacionalContext operadorRelacional() throws RecognitionException {
		OperadorRelacionalContext _localctx = new OperadorRelacionalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_operadorRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2164663517184L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorAditivoContext extends ParserRuleContext {
		public TerminalNode MAIS() { return getToken(EduScriptParser.MAIS, 0); }
		public TerminalNode MENOS() { return getToken(EduScriptParser.MENOS, 0); }
		public OperadorAditivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorAditivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterOperadorAditivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitOperadorAditivo(this);
		}
	}

	public final OperadorAditivoContext operadorAditivo() throws RecognitionException {
		OperadorAditivoContext _localctx = new OperadorAditivoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_operadorAditivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if ( !(_la==MAIS || _la==MENOS) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorMultiplicativoContext extends ParserRuleContext {
		public TerminalNode MULTIPLICACAO() { return getToken(EduScriptParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVISAO() { return getToken(EduScriptParser.DIVISAO, 0); }
		public TerminalNode RESTO() { return getToken(EduScriptParser.RESTO, 0); }
		public OperadorMultiplicativoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorMultiplicativo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterOperadorMultiplicativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitOperadorMultiplicativo(this);
		}
	}

	public final OperadorMultiplicativoContext operadorMultiplicativo() throws RecognitionException {
		OperadorMultiplicativoContext _localctx = new OperadorMultiplicativoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operadorMultiplicativo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61572651155456L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorUnarioContext extends ParserRuleContext {
		public TerminalNode MAIS() { return getToken(EduScriptParser.MAIS, 0); }
		public TerminalNode MENOS() { return getToken(EduScriptParser.MENOS, 0); }
		public TerminalNode NAO() { return getToken(EduScriptParser.NAO, 0); }
		public OperadorUnarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorUnario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterOperadorUnario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitOperadorUnario(this);
		}
	}

	public final OperadorUnarioContext operadorUnario() throws RecognitionException {
		OperadorUnarioContext _localctx = new OperadorUnarioContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operadorUnario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6614249635840L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMERO_INTEIRO() { return getToken(EduScriptParser.NUMERO_INTEIRO, 0); }
		public TerminalNode NUMERO_REAL() { return getToken(EduScriptParser.NUMERO_REAL, 0); }
		public TerminalNode STRING() { return getToken(EduScriptParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(EduScriptParser.BOOLEAN, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 135107988821114880L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoBasicoContext tipoBasico() {
			return getRuleContext(TipoBasicoContext.class,0);
		}
		public TipoArrayContext tipoArray() {
			return getRuleContext(TipoArrayContext.class,0);
		}
		public TipoRegistroContext tipoRegistro() {
			return getRuleContext(TipoRegistroContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tipo);
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEIRO:
			case REAL:
			case LOGICO:
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				tipoBasico();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				tipoArray();
				}
				break;
			case REGISTRO:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				tipoRegistro();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoBasicoContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(EduScriptParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(EduScriptParser.REAL, 0); }
		public TerminalNode LOGICO() { return getToken(EduScriptParser.LOGICO, 0); }
		public TerminalNode TEXTO() { return getToken(EduScriptParser.TEXTO, 0); }
		public TipoBasicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoBasico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterTipoBasico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitTipoBasico(this);
		}
	}

	public final TipoBasicoContext tipoBasico() throws RecognitionException {
		TipoBasicoContext _localctx = new TipoBasicoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tipoBasico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4026531840L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoArrayContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(EduScriptParser.ARRAY, 0); }
		public TerminalNode LBRACKET() { return getToken(EduScriptParser.LBRACKET, 0); }
		public List<TerminalNode> NUMERO_INTEIRO() { return getTokens(EduScriptParser.NUMERO_INTEIRO); }
		public TerminalNode NUMERO_INTEIRO(int i) {
			return getToken(EduScriptParser.NUMERO_INTEIRO, i);
		}
		public TerminalNode RBRACKET() { return getToken(EduScriptParser.RBRACKET, 0); }
		public TerminalNode DE() { return getToken(EduScriptParser.DE, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(EduScriptParser.COMMA, 0); }
		public TipoArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterTipoArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitTipoArray(this);
		}
	}

	public final TipoArrayContext tipoArray() throws RecognitionException {
		TipoArrayContext _localctx = new TipoArrayContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tipoArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(ARRAY);
			setState(344);
			match(LBRACKET);
			setState(345);
			match(NUMERO_INTEIRO);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(346);
				match(COMMA);
				setState(347);
				match(NUMERO_INTEIRO);
				}
			}

			setState(350);
			match(RBRACKET);
			setState(351);
			match(DE);
			setState(352);
			tipo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoRegistroContext extends ParserRuleContext {
		public TerminalNode REGISTRO() { return getToken(EduScriptParser.REGISTRO, 0); }
		public CamposRegistroContext camposRegistro() {
			return getRuleContext(CamposRegistroContext.class,0);
		}
		public TerminalNode FIMREGISTRO() { return getToken(EduScriptParser.FIMREGISTRO, 0); }
		public TipoRegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoRegistro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterTipoRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitTipoRegistro(this);
		}
	}

	public final TipoRegistroContext tipoRegistro() throws RecognitionException {
		TipoRegistroContext _localctx = new TipoRegistroContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tipoRegistro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(REGISTRO);
			setState(355);
			camposRegistro();
			setState(356);
			match(FIMREGISTRO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CamposRegistroContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(EduScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EduScriptParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(EduScriptParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(EduScriptParser.COLON, i);
		}
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(EduScriptParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(EduScriptParser.SEMICOLON, i);
		}
		public CamposRegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_camposRegistro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).enterCamposRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EduScriptListener ) ((EduScriptListener)listener).exitCamposRegistro(this);
		}
	}

	public final CamposRegistroContext camposRegistro() throws RecognitionException {
		CamposRegistroContext _localctx = new CamposRegistroContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_camposRegistro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(358);
				match(ID);
				setState(359);
				match(COLON);
				setState(360);
				tipo();
				setState(361);
				match(SEMICOLON);
				}
				}
				setState(365); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
		"\u0004\u0001<\u0170\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\\\b"+
		"\u0001\n\u0001\f\u0001_\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002e\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003r\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004|\b\u0004\n\u0004\f\u0004\u007f\t\u0004\u0001\u0005\u0003\u0005"+
		"\u0082\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u0091\b\u0007\n\u0007\f\u0007\u0094"+
		"\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\n\u0005\n\u00a2\b\n\n\n\f\n\u00a5\t\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00b0\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00b7\b\f\u0001\f\u0001\f\u0003"+
		"\f\u00bb\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00c4\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00cb\b\u000e\n\u000e\f\u000e\u00ce\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d6\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00dc\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00ec\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u0101\b\u0015\n\u0015\f\u0015\u0104\t\u0015\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0108\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0112\b\u0018\n"+
		"\u0018\f\u0018\u0115\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u011b\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u0121\b\u001a\n\u001a\f\u001a\u0124\t\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u012a\b\u001b\n\u001b"+
		"\f\u001b\u012d\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0139\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u013d\b"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0143"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0003#\u0154\b#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u015d\b%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0004\'\u016c\b\'\u000b\'\f\'\u016d"+
		"\u0001\'\u0000\u0000(\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLN\u0000\u0007"+
		"\u0001\u0000 !\u0001\u0000#(\u0001\u0000)*\u0001\u0000+-\u0002\u0000\""+
		"\")*\u0001\u000058\u0001\u0000\u001c\u001f\u016e\u0000P\u0001\u0000\u0000"+
		"\u0000\u0002]\u0001\u0000\u0000\u0000\u0004`\u0001\u0000\u0000\u0000\u0006"+
		"m\u0001\u0000\u0000\u0000\bx\u0001\u0000\u0000\u0000\n\u0081\u0001\u0000"+
		"\u0000\u0000\f\u0087\u0001\u0000\u0000\u0000\u000e\u008d\u0001\u0000\u0000"+
		"\u0000\u0010\u0095\u0001\u0000\u0000\u0000\u0012\u009d\u0001\u0000\u0000"+
		"\u0000\u0014\u00a3\u0001\u0000\u0000\u0000\u0016\u00af\u0001\u0000\u0000"+
		"\u0000\u0018\u00b1\u0001\u0000\u0000\u0000\u001a\u00c0\u0001\u0000\u0000"+
		"\u0000\u001c\u00c7\u0001\u0000\u0000\u0000\u001e\u00cf\u0001\u0000\u0000"+
		"\u0000 \u00db\u0001\u0000\u0000\u0000\"\u00dd\u0001\u0000\u0000\u0000"+
		"$\u00e3\u0001\u0000\u0000\u0000&\u00f1\u0001\u0000\u0000\u0000(\u00f7"+
		"\u0001\u0000\u0000\u0000*\u00fd\u0001\u0000\u0000\u0000,\u0105\u0001\u0000"+
		"\u0000\u0000.\u010b\u0001\u0000\u0000\u00000\u010d\u0001\u0000\u0000\u0000"+
		"2\u0116\u0001\u0000\u0000\u00004\u011c\u0001\u0000\u0000\u00006\u0125"+
		"\u0001\u0000\u0000\u00008\u0142\u0001\u0000\u0000\u0000:\u0144\u0001\u0000"+
		"\u0000\u0000<\u0146\u0001\u0000\u0000\u0000>\u0148\u0001\u0000\u0000\u0000"+
		"@\u014a\u0001\u0000\u0000\u0000B\u014c\u0001\u0000\u0000\u0000D\u014e"+
		"\u0001\u0000\u0000\u0000F\u0153\u0001\u0000\u0000\u0000H\u0155\u0001\u0000"+
		"\u0000\u0000J\u0157\u0001\u0000\u0000\u0000L\u0162\u0001\u0000\u0000\u0000"+
		"N\u016b\u0001\u0000\u0000\u0000PQ\u0005\u0001\u0000\u0000QR\u00059\u0000"+
		"\u0000RS\u00053\u0000\u0000ST\u0003\u0002\u0001\u0000TU\u0003\u0012\t"+
		"\u0000UV\u0005\u0002\u0000\u0000V\u0001\u0001\u0000\u0000\u0000W\\\u0003"+
		"\u0004\u0002\u0000X\\\u0003\u0006\u0003\u0000Y\\\u0003\f\u0006\u0000Z"+
		"\\\u0003\u0010\b\u0000[W\u0001\u0000\u0000\u0000[X\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\u0003\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0005\u0003\u0000\u0000"+
		"ab\u00059\u0000\u0000bd\u0005.\u0000\u0000ce\u0003\b\u0004\u0000dc\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"fg\u0005/\u0000\u0000gh\u00054\u0000\u0000hi\u0003F#\u0000ij\u0005\u0005"+
		"\u0000\u0000jk\u0003\u0014\n\u0000kl\u0005\u0006\u0000\u0000l\u0005\u0001"+
		"\u0000\u0000\u0000mn\u0005\u0004\u0000\u0000no\u00059\u0000\u0000oq\u0005"+
		".\u0000\u0000pr\u0003\b\u0004\u0000qp\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0005/\u0000\u0000tu\u0005"+
		"\u0005\u0000\u0000uv\u0003\u0014\n\u0000vw\u0005\u0006\u0000\u0000w\u0007"+
		"\u0001\u0000\u0000\u0000x}\u0003\n\u0005\u0000yz\u00052\u0000\u0000z|"+
		"\u0003\n\u0005\u0000{y\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\t\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0082\u0005\u0017\u0000"+
		"\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u00059\u0000\u0000"+
		"\u0084\u0085\u00054\u0000\u0000\u0085\u0086\u0003F#\u0000\u0086\u000b"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0007\u0000\u0000\u0088\u0089"+
		"\u0003\u000e\u0007\u0000\u0089\u008a\u00054\u0000\u0000\u008a\u008b\u0003"+
		"F#\u0000\u008b\u008c\u00053\u0000\u0000\u008c\r\u0001\u0000\u0000\u0000"+
		"\u008d\u0092\u00059\u0000\u0000\u008e\u008f\u00052\u0000\u0000\u008f\u0091"+
		"\u00059\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0094\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u000f\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005\b\u0000\u0000\u0096\u0097\u00059"+
		"\u0000\u0000\u0097\u0098\u00054\u0000\u0000\u0098\u0099\u0003F#\u0000"+
		"\u0099\u009a\u0005#\u0000\u0000\u009a\u009b\u0003.\u0017\u0000\u009b\u009c"+
		"\u00053\u0000\u0000\u009c\u0011\u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		"\u0005\u0000\u0000\u009e\u009f\u0003\u0014\n\u0000\u009f\u0013\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a2\u0003\u0016\u000b\u0000\u00a1\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u0015\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00b0\u0003\u0018"+
		"\f\u0000\u00a7\u00a8\u0003\u001a\r\u0000\u00a8\u00a9\u00053\u0000\u0000"+
		"\u00a9\u00b0\u0001\u0000\u0000\u0000\u00aa\u00b0\u0003\u001e\u000f\u0000"+
		"\u00ab\u00b0\u0003 \u0010\u0000\u00ac\u00b0\u0003&\u0013\u0000\u00ad\u00b0"+
		"\u0003(\u0014\u0000\u00ae\u00b0\u0003,\u0016\u0000\u00af\u00a6\u0001\u0000"+
		"\u0000\u0000\u00af\u00a7\u0001\u0000\u0000\u0000\u00af\u00aa\u0001\u0000"+
		"\u0000\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00af\u00ac\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b0\u0017\u0001\u0000\u0000\u0000\u00b1\u00ba\u00059\u0000"+
		"\u0000\u00b2\u00b3\u00050\u0000\u0000\u00b3\u00b6\u0003.\u0017\u0000\u00b4"+
		"\u00b5\u00052\u0000\u0000\u00b5\u00b7\u0003.\u0017\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u00051\u0000\u0000\u00b9\u00bb\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b2\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005#\u0000"+
		"\u0000\u00bd\u00be\u0003.\u0017\u0000\u00be\u00bf\u00053\u0000\u0000\u00bf"+
		"\u0019\u0001\u0000\u0000\u0000\u00c0\u00c1\u00059\u0000\u0000\u00c1\u00c3"+
		"\u0005.\u0000\u0000\u00c2\u00c4\u0003\u001c\u000e\u0000\u00c3\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0005/\u0000\u0000\u00c6\u001b\u0001\u0000"+
		"\u0000\u0000\u00c7\u00cc\u0003.\u0017\u0000\u00c8\u00c9\u00052\u0000\u0000"+
		"\u00c9\u00cb\u0003.\u0017\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u001d\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\t\u0000\u0000\u00d0\u00d1"+
		"\u0003.\u0017\u0000\u00d1\u00d2\u0005\n\u0000\u0000\u00d2\u00d5\u0003"+
		"\u0014\n\u0000\u00d3\u00d4\u0005\u000b\u0000\u0000\u00d4\u00d6\u0003\u0014"+
		"\n\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\f\u0000\u0000"+
		"\u00d8\u001f\u0001\u0000\u0000\u0000\u00d9\u00dc\u0003\"\u0011\u0000\u00da"+
		"\u00dc\u0003$\u0012\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc!\u0001\u0000\u0000\u0000\u00dd\u00de\u0005"+
		"\r\u0000\u0000\u00de\u00df\u0003.\u0017\u0000\u00df\u00e0\u0005\u000e"+
		"\u0000\u0000\u00e0\u00e1\u0003\u0014\n\u0000\u00e1\u00e2\u0005\u000f\u0000"+
		"\u0000\u00e2#\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u0010\u0000\u0000"+
		"\u00e4\u00e5\u00059\u0000\u0000\u00e5\u00e6\u0005#\u0000\u0000\u00e6\u00e7"+
		"\u0003.\u0017\u0000\u00e7\u00e8\u0005\u0011\u0000\u0000\u00e8\u00eb\u0003"+
		".\u0017\u0000\u00e9\u00ea\u0005\u0012\u0000\u0000\u00ea\u00ec\u0003.\u0017"+
		"\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u000e\u0000"+
		"\u0000\u00ee\u00ef\u0003\u0014\n\u0000\u00ef\u00f0\u0005\u0013\u0000\u0000"+
		"\u00f0%\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u0014\u0000\u0000\u00f2"+
		"\u00f3\u0005.\u0000\u0000\u00f3\u00f4\u00059\u0000\u0000\u00f4\u00f5\u0005"+
		"/\u0000\u0000\u00f5\u00f6\u00053\u0000\u0000\u00f6\'\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0005\u0015\u0000\u0000\u00f8\u00f9\u0005.\u0000\u0000"+
		"\u00f9\u00fa\u0003*\u0015\u0000\u00fa\u00fb\u0005/\u0000\u0000\u00fb\u00fc"+
		"\u00053\u0000\u0000\u00fc)\u0001\u0000\u0000\u0000\u00fd\u0102\u0003."+
		"\u0017\u0000\u00fe\u00ff\u00052\u0000\u0000\u00ff\u0101\u0003.\u0017\u0000"+
		"\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000"+
		"\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000"+
		"\u0103+\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105"+
		"\u0107\u0005\u0016\u0000\u0000\u0106\u0108\u0003.\u0017\u0000\u0107\u0106"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u00053\u0000\u0000\u010a-\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u00030\u0018\u0000\u010c/\u0001\u0000\u0000\u0000"+
		"\u010d\u0113\u00032\u0019\u0000\u010e\u010f\u0003:\u001d\u0000\u010f\u0110"+
		"\u00032\u0019\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u010e\u0001"+
		"\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u01141\u0001\u0000"+
		"\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u011a\u00034\u001a"+
		"\u0000\u0117\u0118\u0003<\u001e\u0000\u0118\u0119\u00034\u001a\u0000\u0119"+
		"\u011b\u0001\u0000\u0000\u0000\u011a\u0117\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b3\u0001\u0000\u0000\u0000\u011c\u0122"+
		"\u00036\u001b\u0000\u011d\u011e\u0003>\u001f\u0000\u011e\u011f\u00036"+
		"\u001b\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u011d\u0001\u0000"+
		"\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u01235\u0001\u0000\u0000"+
		"\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u012b\u00038\u001c\u0000"+
		"\u0126\u0127\u0003@ \u0000\u0127\u0128\u00038\u001c\u0000\u0128\u012a"+
		"\u0001\u0000\u0000\u0000\u0129\u0126\u0001\u0000\u0000\u0000\u012a\u012d"+
		"\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0001\u0000\u0000\u0000\u012c7\u0001\u0000\u0000\u0000\u012d\u012b\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0005.\u0000\u0000\u012f\u0130\u0003.\u0017"+
		"\u0000\u0130\u0131\u0005/\u0000\u0000\u0131\u0143\u0001\u0000\u0000\u0000"+
		"\u0132\u0143\u0003\u001a\r\u0000\u0133\u013c\u00059\u0000\u0000\u0134"+
		"\u0135\u00050\u0000\u0000\u0135\u0138\u0003.\u0017\u0000\u0136\u0137\u0005"+
		"2\u0000\u0000\u0137\u0139\u0003.\u0017\u0000\u0138\u0136\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u00051\u0000\u0000\u013b\u013d\u0001\u0000\u0000\u0000"+
		"\u013c\u0134\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000"+
		"\u013d\u0143\u0001\u0000\u0000\u0000\u013e\u0143\u0003D\"\u0000\u013f"+
		"\u0140\u0003B!\u0000\u0140\u0141\u00038\u001c\u0000\u0141\u0143\u0001"+
		"\u0000\u0000\u0000\u0142\u012e\u0001\u0000\u0000\u0000\u0142\u0132\u0001"+
		"\u0000\u0000\u0000\u0142\u0133\u0001\u0000\u0000\u0000\u0142\u013e\u0001"+
		"\u0000\u0000\u0000\u0142\u013f\u0001\u0000\u0000\u0000\u01439\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u0007\u0000\u0000\u0000\u0145;\u0001\u0000\u0000"+
		"\u0000\u0146\u0147\u0007\u0001\u0000\u0000\u0147=\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0007\u0002\u0000\u0000\u0149?\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0007\u0003\u0000\u0000\u014bA\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0007\u0004\u0000\u0000\u014dC\u0001\u0000\u0000\u0000\u014e\u014f\u0007"+
		"\u0005\u0000\u0000\u014fE\u0001\u0000\u0000\u0000\u0150\u0154\u0003H$"+
		"\u0000\u0151\u0154\u0003J%\u0000\u0152\u0154\u0003L&\u0000\u0153\u0150"+
		"\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0152"+
		"\u0001\u0000\u0000\u0000\u0154G\u0001\u0000\u0000\u0000\u0155\u0156\u0007"+
		"\u0006\u0000\u0000\u0156I\u0001\u0000\u0000\u0000\u0157\u0158\u0005\u0018"+
		"\u0000\u0000\u0158\u0159\u00050\u0000\u0000\u0159\u015c\u00055\u0000\u0000"+
		"\u015a\u015b\u00052\u0000\u0000\u015b\u015d\u00055\u0000\u0000\u015c\u015a"+
		"\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e"+
		"\u0001\u0000\u0000\u0000\u015e\u015f\u00051\u0000\u0000\u015f\u0160\u0005"+
		"\u0019\u0000\u0000\u0160\u0161\u0003F#\u0000\u0161K\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0005\u001a\u0000\u0000\u0163\u0164\u0003N\'\u0000"+
		"\u0164\u0165\u0005\u001b\u0000\u0000\u0165M\u0001\u0000\u0000\u0000\u0166"+
		"\u0167\u00059\u0000\u0000\u0167\u0168\u00054\u0000\u0000\u0168\u0169\u0003"+
		"F#\u0000\u0169\u016a\u00053\u0000\u0000\u016a\u016c\u0001\u0000\u0000"+
		"\u0000\u016b\u0166\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000"+
		"\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000"+
		"\u0000\u016eO\u0001\u0000\u0000\u0000\u001c[]dq}\u0081\u0092\u00a3\u00af"+
		"\u00b6\u00ba\u00c3\u00cc\u00d5\u00db\u00eb\u0102\u0107\u0113\u011a\u0122"+
		"\u012b\u0138\u013c\u0142\u0153\u015c\u016d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}