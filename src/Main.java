import generated.AlphaParser;
import generated.AlphaScanner;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.swing.*;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        AlphaParser parser = null;
        AlphaScanner scanner = null;
        CharStream input = null;
        CommonTokenStream tokens = null;
        ParseTree tree;
        Visitor visitor;

        try {
            input = CharStreams.fromFileName("test.txt");
            scanner = new generated.AlphaScanner(input);
            tokens = new CommonTokenStream(scanner);
            parser = new AlphaParser(tokens);

            AlphaErrorListener errorListener = new AlphaErrorListener();
            scanner.removeErrorListeners();
            parser.removeErrorListeners();
            scanner.addErrorListener(errorListener);
            parser.addErrorListener(errorListener);
            tree = parser.program();

            if(errorListener.hasErrors()){
                System.out.println("Compilation: Failed");
                System.out.println(errorListener.toString());
            }
            else{

                //java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
                //treeGUI.get().setVisible(true);

                //visitor = new Visitor();
                //visitor.visit(tree);




                System.out.println("Compilation: Successful");

            }
        }catch(Exception e){System.out.println("The file doesn't exist!");e.printStackTrace();}

        //tree = parser.program();
        //java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
        //treeGUI.get().setVisible(true);



        /*
        List<Token> lista = (List<Token>) scanner.getAllTokens();

        for (Token t : lista)
            System.out.println(scanner.ruleNames[t.getType()-1] + ":" + t.getText() + "\n");
        */
        // scanner = new Scanner(input);
        // scanner.reset();


    }
}

