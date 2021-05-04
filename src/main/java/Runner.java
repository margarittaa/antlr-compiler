import com.antlr.*;
import nodes.Node;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Runner {
    private static String filePath = "/src/test/java/test3.lang";

    public static void main( String[] args) throws Exception
    {
        String code = getCode();
        System.out.println(code);

        LangLexer lexer = new LangLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LangParser parser = new LangParser(tokens);
        ParseTree tree = parser.program();
        //ParseTreeWalker walker = new ParseTreeWalker();
        //walker.walk(new LangWalker(), tree);
        LangVisitor <Node> visior = new MyCoolVisior();
        Node result = visior.visitProgram((LangParser.ProgramContext) tree);
    }

    public static String getCode() throws FileNotFoundException {
        String absolutePath = new File("").getAbsolutePath();
        String code = "";
        Scanner in = new Scanner(new File(absolutePath + filePath));
        while(in.hasNext())
            code += in.nextLine() + "\r\n";
        in.close();
        return code;
    }
}