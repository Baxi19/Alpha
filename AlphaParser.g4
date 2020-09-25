//--------------------------------------------------------------
parser grammar AlphaParser;

//--------------------------------------------------------------
options {
    tokenVocab = AlphaGrammar;
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

//--------------------------------------------------------------
program :  single_command; //EOF

//--------------------------------------------------------------
command : IDENT (PyCOMMA single_command)*;

//--------------------------------------------------------------
single_command
    : IDENT ( ASSING  expression | L_PARENT expression R_PARENT )
    | IF expression THEN single_command ELSE single_command
    | WHILE expression DO single_command
    | LET declaration IN single_command
    | BEGIN command END;

//--------------------------------------------------------------
declaration : single_declaration (PyCOMMA single_declaration )*;
single_declaration
    : CONST IDENT VIR expression
    | VAR IDENT TWO_P IDENT;

//--------------------------------------------------------------
operator
    : SUM
    | SUB
    | DIV
    | MUL ;

//--------------------------------------------------------------
expression: primary_exp  (operator primary_exp)*;
primary_exp
    : LITERAL
    | IDENT
    | L_PARENT expression R_PARENT;
//--------------------------------------------------------------
