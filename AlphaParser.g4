//--------------------------------------------------------------
parser grammar AlphaParser;

//--------------------------------------------------------------
options {
    tokenVocab = AlphaScanner;
}

@header {
    import parser.TablaSimbolos;
}

@members {
    private parser.TablaSimbolos symbols = new parser.TablaSimbolos();
}

program
                : singleCommand                                                                                         #programAST;

command         : singleCommand (PyCOMMA singleCommand)*                                                                #commandAST;

singleCommand
                :
                IDENT ASSING expression
                {if ( symbols.buscar($IDENT.text) == null ) {
                    System.err.println("undefined variable: "+$IDENT.text+ " in : ["+$IDENT.line+","+$IDENT.pos + "]");
                }}                                                                                                      #assignSingleCommandAST
                | ident L_PARENT expression R_PARENT                                                                    #callSingleCommandAST
                | IF expression THEN singleCommand ELSE singleCommand                                                   #ifSingleCommandAST
                | WHILE expression DO singleCommand                                                                     #whileSingleCommandAST
                |
                {symbols.openScope();}
                LET declaration IN singleCommand
                {symbols.imprimir(); symbols.closeScope();}                                                             #letSingleCommandAST
                | BEGIN command END                                                                                     #blockSingleCommandAST;

declaration     : singleDeclaration (PyCOMMA singleDeclaration)*                                                        #declarationAST;

singleDeclaration : CONST IDENT VIR expression                                                                          #constSingleDeclarationAST
    	        | VAR IDENT TWO_P typeDenoter {symbols.insertar($IDENT,0,$ctx);}                                        #varSingleDeclarationAST;

typeDenoter     : IDENT                                                                                                 #typeDenoterAST;

expression      : primaryExpression (operator primaryExpression)*                                                       #expressionAST;

primaryExpression : LITERAL                                                                                             #numPrimaryExpressionAST
                | IDENT
                {if ( symbols.buscar($IDENT.text) == null ) {
                    System.err.println("undefined variable: "+$IDENT.text+ " in : ["+$IDENT.line+","+$IDENT.pos + "]");
                }}                                                                                                      #idPrimaryExpressionAST
                | L_PARENT expression R_PARENT                                                                          #groupPrimaryExpressionAST;

operator : SUM | SUB | MUL | DIV                                                                                        #operatorAST;


ident locals [SingleDeclarationContext decl = null]: IDENT                                                              #identAST;