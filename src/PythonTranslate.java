import org.antlr.v4.runtime.tree.TerminalNode;

public class PythonTranslate extends PseIntGrammarBaseListener {
    int indent = 0;
    @Override
    public void enterPrograma(PseIntGrammarParser.ProgramaContext ctx) {
        super.enterPrograma(ctx);
        System.out.println("Python Translator");
    }

    @Override
    public void enterProceso(PseIntGrammarParser.ProcesoContext ctx) {
        super.enterProceso(ctx);
        System.out.println("def " + ctx.ID() +  ":");
    }

    @Override
    public void exitProceso(PseIntGrammarParser.ProcesoContext ctx) {
        super.exitProceso(ctx);
        indent = 0;
    }

    @Override
    public void enterSubproceso(PseIntGrammarParser.SubprocesoContext ctx) {
        super.enterSubproceso(ctx);
        System.out.println("def " + ctx.id_subproceso().funcion().getText() +  ":");
    }

    @Override
    public void exitSubproceso(PseIntGrammarParser.SubprocesoContext ctx) {
        super.exitSubproceso(ctx);
        indent++;
        String indentation = indentation();
        System.out.println( indentation + "return " + ctx.id_subproceso().ID().getText() +  ";");
        indent = 0;
    }

    @Override
    public void enterComando_escribir(PseIntGrammarParser.Comando_escribirContext ctx) {
        super.enterComando_escribir(ctx);
        indent++;
        String indentation = indentation();
        System.out.print(indentation + "print(");
    }

    @Override
    public void exitComando_escribir(PseIntGrammarParser.Comando_escribirContext ctx) {
        super.exitComando_escribir(ctx);
        System.out.println(");");
        indent--;
    }

    @Override
    public void enterCiclo_repetirhasta(PseIntGrammarParser.Ciclo_repetirhastaContext ctx) {
        super.enterCiclo_repetirhasta(ctx);
        indent++;
        String indentation = indentation();
        String text = ctx.condicion().getText().replace("=", "==");
        text = text.replace("<>", "!=");
        System.out.println(indentation + "while !(" + text + "):");
    }

    @Override
    public void exitCiclo_repetirhasta(PseIntGrammarParser.Ciclo_repetirhastaContext ctx) {
        super.exitCiclo_repetirhasta(ctx);
        indent--;
    }

    @Override
    public void enterDe_otro_modo(PseIntGrammarParser.De_otro_modoContext ctx) {
        super.enterDe_otro_modo(ctx);
        indent--;
        indent++;
        String indentation = indentation();
        System.out.println( indentation + "else:");
    }

    String currentId = "";
    @Override
    public void enterComando_segunhacer(PseIntGrammarParser.Comando_segunhacerContext ctx) {
        super.enterComando_segunhacer(ctx);
        currentId = ctx.ID().getText();

    }

    @Override
    public void exitComando_segunhacer(PseIntGrammarParser.Comando_segunhacerContext ctx) {
        super.exitComando_segunhacer(ctx);
        currentId = "";
    }

    @Override
    public void enterCaso(PseIntGrammarParser.CasoContext ctx) {
        super.enterCaso(ctx);
        indent--;
        indent++;
        String indentation = indentation();
        System.out.println(indentation + "if " + currentId + "==" +  ctx.expresion().getText() + ":");
    }

    @Override
    public void enterAsignacion_variable(PseIntGrammarParser.Asignacion_variableContext ctx) {
        super.enterAsignacion_variable(ctx);
        indent++;
        String indentation = indentation();
        String text = ctx.asignacion().getText().replace("verdadero", "True");
        text = text.replace("Verdadero", "True");
        text = text.replace("Falso", "False");
        text = text.replace("falso", "False");
        text = text.replace("^", "**");
        System.out.print(indentation + ctx.ID() + "=" + text);
    }

    @Override
    public void enterExpresion_escribir(PseIntGrammarParser.Expresion_escribirContext ctx) {
        super.enterExpresion_escribir(ctx);
        System.out.print(ctx.getText());
    }

    @Override
    public void enterComando_leer(PseIntGrammarParser.Comando_leerContext ctx) {
        super.enterComando_leer(ctx);
        indent++;
        String indentation = indentation();
        for (TerminalNode tn:
                ctx.ID()) {
            System.out.println(indentation + tn.toString() + "=input();");
        }
        indent--;
    }

    @Override
    public void enterCondicional_si(PseIntGrammarParser.Condicional_siContext ctx) {
        super.enterCondicional_si(ctx);
        indent++;
        String indentation = indentation();
        String text = ctx.condiciones().getText().replace("=", "==");
        text = text.replace("<>", "!=");
        text = text.replace("o", " || ");text = text.replace("O", " || ");
        text = text.replace("y", " && ");text = text.replace("Y", " && ");
        text = text.replace("n || ", "not ");text = text.replace("N || ", "not ");
        text = text.replace("~", "not "); text = text.replace("!", "not ");
        System.out.println(indentation + "if " + text + ":");
    }

    @Override
    public void enterDimensionamiento_arreglo(PseIntGrammarParser.Dimensionamiento_arregloContext ctx) {
        super.enterDimensionamiento_arreglo(ctx);
        indent++;
        String indentation = indentation();
        System.out.println(indentation + ctx.ID().getText() + "=[]");
        indent--;
    }

    @Override
    public void enterComa(PseIntGrammarParser.ComaContext ctx) {
        super.enterComa(ctx);
        System.out.print(ctx.getText());
    }

    @Override
    public void enterComentario(PseIntGrammarParser.ComentarioContext ctx) {
        super.enterComentario(ctx);
        indent++;
        String indentation = indentation();
        indent--;
        System.out.println( indentation + "# " + ctx.COMMENT().getText().substring(2));
    }

    @Override
    public void enterCiclo_para(PseIntGrammarParser.Ciclo_paraContext ctx) {
        super.enterCiclo_para(ctx);
        indent++;
        String indentation = indentation();
        System.out.print(indentation + "for "
                + ctx.asignacion_para().ID().getText()
                + " in range( int(" + ctx.asignacion_para().asignacion().getText()
                + "), int(" + ctx.asignacion_para().expresion().getText() + ")");
        if(ctx.paso() != null)
        {
            System.out.print("," + ctx.paso().INT().getText());
        }
        System.out.println("):");
    }

    @Override
    public void exitCiclo_para(PseIntGrammarParser.Ciclo_paraContext ctx) {
        super.exitCiclo_para(ctx);
        indent--;
    }

    @Override
    public void enterCiclo_mientras(PseIntGrammarParser.Ciclo_mientrasContext ctx) {
        super.enterCiclo_mientras(ctx);
        indent++;
        String indentation = indentation();
        String text = ctx.condicion().getText().replace("=", "==");
        text = text.replace("verdadero", "True");
        text = text.replace("Verdadero", "True");
        text = text.replace("Falso", "False");
        text = text.replace("falso", "False");
        text = text.replace("<>", "!=");
        System.out.println(indentation + "while " + text + ":");
    }

    @Override
    public void exitCiclo_mientras(PseIntGrammarParser.Ciclo_mientrasContext ctx) {
        super.exitCiclo_mientras(ctx);
        indent--;
    }

    @Override
    public void enterCondicion_sino(PseIntGrammarParser.Condicion_sinoContext ctx) {
        super.enterCondicion_sino(ctx);
        String indentation = indentation();
        System.out.println(indentation + "else:");
    }

    @Override
    public void exitCondicional_si(PseIntGrammarParser.Condicional_siContext ctx) {
        super.exitCondicional_si(ctx);
        indent--;
    }

    @Override
    public void exitAsignacion_variable(PseIntGrammarParser.Asignacion_variableContext ctx) {
        super.exitAsignacion_variable(ctx);
        System.out.println(";");
        indent--;
    }

    private String indentation(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            s.append("\t");
        }
        return s.toString();
    }
}
