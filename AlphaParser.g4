//--------------------------------------------------------------
parser grammar AlphaParser;

//--------------------------------------------------------------
options {
    tokenVocab = AlphaScanner;
}

program                 : singleCommand                                                                                 #programAST;

command                 :singleCommand (PyCOMMA singleCommand)*                                                         #commandAST;

singleCommand           :
                        IDENT ASSING expression                                                                         #assignSingleCommandAST
                        | IDENT L_PARENT expression R_PARENT                                                            #callSingleCommandAST
                        | IF expression THEN singleCommand ELSE singleCommand                                           #ifSingleCommandAST
                        | WHILE expression DO singleCommand                                                             #whileSingleCommandAST
                        | LET declaration IN singleCommand                                                              #letSingleCommandAST
                        | BEGIN command END                                                                             #blockSingleCommandAST;

declaration             : singleDeclaration (PyCOMMA singleDeclaration)*                                                #declarationAST;

singleDeclaration       : CONST IDENT VIR expression                                                                    #constSingleDeclarationAST
                        | VAR IDENT TWO_P IDENT                                                                         #varSingleDeclarationAST;

//typeDenoter             : IDENT                                                                                         #typeDenoterAST;

expression              : primaryExpression (operator primaryExpression)*                                               #expressionAST;

primaryExpression       : LITERAL                                                                                       #numPrimaryExpressionAST
                        | IDENT                                                                                         #idPrimaryExpressionAST
                        | L_PARENT expression R_PARENT                                                                  #groupPrimaryExpressionAST;

operator                : SUM | SUB | MUL | DIV                                                                         #operatorAST;
