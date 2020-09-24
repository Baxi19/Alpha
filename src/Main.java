import generated.AlphaGrammar;
import generated.AlphaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AlphaParser instParser = null;
        AlphaGrammar inst = null;
        CharStream input=null;
        CommonTokenStream tokens = null;

        try {
            input = CharStreams.fromFileName("test.txt");
            inst = new generated.AlphaGrammar(input);
            tokens = new CommonTokenStream(inst);
            instParser = new AlphaParser(tokens);
        }catch(Exception e){System.out.println("No hay archivo");e.printStackTrace();}
        List<Token> lista = (List<Token>) inst.getAllTokens();
        for (Token t : lista)
            System.out.println(inst.ruleNames[t.getType()-1] + ":" + t.getText() + "\n");
        // inst = new Scanner(input);
        // inst.reset();
    }
}

