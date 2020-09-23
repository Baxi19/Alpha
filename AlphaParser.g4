parser grammar AlphaParser;

options {
    tokenVocab = AlphaGrammar;
}

program :  single_command;
command : IDENT (PYCOMMA single_command)*;
single_command
    : IDENT ( ASSING  expression | L_PARENT expression R_PARENT )
    | IF expression THEN single_command ELSE single_command
    | WHILE expression DO single_command
    | LET declaration IN single_command
    | BEGIN command END;
declaration : single_declaration (PYCOMMA single_declaration )*;
single_declaration
    : CONST IDENT VIRG expression
    | VAR IDENT TWO_P IDENT;

operator
    : SUM
    | SUB
    | DIV
    | MUL ;

expression: primary_exp  (operator primary_exp)*;
primary_exp
    : LITERAL
    | IDENT
    | L_PARENT expression R_PARENT;
