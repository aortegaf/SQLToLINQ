import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/*
* Presentado por:
*           - Andres Ortega Fernandez
*           - Andres Aldana Wilches
*  Nos basamos en la sintaxis presentada en: http://pseint.sourceforge.net/index.php?page=pseudocodigo.php (sencilla)
*  Todos las palabras reservadas que acepta la gramática deben estar en formato UpperCamelCase
*  o en su defecto deben estar en minúscula.
* */
public class Main {
    public static void main(String[] args) {
        try
        {
            SqlLexer lexer;
            if (args.length>0)
                lexer = new SqlLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new SqlLexer(CharStreams.fromStream(System.in));

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            SqlParser parser = new SqlParser(tokens);
            ParseTree tree = parser.root();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new LINQ_Translate(), tree);
        }
        catch (Exception e)
        {
            System.err.println(e);
            System.exit(-1);
        }

    }
}
