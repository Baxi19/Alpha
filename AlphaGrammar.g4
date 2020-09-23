lexer grammar AlphaGrammar;

//Reserved Keywords
IF : 'if' ;
THEN : 'then' ;
ELSE : 'else' ;
WHILE : 'while' ;
DO : 'do' ;
LET : 'let' ;
IN : 'in' ;
BEGIN : 'begin' ;
END : 'end' ;
CONST : 'const' ;
VAR : 'var' ;



//Operators
ASSING : ':=' ;
SUM : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;
NOT_EQUAL : '/=' ;

// Symbols
PYCOMMA : ';' ;
L_PARENT : '(' ;
R_PARENT : ')' ;
VIRG : '~' ;
TWO_P : ':' ;



//Regular expressions
INTEGER: [1-9][0-9]* | ZERO;

fragment ZERO
    : [0]
    ;

fragment DIGIT
    : [0-9]
    ;

// Letter
IDENT : LETTER(LETTER|DIGIT)*;

fragment LETTER
    : [a-z]
    ;

LITERAL
    : DIGIT DIGIT*
    ;