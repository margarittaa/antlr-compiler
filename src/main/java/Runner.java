import com.antlr.*;
import nodes.Node;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;


public class Runner {
    private static String filePath = "/src/test/examples/test4.lang";

    public static void main( String[] args) throws Exception
    {
        String code = getCode();
        System.out.println(code);

        LangLexer lexer = new LangLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LangParser parser = new LangParser(tokens);
        ParseTree tree = parser.program();

        try {
            LangVisitor<Node> visior = new MyCoolVisior();
            System.out.println();
            Node result = visior.visitProgram((LangParser.ProgramContext) tree);

            LangVisitor<String> genCodeVisitor = new GenCode();
            String out = genCodeVisitor.visitProgram((LangParser.ProgramContext) tree);

            String classPath = new File("").getAbsolutePath() + "\\src\\test\\out\\Out.java";
            FileWriter fileWriter = new FileWriter(classPath);
            fileWriter.write(out);
            fileWriter.close();
            Process proc = Runtime.getRuntime().exec("javac " + classPath);
            proc.waitFor();
            proc.destroy();
        } catch (RuntimeException e){
            System.out.println("Error");
        }
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