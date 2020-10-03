//--------------------------------------------------------------
parser grammar AlphaParser;

//--------------------------------------------------------------
options {
    tokenVocab = AlphaScanner;
}

/*
program : singleCommand;
command : singleCommand (PyCOMMA singleCommand)*;
singleCommand :
IDENT ( ASSING expression
        | L_PARENT expression R_PARENT )
        | IF expression THEN singleCommand
                        ELSE singleCommand
        | WHILE expression DO singleCommand
        | LET declaration IN singleCommand
        | BEGIN command END;
declaration  : singleDeclaration (PyCOMMA singleDeclaration)* ;
singleDeclaration : CONST IDENT VIR expression
    	   | VAR IDENT TWO_P typeDenoter;
typeDenoter : IDENT;
expression :
  		primaryExpression (operator primaryExpression)*;

primaryExpression :
		LITERAL | IDENT | L_PARENT expression R_PARENT;
operator : SUM | SUB | MUL | DIV ;
*/



/*
//--------------------------------------------------------------

//--------------------------------------------------------------
program             : singleCommand                     #ProgramAST;

//--------------------------------------------------------------
command             : singleCommand (PyCOMMA singleCommand)*   #CommandAST;

//--------------------------------------------------------------
singleCommand       : IDENT  ASSING expression                                      #AssingSCAST
                    |  IDENT L_PARENT expression R_PARENT             #CallSCAST
                    | IF expression THEN singleCommand ELSE singleCommand #IfSCAST
                    | WHILE expression DO singleCommand     #WhileSCAST
                    | LET declaration IN singleCommand      #LetSCAST
                    | BEGIN command END                     #BlockSCAST;

//--------------------------------------------------------------
declaration  : singleDeclaration (PyCOMMA singleDeclaration)*  #DeclarationAST;

//--------------------------------------------------------------
singleDeclaration : CONST IDENT VIR expression      #ConsSDAST
                    | VAR IDENT TWO_P typeDenoter             #VarSDAST;

//--------------------------------------------------------------
typeDenoter : IDENT  ;

//--------------------------------------------------------------
expression : primaryExpression (operator primaryExpression)* ;

//--------------------------------------------------------------
primaryExpression : LITERAL
                    | IDENT
                    | L_PARENT expression R_PARENT ;

//--------------------------------------------------------------
operator : SUM | SUB | MUL | DIV | ;

*/
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
                        | VAR IDENT TWO_P typeDenoter                                                                   #varSingleDeclarationAST;

typeDenoter             : IDENT                                                                                         #typeDenoterAST;

expression              : primaryExpression (operator primaryExpression)*                                               #expressionAST;

primaryExpression       : LITERAL                                                                                       #numPrimaryExpressionAST
                        | IDENT                                                                                         #idPrimaryExpressionAST
                        | L_PARENT expression R_PARENT                                                                  #groupPrimaryExpressionAST;

operator                : SUM | SUB | MUL | DIV                                                                         #operatorAST;
