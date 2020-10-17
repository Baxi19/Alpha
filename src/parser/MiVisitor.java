package parser;


import generated.AlphaParser;
import generated.AlphaParserBaseVisitor;

public class MiVisitor extends AlphaParserBaseVisitor<Object> {

    private int cantTabs=0;
    private TablaSimbolos tabla;

    public MiVisitor(){
        this.tabla= new TablaSimbolos();
    }

    private String printTabs(int cantTabs){
        String res="";
        for(int i=0; i< cantTabs;i++)
            res+="\t";
        return res;
    }



    @Override public Object visitProgramAST(AlphaParser.ProgramASTContext ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        cantTabs++;
        visit(ctx.singleCommand());
        cantTabs--;
        return null;
    }

    @Override public Object visitCommandAST(AlphaParser.CommandASTContext ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        cantTabs++;
        visit(ctx.singleCommand(0));
        cantTabs--;
        int i;
        for(i=1; i <= ctx.singleCommand().size()-1; i++) {
            cantTabs++;
            visit(ctx.singleCommand(i));
            cantTabs--;
        }
        return null;
    }

    @Override public Object visitAssignSingleCommandAST(AlphaParser.AssignSingleCommandASTContext ctx) {
     /*   System.out.println(ctx.getClass().getSimpleName());
        MiParser.IdentASTContext t = (MiParser.IdentASTContext) visit(ctx.ident());
        main.TablaSimbolos.Ident ident = tabla.buscar(t.IDENT().getSymbol().getText());
        if (ident != null)
            t.decl = (MiParser.SingleDeclarationContext) ident.declCtx;

        visit(ctx.ident());
        cantTabs++;
        visit(ctx.expression());
        cantTabs--;*/
        return null;
    }
    @Override public Object visitCallSingleCommandAST(AlphaParser.CallSingleCommandASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitIfSingleCommandAST(AlphaParser.IfSingleCommandASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitWhileSingleCommandAST(AlphaParser.WhileSingleCommandASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitLetSingleCommandAST(AlphaParser.LetSingleCommandASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitBlockSingleCommandAST(AlphaParser.BlockSingleCommandASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitDeclarationAST(AlphaParser.DeclarationASTContext ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        cantTabs++;
        visit(ctx.singleDeclaration(0));
        cantTabs--;
        int i;
        for(i=1; i <= ctx.singleDeclaration().size()-1; i++) {
            cantTabs++;
            visit(ctx.singleDeclaration(i));
            cantTabs--;
        }

        tabla.imprimir();
        return null;
    }
    @Override public Object visitConstSingleDeclarationAST(AlphaParser.ConstSingleDeclarationASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitVarSingleDeclarationAST(AlphaParser.VarSingleDeclarationASTContext ctx) {
        tabla.insertar(ctx.IDENT().getSymbol(),0,ctx);
        return null;
    }
   // @Override public Object visitTypeDenoterAST(AlphaParser.TypeDenoterASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExpressionAST(AlphaParser.ExpressionASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitNumPrimaryExpressionAST(AlphaParser.NumPrimaryExpressionASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitIdPrimaryExpressionAST(AlphaParser.IdPrimaryExpressionASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitGroupPrimaryExpressionAST(AlphaParser.GroupPrimaryExpressionASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitOperator(AlphaParser.OperatorContext ctx) {
        String op;
        if (ctx.SUM()!=null)
            op=ctx.SUM().getText();
        else if (ctx.SUB()!=null)
            op=ctx.SUB().getText();
        else if (ctx.MUL()!=null)
            op=ctx.MUL().getText();
        else
            op=ctx.DIV().getText();

        System.out.println(op);
        return null;
    }

    @Override
    public Object visitIdentAST(AlphaParser.IdentASTContext ctx) {
        System.out.println(ctx.decl);
        return ctx;
    }
}
