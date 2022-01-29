// Generated from /home/andres/Documentos/2021 - II/Lenguajes de Programación/Traductor/Entrega #3/PseIntToPython/grammar/PseIntGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseIntGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TOKEN_INICIOPROCESO=1, TOKEN_FINPROCESO=2, TOKEN_INICIOSUBPROCESO=3, TOKEN_FINSUBPROCESO=4, 
		TOKEN_DEFINIR=5, TOKEN_COMO=6, TOKEN_TIPO=7, TOKEN_COMANDOESPECIAL=8, 
		TOKEN_COMANDOLEER=9, TOKEN_COMANDOESCRIBIR=10, TOKEN_COMANDODIMENSION=11, 
		TOKEN_OTROMODO=12, VERDADERO=13, FALSO=14, PARA=15, QUE=16, HASTA=17, 
		CON=18, PASO=19, HACER=20, FINPARA=21, SI=22, ENTONCES=23, SINO=24, FINSI=25, 
		SEGUN=26, CASO=27, FINSEGUN=28, MIENTRAS=29, FINMIENTRAS=30, REPETIR=31, 
		MOD=32, O=33, Y=34, TOKEN_MAS=35, TOKEN_MENOS=36, TOKEN_MUL=37, TOKEN_DIV=38, 
		TOKEN_PARIZQ=39, TOKEN_PARDER=40, TOKEN_CORIZQ=41, TOKEN_CORDER=42, TOKEN_MOD=43, 
		TOKEN_IGUAL=44, TOKEN_IGUALDAD=45, TOKEN_DIFERENTE=46, TOKEN_MENOR=47, 
		TOKEN_MENORIGUAL=48, TOKEN_MAYOR=49, TOKEN_MAYORIGUAL=50, TOKEN_COMA=51, 
		TOKEN_DOSPUNTOS=52, TOKEN_PUNTOYCOMA=53, TOKEN_COMILLAS=54, TOKEN_COMILLASIMPLE=55, 
		TOKEN_ASIGNACION=56, TOKEN_NEG=57, TOKEN_COMENTARIO=58, TOKEN_O=59, TOKEN_Y=60, 
		TOKEN_POT=61, INT=62, DOUBLE=63, STRING=64, ID=65, SPACE=66, COMMENT=67;
	public static final int
		RULE_programa = 0, RULE_proceso = 1, RULE_subproceso = 2, RULE_id_subproceso = 3, 
		RULE_arg = 4, RULE_comandos = 5, RULE_comando = 6, RULE_comentario = 7, 
		RULE_definicion_variables = 8, RULE_asignacion_variable = 9, RULE_asignacion = 10, 
		RULE_expresion = 11, RULE_term = 12, RULE_factor = 13, RULE_funcion = 14, 
		RULE_comandos_especiales = 15, RULE_comando_escribir = 16, RULE_comando_leer = 17, 
		RULE_dimensionamiento_arreglo = 18, RULE_coma = 19, RULE_expresion_escribir = 20, 
		RULE_condicional_si = 21, RULE_condiciones = 22, RULE_condicion = 23, 
		RULE_comparacion = 24, RULE_condicion_sino = 25, RULE_ciclo_para = 26, 
		RULE_ciclo_mientras = 27, RULE_ciclo_repetirhasta = 28, RULE_paso = 29, 
		RULE_asignacion_para = 30, RULE_comando_segunhacer = 31, RULE_caso = 32, 
		RULE_de_otro_modo = 33, RULE_bool = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "proceso", "subproceso", "id_subproceso", "arg", "comandos", 
			"comando", "comentario", "definicion_variables", "asignacion_variable", 
			"asignacion", "expresion", "term", "factor", "funcion", "comandos_especiales", 
			"comando_escribir", "comando_leer", "dimensionamiento_arreglo", "coma", 
			"expresion_escribir", "condicional_si", "condiciones", "condicion", "comparacion", 
			"condicion_sino", "ciclo_para", "ciclo_mientras", "ciclo_repetirhasta", 
			"paso", "asignacion_para", "comando_segunhacer", "caso", "de_otro_modo", 
			"bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'caso'", null, null, null, null, "'mod'", "'o'", "'y'", 
			"'+'", "'-'", "'*'", "'/'", "'('", "')'", "'['", "']'", "'%'", "'='", 
			"'=='", "'<>'", "'<'", "'<='", "'>'", "'>='", "','", "':'", "';'", "'\"'", 
			"'''", "'<-'", null, "'//'", "'|'", "'&'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TOKEN_INICIOPROCESO", "TOKEN_FINPROCESO", "TOKEN_INICIOSUBPROCESO", 
			"TOKEN_FINSUBPROCESO", "TOKEN_DEFINIR", "TOKEN_COMO", "TOKEN_TIPO", "TOKEN_COMANDOESPECIAL", 
			"TOKEN_COMANDOLEER", "TOKEN_COMANDOESCRIBIR", "TOKEN_COMANDODIMENSION", 
			"TOKEN_OTROMODO", "VERDADERO", "FALSO", "PARA", "QUE", "HASTA", "CON", 
			"PASO", "HACER", "FINPARA", "SI", "ENTONCES", "SINO", "FINSI", "SEGUN", 
			"CASO", "FINSEGUN", "MIENTRAS", "FINMIENTRAS", "REPETIR", "MOD", "O", 
			"Y", "TOKEN_MAS", "TOKEN_MENOS", "TOKEN_MUL", "TOKEN_DIV", "TOKEN_PARIZQ", 
			"TOKEN_PARDER", "TOKEN_CORIZQ", "TOKEN_CORDER", "TOKEN_MOD", "TOKEN_IGUAL", 
			"TOKEN_IGUALDAD", "TOKEN_DIFERENTE", "TOKEN_MENOR", "TOKEN_MENORIGUAL", 
			"TOKEN_MAYOR", "TOKEN_MAYORIGUAL", "TOKEN_COMA", "TOKEN_DOSPUNTOS", "TOKEN_PUNTOYCOMA", 
			"TOKEN_COMILLAS", "TOKEN_COMILLASIMPLE", "TOKEN_ASIGNACION", "TOKEN_NEG", 
			"TOKEN_COMENTARIO", "TOKEN_O", "TOKEN_Y", "TOKEN_POT", "INT", "DOUBLE", 
			"STRING", "ID", "SPACE", "COMMENT"
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
	public String getGrammarFileName() { return "PseIntGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PseIntGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public ProcesoContext proceso() {
			return getRuleContext(ProcesoContext.class,0);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public List<SubprocesoContext> subproceso() {
			return getRuleContexts(SubprocesoContext.class);
		}
		public SubprocesoContext subproceso(int i) {
			return getRuleContext(SubprocesoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(70);
				comentario();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_INICIOSUBPROCESO) {
				{
				{
				setState(76);
				subproceso();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(82);
			proceso();
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

	public static class ProcesoContext extends ParserRuleContext {
		public TerminalNode TOKEN_INICIOPROCESO() { return getToken(PseIntGrammarParser.TOKEN_INICIOPROCESO, 0); }
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
		public TerminalNode TOKEN_FINPROCESO() { return getToken(PseIntGrammarParser.TOKEN_FINPROCESO, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public ProcesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proceso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterProceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitProceso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitProceso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcesoContext proceso() throws RecognitionException {
		ProcesoContext _localctx = new ProcesoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_proceso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(TOKEN_INICIOPROCESO);
			setState(85);
			match(ID);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (TOKEN_DEFINIR - 5)) | (1L << (TOKEN_COMANDOESPECIAL - 5)) | (1L << (TOKEN_COMANDOLEER - 5)) | (1L << (TOKEN_COMANDOESCRIBIR - 5)) | (1L << (TOKEN_COMANDODIMENSION - 5)) | (1L << (PARA - 5)) | (1L << (SI - 5)) | (1L << (SEGUN - 5)) | (1L << (MIENTRAS - 5)) | (1L << (REPETIR - 5)) | (1L << (ID - 5)) | (1L << (COMMENT - 5)))) != 0)) {
				{
				{
				setState(86);
				comandos();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(TOKEN_FINPROCESO);
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

	public static class SubprocesoContext extends ParserRuleContext {
		public TerminalNode TOKEN_INICIOSUBPROCESO() { return getToken(PseIntGrammarParser.TOKEN_INICIOSUBPROCESO, 0); }
		public Id_subprocesoContext id_subproceso() {
			return getRuleContext(Id_subprocesoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode TOKEN_FINSUBPROCESO() { return getToken(PseIntGrammarParser.TOKEN_FINSUBPROCESO, 0); }
		public SubprocesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subproceso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterSubproceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitSubproceso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitSubproceso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubprocesoContext subproceso() throws RecognitionException {
		SubprocesoContext _localctx = new SubprocesoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_subproceso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(TOKEN_INICIOSUBPROCESO);
			setState(95);
			id_subproceso();
			setState(96);
			comandos();
			setState(97);
			match(TOKEN_FINSUBPROCESO);
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

	public static class Id_subprocesoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
		public TerminalNode TOKEN_ASIGNACION() { return getToken(PseIntGrammarParser.TOKEN_ASIGNACION, 0); }
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public Id_subprocesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_subproceso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterId_subproceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitId_subproceso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitId_subproceso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_subprocesoContext id_subproceso() throws RecognitionException {
		Id_subprocesoContext _localctx = new Id_subprocesoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_id_subproceso);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(ID);
				setState(101);
				match(TOKEN_ASIGNACION);
				setState(102);
				funcion();
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

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PseIntGrammarParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(PseIntGrammarParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (INT - 62)) | (1L << (DOUBLE - 62)) | (1L << (ID - 62)))) != 0)) ) {
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
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comandos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			comando();
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					comando();
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ComandoContext extends ParserRuleContext {
		public Definicion_variablesContext definicion_variables() {
			return getRuleContext(Definicion_variablesContext.class,0);
		}
		public Asignacion_variableContext asignacion_variable() {
			return getRuleContext(Asignacion_variableContext.class,0);
		}
		public Comandos_especialesContext comandos_especiales() {
			return getRuleContext(Comandos_especialesContext.class,0);
		}
		public Comando_escribirContext comando_escribir() {
			return getRuleContext(Comando_escribirContext.class,0);
		}
		public Comando_leerContext comando_leer() {
			return getRuleContext(Comando_leerContext.class,0);
		}
		public Dimensionamiento_arregloContext dimensionamiento_arreglo() {
			return getRuleContext(Dimensionamiento_arregloContext.class,0);
		}
		public Condicional_siContext condicional_si() {
			return getRuleContext(Condicional_siContext.class,0);
		}
		public Ciclo_paraContext ciclo_para() {
			return getRuleContext(Ciclo_paraContext.class,0);
		}
		public Ciclo_mientrasContext ciclo_mientras() {
			return getRuleContext(Ciclo_mientrasContext.class,0);
		}
		public Ciclo_repetirhastaContext ciclo_repetirhasta() {
			return getRuleContext(Ciclo_repetirhastaContext.class,0);
		}
		public Comando_segunhacerContext comando_segunhacer() {
			return getRuleContext(Comando_segunhacerContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comando);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_DEFINIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				definicion_variables();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				asignacion_variable();
				}
				break;
			case TOKEN_COMANDOESPECIAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				comandos_especiales();
				}
				break;
			case TOKEN_COMANDOESCRIBIR:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				comando_escribir();
				}
				break;
			case TOKEN_COMANDOLEER:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				comando_leer();
				}
				break;
			case TOKEN_COMANDODIMENSION:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				dimensionamiento_arreglo();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
				condicional_si();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 8);
				{
				setState(121);
				ciclo_para();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 9);
				{
				setState(122);
				ciclo_mientras();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 10);
				{
				setState(123);
				ciclo_repetirhasta();
				}
				break;
			case SEGUN:
				enterOuterAlt(_localctx, 11);
				{
				setState(124);
				comando_segunhacer();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 12);
				{
				setState(125);
				comentario();
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

	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(PseIntGrammarParser.COMMENT, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitComentario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitComentario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comentario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(COMMENT);
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

	public static class Definicion_variablesContext extends ParserRuleContext {
		public TerminalNode TOKEN_DEFINIR() { return getToken(PseIntGrammarParser.TOKEN_DEFINIR, 0); }
		public List<TerminalNode> ID() { return getTokens(PseIntGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PseIntGrammarParser.ID, i);
		}
		public TerminalNode TOKEN_COMO() { return getToken(PseIntGrammarParser.TOKEN_COMO, 0); }
		public TerminalNode TOKEN_TIPO() { return getToken(PseIntGrammarParser.TOKEN_TIPO, 0); }
		public TerminalNode TOKEN_PUNTOYCOMA() { return getToken(PseIntGrammarParser.TOKEN_PUNTOYCOMA, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(PseIntGrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(PseIntGrammarParser.TOKEN_COMA, i);
		}
		public Definicion_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterDefinicion_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitDefinicion_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitDefinicion_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definicion_variablesContext definicion_variables() throws RecognitionException {
		Definicion_variablesContext _localctx = new Definicion_variablesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_definicion_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(TOKEN_DEFINIR);
			setState(131);
			match(ID);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(132);
				match(TOKEN_COMA);
				setState(133);
				match(ID);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(TOKEN_COMO);
			setState(140);
			match(TOKEN_TIPO);
			setState(141);
			match(TOKEN_PUNTOYCOMA);
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

	public static class Asignacion_variableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
		public TerminalNode TOKEN_ASIGNACION() { return getToken(PseIntGrammarParser.TOKEN_ASIGNACION, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode TOKEN_PUNTOYCOMA() { return getToken(PseIntGrammarParser.TOKEN_PUNTOYCOMA, 0); }
		public Asignacion_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterAsignacion_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitAsignacion_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitAsignacion_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion_variableContext asignacion_variable() throws RecognitionException {
		Asignacion_variableContext _localctx = new Asignacion_variableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asignacion_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(ID);
			setState(144);
			match(TOKEN_ASIGNACION);
			setState(145);
			asignacion();
			setState(146);
			match(TOKEN_PUNTOYCOMA);
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

	public static class AsignacionContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode INT() { return getToken(PseIntGrammarParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(PseIntGrammarParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(PseIntGrammarParser.STRING, 0); }
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_asignacion);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				expresion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				match(DOUBLE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				funcion();
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

	public static class ExpresionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> TOKEN_MAS() { return getTokens(PseIntGrammarParser.TOKEN_MAS); }
		public TerminalNode TOKEN_MAS(int i) {
			return getToken(PseIntGrammarParser.TOKEN_MAS, i);
		}
		public List<TerminalNode> TOKEN_MENOS() { return getTokens(PseIntGrammarParser.TOKEN_MENOS); }
		public TerminalNode TOKEN_MENOS(int i) {
			return getToken(PseIntGrammarParser.TOKEN_MENOS, i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			term();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_MAS || _la==TOKEN_MENOS) {
				{
				{
				setState(157);
				_la = _input.LA(1);
				if ( !(_la==TOKEN_MAS || _la==TOKEN_MENOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(158);
				term();
				}
				}
				setState(163);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TOKEN_MUL() { return getTokens(PseIntGrammarParser.TOKEN_MUL); }
		public TerminalNode TOKEN_MUL(int i) {
			return getToken(PseIntGrammarParser.TOKEN_MUL, i);
		}
		public List<TerminalNode> TOKEN_DIV() { return getTokens(PseIntGrammarParser.TOKEN_DIV); }
		public TerminalNode TOKEN_DIV(int i) {
			return getToken(PseIntGrammarParser.TOKEN_DIV, i);
		}
		public List<TerminalNode> TOKEN_POT() { return getTokens(PseIntGrammarParser.TOKEN_POT); }
		public TerminalNode TOKEN_POT(int i) {
			return getToken(PseIntGrammarParser.TOKEN_POT, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			factor();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_MUL) | (1L << TOKEN_DIV) | (1L << TOKEN_POT))) != 0)) {
				{
				{
				setState(165);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_MUL) | (1L << TOKEN_DIV) | (1L << TOKEN_POT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(166);
				factor();
				}
				}
				setState(171);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PseIntGrammarParser.INT, 0); }
		public TerminalNode TOKEN_MENOS() { return getToken(PseIntGrammarParser.TOKEN_MENOS, 0); }
		public TerminalNode DOUBLE() { return getToken(PseIntGrammarParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
		public TerminalNode TOKEN_PARIZQ() { return getToken(PseIntGrammarParser.TOKEN_PARIZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode TOKEN_PARDER() { return getToken(PseIntGrammarParser.TOKEN_PARDER, 0); }
		public TerminalNode STRING() { return getToken(PseIntGrammarParser.STRING, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_factor);
		int _la;
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TOKEN_MENOS) {
					{
					setState(172);
					match(TOKEN_MENOS);
					}
				}

				setState(175);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TOKEN_MENOS) {
					{
					setState(176);
					match(TOKEN_MENOS);
					}
				}

				setState(179);
				match(DOUBLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(TOKEN_PARIZQ);
				setState(182);
				expresion();
				setState(183);
				match(TOKEN_PARDER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				match(STRING);
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
		public TerminalNode TOKEN_PARIZQ() { return getToken(PseIntGrammarParser.TOKEN_PARIZQ, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode TOKEN_PARDER() { return getToken(PseIntGrammarParser.TOKEN_PARDER, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(PseIntGrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(PseIntGrammarParser.TOKEN_COMA, i);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(ID);
			setState(189);
			match(TOKEN_PARIZQ);
			setState(190);
			arg();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(191);
				match(TOKEN_COMA);
				setState(192);
				arg();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(TOKEN_PARDER);
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

	public static class Comandos_especialesContext extends ParserRuleContext {
		public TerminalNode TOKEN_COMANDOESPECIAL() { return getToken(PseIntGrammarParser.TOKEN_COMANDOESPECIAL, 0); }
		public List<TerminalNode> ID() { return getTokens(PseIntGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PseIntGrammarParser.ID, i);
		}
		public TerminalNode TOKEN_PUNTOYCOMA() { return getToken(PseIntGrammarParser.TOKEN_PUNTOYCOMA, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(PseIntGrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(PseIntGrammarParser.TOKEN_COMA, i);
		}
		public Comandos_especialesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos_especiales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterComandos_especiales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitComandos_especiales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitComandos_especiales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comandos_especialesContext comandos_especiales() throws RecognitionException {
		Comandos_especialesContext _localctx = new Comandos_especialesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comandos_especiales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(TOKEN_COMANDOESPECIAL);
			setState(201);
			match(ID);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(202);
				match(TOKEN_COMA);
				setState(203);
				match(ID);
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(TOKEN_PUNTOYCOMA);
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

	public static class Comando_escribirContext extends ParserRuleContext {
		public TerminalNode TOKEN_COMANDOESCRIBIR() { return getToken(PseIntGrammarParser.TOKEN_COMANDOESCRIBIR, 0); }
		public List<Expresion_escribirContext> expresion_escribir() {
			return getRuleContexts(Expresion_escribirContext.class);
		}
		public Expresion_escribirContext expresion_escribir(int i) {
			return getRuleContext(Expresion_escribirContext.class,i);
		}
		public TerminalNode TOKEN_PUNTOYCOMA() { return getToken(PseIntGrammarParser.TOKEN_PUNTOYCOMA, 0); }
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public Comando_escribirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_escribir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterComando_escribir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitComando_escribir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitComando_escribir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comando_escribirContext comando_escribir() throws RecognitionException {
		Comando_escribirContext _localctx = new Comando_escribirContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comando_escribir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(TOKEN_COMANDOESCRIBIR);
			setState(212);
			expresion_escribir();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(213);
				coma();
				setState(214);
				expresion_escribir();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(TOKEN_PUNTOYCOMA);
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

	public static class Comando_leerContext extends ParserRuleContext {
		public TerminalNode TOKEN_COMANDOLEER() { return getToken(PseIntGrammarParser.TOKEN_COMANDOLEER, 0); }
		public List<TerminalNode> ID() { return getTokens(PseIntGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PseIntGrammarParser.ID, i);
		}
		public TerminalNode TOKEN_PUNTOYCOMA() { return getToken(PseIntGrammarParser.TOKEN_PUNTOYCOMA, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(PseIntGrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(PseIntGrammarParser.TOKEN_COMA, i);
		}
		public Comando_leerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_leer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterComando_leer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitComando_leer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitComando_leer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comando_leerContext comando_leer() throws RecognitionException {
		Comando_leerContext _localctx = new Comando_leerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comando_leer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(TOKEN_COMANDOLEER);
			setState(224);
			match(ID);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(225);
				match(TOKEN_COMA);
				setState(226);
				match(ID);
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(TOKEN_PUNTOYCOMA);
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

	public static class Dimensionamiento_arregloContext extends ParserRuleContext {
		public TerminalNode TOKEN_COMANDODIMENSION() { return getToken(PseIntGrammarParser.TOKEN_COMANDODIMENSION, 0); }
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
		public TerminalNode TOKEN_CORIZQ() { return getToken(PseIntGrammarParser.TOKEN_CORIZQ, 0); }
		public TerminalNode INT() { return getToken(PseIntGrammarParser.INT, 0); }
		public TerminalNode TOKEN_CORDER() { return getToken(PseIntGrammarParser.TOKEN_CORDER, 0); }
		public TerminalNode TOKEN_PUNTOYCOMA() { return getToken(PseIntGrammarParser.TOKEN_PUNTOYCOMA, 0); }
		public Dimensionamiento_arregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionamiento_arreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterDimensionamiento_arreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitDimensionamiento_arreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitDimensionamiento_arreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dimensionamiento_arregloContext dimensionamiento_arreglo() throws RecognitionException {
		Dimensionamiento_arregloContext _localctx = new Dimensionamiento_arregloContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dimensionamiento_arreglo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(TOKEN_COMANDODIMENSION);
			setState(235);
			match(ID);
			setState(236);
			match(TOKEN_CORIZQ);
			setState(237);
			match(INT);
			setState(238);
			match(TOKEN_CORDER);
			setState(239);
			match(TOKEN_PUNTOYCOMA);
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

	public static class ComaContext extends ParserRuleContext {
		public TerminalNode TOKEN_COMA() { return getToken(PseIntGrammarParser.TOKEN_COMA, 0); }
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitComa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitComa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(TOKEN_COMA);
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

	public static class Expresion_escribirContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public Expresion_escribirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_escribir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterExpresion_escribir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitExpresion_escribir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitExpresion_escribir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_escribirContext expresion_escribir() throws RecognitionException {
		Expresion_escribirContext _localctx = new Expresion_escribirContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expresion_escribir);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				expresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				funcion();
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

	public static class Condicional_siContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(PseIntGrammarParser.SI, 0); }
		public CondicionesContext condiciones() {
			return getRuleContext(CondicionesContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(PseIntGrammarParser.ENTONCES, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FINSI() { return getToken(PseIntGrammarParser.FINSI, 0); }
		public TerminalNode TOKEN_PARIZQ() { return getToken(PseIntGrammarParser.TOKEN_PARIZQ, 0); }
		public TerminalNode TOKEN_PARDER() { return getToken(PseIntGrammarParser.TOKEN_PARDER, 0); }
		public Condicion_sinoContext condicion_sino() {
			return getRuleContext(Condicion_sinoContext.class,0);
		}
		public Condicional_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterCondicional_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitCondicional_si(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitCondicional_si(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condicional_siContext condicional_si() throws RecognitionException {
		Condicional_siContext _localctx = new Condicional_siContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_condicional_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(SI);
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(248);
				match(TOKEN_PARIZQ);
				}
				break;
			}
			setState(251);
			condiciones();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOKEN_PARDER) {
				{
				setState(252);
				match(TOKEN_PARDER);
				}
			}

			setState(255);
			match(ENTONCES);
			setState(256);
			comandos();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(257);
				condicion_sino();
				}
			}

			setState(260);
			match(FINSI);
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

	public static class CondicionesContext extends ParserRuleContext {
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public List<TerminalNode> Y() { return getTokens(PseIntGrammarParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(PseIntGrammarParser.Y, i);
		}
		public List<TerminalNode> O() { return getTokens(PseIntGrammarParser.O); }
		public TerminalNode O(int i) {
			return getToken(PseIntGrammarParser.O, i);
		}
		public List<TerminalNode> TOKEN_O() { return getTokens(PseIntGrammarParser.TOKEN_O); }
		public TerminalNode TOKEN_O(int i) {
			return getToken(PseIntGrammarParser.TOKEN_O, i);
		}
		public List<TerminalNode> TOKEN_Y() { return getTokens(PseIntGrammarParser.TOKEN_Y); }
		public TerminalNode TOKEN_Y(int i) {
			return getToken(PseIntGrammarParser.TOKEN_Y, i);
		}
		public CondicionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condiciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterCondiciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitCondiciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitCondiciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionesContext condiciones() throws RecognitionException {
		CondicionesContext _localctx = new CondicionesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condiciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			condicion();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << O) | (1L << Y) | (1L << TOKEN_O) | (1L << TOKEN_Y))) != 0)) {
				{
				{
				setState(263);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << O) | (1L << Y) | (1L << TOKEN_O) | (1L << TOKEN_Y))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(264);
				condicion();
				}
				}
				setState(269);
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

	public static class CondicionContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode TOKEN_NEG() { return getToken(PseIntGrammarParser.TOKEN_NEG, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_condicion);
		int _la;
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TOKEN_NEG) {
					{
					setState(270);
					match(TOKEN_NEG);
					}
				}

				setState(273);
				expresion();
				setState(274);
				comparacion();
				setState(275);
				expresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TOKEN_NEG) {
					{
					setState(277);
					match(TOKEN_NEG);
					}
				}

				setState(280);
				bool();
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

	public static class ComparacionContext extends ParserRuleContext {
		public TerminalNode TOKEN_IGUAL() { return getToken(PseIntGrammarParser.TOKEN_IGUAL, 0); }
		public TerminalNode TOKEN_DIFERENTE() { return getToken(PseIntGrammarParser.TOKEN_DIFERENTE, 0); }
		public TerminalNode TOKEN_MENOR() { return getToken(PseIntGrammarParser.TOKEN_MENOR, 0); }
		public TerminalNode TOKEN_MENORIGUAL() { return getToken(PseIntGrammarParser.TOKEN_MENORIGUAL, 0); }
		public TerminalNode TOKEN_MAYOR() { return getToken(PseIntGrammarParser.TOKEN_MAYOR, 0); }
		public TerminalNode TOKEN_MAYORIGUAL() { return getToken(PseIntGrammarParser.TOKEN_MAYORIGUAL, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_IGUAL) | (1L << TOKEN_DIFERENTE) | (1L << TOKEN_MENOR) | (1L << TOKEN_MENORIGUAL) | (1L << TOKEN_MAYOR) | (1L << TOKEN_MAYORIGUAL))) != 0)) ) {
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

	public static class Condicion_sinoContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(PseIntGrammarParser.SINO, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Condicion_sinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterCondicion_sino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitCondicion_sino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitCondicion_sino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condicion_sinoContext condicion_sino() throws RecognitionException {
		Condicion_sinoContext _localctx = new Condicion_sinoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_condicion_sino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(SINO);
			setState(286);
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

	public static class Ciclo_paraContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(PseIntGrammarParser.PARA, 0); }
		public Asignacion_paraContext asignacion_para() {
			return getRuleContext(Asignacion_paraContext.class,0);
		}
		public TerminalNode HACER() { return getToken(PseIntGrammarParser.HACER, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FINPARA() { return getToken(PseIntGrammarParser.FINPARA, 0); }
		public PasoContext paso() {
			return getRuleContext(PasoContext.class,0);
		}
		public Ciclo_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterCiclo_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitCiclo_para(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitCiclo_para(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_paraContext ciclo_para() throws RecognitionException {
		Ciclo_paraContext _localctx = new Ciclo_paraContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ciclo_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(PARA);
			setState(289);
			asignacion_para();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(290);
				paso();
				}
			}

			setState(293);
			match(HACER);
			setState(294);
			comandos();
			setState(295);
			match(FINPARA);
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

	public static class Ciclo_mientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(PseIntGrammarParser.MIENTRAS, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode HACER() { return getToken(PseIntGrammarParser.HACER, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FINMIENTRAS() { return getToken(PseIntGrammarParser.FINMIENTRAS, 0); }
		public Ciclo_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterCiclo_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitCiclo_mientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitCiclo_mientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_mientrasContext ciclo_mientras() throws RecognitionException {
		Ciclo_mientrasContext _localctx = new Ciclo_mientrasContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ciclo_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(MIENTRAS);
			setState(298);
			condicion();
			setState(299);
			match(HACER);
			setState(300);
			comandos();
			setState(301);
			match(FINMIENTRAS);
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

	public static class Ciclo_repetirhastaContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(PseIntGrammarParser.REPETIR, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode HASTA() { return getToken(PseIntGrammarParser.HASTA, 0); }
		public TerminalNode QUE() { return getToken(PseIntGrammarParser.QUE, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public Ciclo_repetirhastaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_repetirhasta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterCiclo_repetirhasta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitCiclo_repetirhasta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitCiclo_repetirhasta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_repetirhastaContext ciclo_repetirhasta() throws RecognitionException {
		Ciclo_repetirhastaContext _localctx = new Ciclo_repetirhastaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ciclo_repetirhasta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(REPETIR);
			setState(304);
			comandos();
			setState(305);
			match(HASTA);
			setState(306);
			match(QUE);
			setState(307);
			condicion();
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

	public static class PasoContext extends ParserRuleContext {
		public TerminalNode CON() { return getToken(PseIntGrammarParser.CON, 0); }
		public TerminalNode PASO() { return getToken(PseIntGrammarParser.PASO, 0); }
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
		public TerminalNode TOKEN_MAS() { return getToken(PseIntGrammarParser.TOKEN_MAS, 0); }
		public TerminalNode INT() { return getToken(PseIntGrammarParser.INT, 0); }
		public PasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterPaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitPaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitPaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasoContext paso() throws RecognitionException {
		PasoContext _localctx = new PasoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_paso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(309);
			match(CON);
			setState(310);
			match(PASO);
			setState(311);
			match(ID);
			setState(312);
			match(TOKEN_MAS);
			setState(313);
			match(INT);
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

	public static class Asignacion_paraContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
		public TerminalNode TOKEN_ASIGNACION() { return getToken(PseIntGrammarParser.TOKEN_ASIGNACION, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode HASTA() { return getToken(PseIntGrammarParser.HASTA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Asignacion_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterAsignacion_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitAsignacion_para(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitAsignacion_para(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion_paraContext asignacion_para() throws RecognitionException {
		Asignacion_paraContext _localctx = new Asignacion_paraContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_asignacion_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(ID);
			setState(316);
			match(TOKEN_ASIGNACION);
			setState(317);
			asignacion();
			setState(318);
			match(HASTA);
			setState(319);
			expresion();
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

	public static class Comando_segunhacerContext extends ParserRuleContext {
		public TerminalNode SEGUN() { return getToken(PseIntGrammarParser.SEGUN, 0); }
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
		public TerminalNode HACER() { return getToken(PseIntGrammarParser.HACER, 0); }
		public List<CasoContext> caso() {
			return getRuleContexts(CasoContext.class);
		}
		public CasoContext caso(int i) {
			return getRuleContext(CasoContext.class,i);
		}
		public TerminalNode FINSEGUN() { return getToken(PseIntGrammarParser.FINSEGUN, 0); }
		public De_otro_modoContext de_otro_modo() {
			return getRuleContext(De_otro_modoContext.class,0);
		}
		public Comando_segunhacerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_segunhacer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterComando_segunhacer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitComando_segunhacer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitComando_segunhacer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comando_segunhacerContext comando_segunhacer() throws RecognitionException {
		Comando_segunhacerContext _localctx = new Comando_segunhacerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_comando_segunhacer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(SEGUN);
			setState(322);
			match(ID);
			setState(323);
			match(HACER);
			setState(324);
			caso();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASO) {
				{
				{
				setState(325);
				caso();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOKEN_OTROMODO) {
				{
				setState(331);
				de_otro_modo();
				}
			}

			setState(334);
			match(FINSEGUN);
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

	public static class CasoContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(PseIntGrammarParser.CASO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode TOKEN_DOSPUNTOS() { return getToken(PseIntGrammarParser.TOKEN_DOSPUNTOS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_caso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(336);
			match(CASO);
			setState(337);
			expresion();
			setState(338);
			match(TOKEN_DOSPUNTOS);
			setState(339);
			comandos();
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

	public static class De_otro_modoContext extends ParserRuleContext {
		public TerminalNode TOKEN_OTROMODO() { return getToken(PseIntGrammarParser.TOKEN_OTROMODO, 0); }
		public TerminalNode TOKEN_DOSPUNTOS() { return getToken(PseIntGrammarParser.TOKEN_DOSPUNTOS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public De_otro_modoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_de_otro_modo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterDe_otro_modo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitDe_otro_modo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitDe_otro_modo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final De_otro_modoContext de_otro_modo() throws RecognitionException {
		De_otro_modoContext _localctx = new De_otro_modoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_de_otro_modo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(341);
			match(TOKEN_OTROMODO);
			setState(342);
			match(TOKEN_DOSPUNTOS);
			setState(343);
			comandos();
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode VERDADERO() { return getToken(PseIntGrammarParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(PseIntGrammarParser.FALSO, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if ( !(_la==VERDADERO || _la==FALSO) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u015e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\7\2P\n\2\f\2\16"+
		"\2S\13\2\3\2\3\2\3\3\3\3\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5j\n\5\3\6\3\6\3\7\3\7\7\7p\n\7\f\7\16\7"+
		"s\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0081\n\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\7\n\u0089\n\n\f\n\16\n\u008c\13\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009d\n\f\3\r"+
		"\3\r\3\r\7\r\u00a2\n\r\f\r\16\r\u00a5\13\r\3\16\3\16\3\16\7\16\u00aa\n"+
		"\16\f\16\16\16\u00ad\13\16\3\17\5\17\u00b0\n\17\3\17\3\17\5\17\u00b4\n"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bd\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u00c4\n\20\f\20\16\20\u00c7\13\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\7\21\u00cf\n\21\f\21\16\21\u00d2\13\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u00db\n\22\f\22\16\22\u00de\13\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\7\23\u00e6\n\23\f\23\16\23\u00e9\13\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\5\26\u00f8\n\26\3\27"+
		"\3\27\5\27\u00fc\n\27\3\27\3\27\5\27\u0100\n\27\3\27\3\27\3\27\5\27\u0105"+
		"\n\27\3\27\3\27\3\30\3\30\3\30\7\30\u010c\n\30\f\30\16\30\u010f\13\30"+
		"\3\31\5\31\u0112\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u0119\n\31\3\31\5"+
		"\31\u011c\n\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u0126\n\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\7!\u0149\n!\f!\16!\u014c\13!\3!\5!\u014f\n!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3$\3$\3$\2\2%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDF\2\b\4\2@ACC\3\2%&\4\2\'(??\4\2#$=>\4\2."+
		".\60\64\3\2\17\20\2\u0167\2K\3\2\2\2\4V\3\2\2\2\6`\3\2\2\2\bi\3\2\2\2"+
		"\nk\3\2\2\2\fm\3\2\2\2\16\u0080\3\2\2\2\20\u0082\3\2\2\2\22\u0084\3\2"+
		"\2\2\24\u0091\3\2\2\2\26\u009c\3\2\2\2\30\u009e\3\2\2\2\32\u00a6\3\2\2"+
		"\2\34\u00bc\3\2\2\2\36\u00be\3\2\2\2 \u00ca\3\2\2\2\"\u00d5\3\2\2\2$\u00e1"+
		"\3\2\2\2&\u00ec\3\2\2\2(\u00f3\3\2\2\2*\u00f7\3\2\2\2,\u00f9\3\2\2\2."+
		"\u0108\3\2\2\2\60\u011b\3\2\2\2\62\u011d\3\2\2\2\64\u011f\3\2\2\2\66\u0122"+
		"\3\2\2\28\u012b\3\2\2\2:\u0131\3\2\2\2<\u0137\3\2\2\2>\u013d\3\2\2\2@"+
		"\u0143\3\2\2\2B\u0152\3\2\2\2D\u0157\3\2\2\2F\u015b\3\2\2\2HJ\5\20\t\2"+
		"IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LQ\3\2\2\2MK\3\2\2\2NP\5\6\4\2"+
		"ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\5\4\3\2"+
		"U\3\3\2\2\2VW\7\3\2\2W[\7C\2\2XZ\5\f\7\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2"+
		"[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\4\2\2_\5\3\2\2\2`a\7\5\2\2ab\5\b"+
		"\5\2bc\5\f\7\2cd\7\6\2\2d\7\3\2\2\2ej\7C\2\2fg\7C\2\2gh\7:\2\2hj\5\36"+
		"\20\2ie\3\2\2\2if\3\2\2\2j\t\3\2\2\2kl\t\2\2\2l\13\3\2\2\2mq\5\16\b\2"+
		"np\5\16\b\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\r\3\2\2\2sq\3\2\2"+
		"\2t\u0081\5\22\n\2u\u0081\5\24\13\2v\u0081\5 \21\2w\u0081\5\"\22\2x\u0081"+
		"\5$\23\2y\u0081\5&\24\2z\u0081\5,\27\2{\u0081\5\66\34\2|\u0081\58\35\2"+
		"}\u0081\5:\36\2~\u0081\5@!\2\177\u0081\5\20\t\2\u0080t\3\2\2\2\u0080u"+
		"\3\2\2\2\u0080v\3\2\2\2\u0080w\3\2\2\2\u0080x\3\2\2\2\u0080y\3\2\2\2\u0080"+
		"z\3\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0080}\3\2\2\2\u0080~\3\2\2\2"+
		"\u0080\177\3\2\2\2\u0081\17\3\2\2\2\u0082\u0083\7E\2\2\u0083\21\3\2\2"+
		"\2\u0084\u0085\7\7\2\2\u0085\u008a\7C\2\2\u0086\u0087\7\65\2\2\u0087\u0089"+
		"\7C\2\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\b"+
		"\2\2\u008e\u008f\7\t\2\2\u008f\u0090\7\67\2\2\u0090\23\3\2\2\2\u0091\u0092"+
		"\7C\2\2\u0092\u0093\7:\2\2\u0093\u0094\5\26\f\2\u0094\u0095\7\67\2\2\u0095"+
		"\25\3\2\2\2\u0096\u009d\5F$\2\u0097\u009d\5\30\r\2\u0098\u009d\7@\2\2"+
		"\u0099\u009d\7A\2\2\u009a\u009d\7B\2\2\u009b\u009d\5\36\20\2\u009c\u0096"+
		"\3\2\2\2\u009c\u0097\3\2\2\2\u009c\u0098\3\2\2\2\u009c\u0099\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\27\3\2\2\2\u009e\u00a3\5\32\16"+
		"\2\u009f\u00a0\t\3\2\2\u00a0\u00a2\5\32\16\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\31\3\2\2"+
		"\2\u00a5\u00a3\3\2\2\2\u00a6\u00ab\5\34\17\2\u00a7\u00a8\t\4\2\2\u00a8"+
		"\u00aa\5\34\17\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\33\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00b0\7&\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00bd\7@\2\2\u00b2\u00b4\7&\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00bd\7A\2\2\u00b6\u00bd\7C\2\2\u00b7"+
		"\u00b8\7)\2\2\u00b8\u00b9\5\30\r\2\u00b9\u00ba\7*\2\2\u00ba\u00bd\3\2"+
		"\2\2\u00bb\u00bd\7B\2\2\u00bc\u00af\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc"+
		"\u00b6\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\35\3\2\2"+
		"\2\u00be\u00bf\7C\2\2\u00bf\u00c0\7)\2\2\u00c0\u00c5\5\n\6\2\u00c1\u00c2"+
		"\7\65\2\2\u00c2\u00c4\5\n\6\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2"+
		"\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c8\u00c9\7*\2\2\u00c9\37\3\2\2\2\u00ca\u00cb\7\n\2\2\u00cb"+
		"\u00d0\7C\2\2\u00cc\u00cd\7\65\2\2\u00cd\u00cf\7C\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\67\2\2\u00d4!\3\2\2\2"+
		"\u00d5\u00d6\7\f\2\2\u00d6\u00dc\5*\26\2\u00d7\u00d8\5(\25\2\u00d8\u00d9"+
		"\5*\26\2\u00d9\u00db\3\2\2\2\u00da\u00d7\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00df\u00e0\7\67\2\2\u00e0#\3\2\2\2\u00e1\u00e2\7\13\2\2\u00e2\u00e7"+
		"\7C\2\2\u00e3\u00e4\7\65\2\2\u00e4\u00e6\7C\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\67\2\2\u00eb%\3\2\2\2\u00ec\u00ed"+
		"\7\r\2\2\u00ed\u00ee\7C\2\2\u00ee\u00ef\7+\2\2\u00ef\u00f0\7@\2\2\u00f0"+
		"\u00f1\7,\2\2\u00f1\u00f2\7\67\2\2\u00f2\'\3\2\2\2\u00f3\u00f4\7\65\2"+
		"\2\u00f4)\3\2\2\2\u00f5\u00f8\5\30\r\2\u00f6\u00f8\5\36\20\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8+\3\2\2\2\u00f9\u00fb\7\30\2\2\u00fa"+
		"\u00fc\7)\2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u00ff\5.\30\2\u00fe\u0100\7*\2\2\u00ff\u00fe\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\31\2\2\u0102\u0104\5"+
		"\f\7\2\u0103\u0105\5\64\33\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0107\7\33\2\2\u0107-\3\2\2\2\u0108\u010d\5\60\31"+
		"\2\u0109\u010a\t\5\2\2\u010a\u010c\5\60\31\2\u010b\u0109\3\2\2\2\u010c"+
		"\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e/\3\2\2\2"+
		"\u010f\u010d\3\2\2\2\u0110\u0112\7;\2\2\u0111\u0110\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\5\30\r\2\u0114\u0115\5\62\32"+
		"\2\u0115\u0116\5\30\r\2\u0116\u011c\3\2\2\2\u0117\u0119\7;\2\2\u0118\u0117"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\5F$\2\u011b"+
		"\u0111\3\2\2\2\u011b\u0118\3\2\2\2\u011c\61\3\2\2\2\u011d\u011e\t\6\2"+
		"\2\u011e\63\3\2\2\2\u011f\u0120\7\32\2\2\u0120\u0121\5\f\7\2\u0121\65"+
		"\3\2\2\2\u0122\u0123\7\21\2\2\u0123\u0125\5> \2\u0124\u0126\5<\37\2\u0125"+
		"\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\7\26"+
		"\2\2\u0128\u0129\5\f\7\2\u0129\u012a\7\27\2\2\u012a\67\3\2\2\2\u012b\u012c"+
		"\7\37\2\2\u012c\u012d\5\60\31\2\u012d\u012e\7\26\2\2\u012e\u012f\5\f\7"+
		"\2\u012f\u0130\7 \2\2\u01309\3\2\2\2\u0131\u0132\7!\2\2\u0132\u0133\5"+
		"\f\7\2\u0133\u0134\7\23\2\2\u0134\u0135\7\22\2\2\u0135\u0136\5\60\31\2"+
		"\u0136;\3\2\2\2\u0137\u0138\7\24\2\2\u0138\u0139\7\25\2\2\u0139\u013a"+
		"\7C\2\2\u013a\u013b\7%\2\2\u013b\u013c\7@\2\2\u013c=\3\2\2\2\u013d\u013e"+
		"\7C\2\2\u013e\u013f\7:\2\2\u013f\u0140\5\26\f\2\u0140\u0141\7\23\2\2\u0141"+
		"\u0142\5\30\r\2\u0142?\3\2\2\2\u0143\u0144\7\34\2\2\u0144\u0145\7C\2\2"+
		"\u0145\u0146\7\26\2\2\u0146\u014a\5B\"\2\u0147\u0149\5B\"\2\u0148\u0147"+
		"\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014f\5D#\2\u014e\u014d\3\2\2"+
		"\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\7\36\2\2\u0151"+
		"A\3\2\2\2\u0152\u0153\7\35\2\2\u0153\u0154\5\30\r\2\u0154\u0155\7\66\2"+
		"\2\u0155\u0156\5\f\7\2\u0156C\3\2\2\2\u0157\u0158\7\16\2\2\u0158\u0159"+
		"\7\66\2\2\u0159\u015a\5\f\7\2\u015aE\3\2\2\2\u015b\u015c\t\7\2\2\u015c"+
		"G\3\2\2\2\36KQ[iq\u0080\u008a\u009c\u00a3\u00ab\u00af\u00b3\u00bc\u00c5"+
		"\u00d0\u00dc\u00e7\u00f7\u00fb\u00ff\u0104\u010d\u0111\u0118\u011b\u0125"+
		"\u014a\u014e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}