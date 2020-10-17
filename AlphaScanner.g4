//--------------------------------------------------------------
lexer grammar AlphaScanner;

//--------------------------------------------------------------
// Symbols
PyCOMMA     : ';' ;
TWO_P       : ':' ;
L_PARENT    : '(' ;
R_PARENT    : ')' ;
VIR         : '~' ;  //para asignacion de const

//--------------------------------------------------------------
//Operators
ASSING      : ':=' ;
SUM         : '+' ;
SUB         : '-' ;
MUL         : '*' ;
DIV         : '/' ;

//Added
NOT_EQUAL   : '/=' ;
GT          : '>';
LT          : '<';
LE          : '<=';
GE          : '>=';
EQUAL       : '==';

//--------------------------------------------------------------
//Reserved Keywords
IF          : 'if' ;
THEN        : 'then' ;
ELSE        : 'else' ;
WHILE       : 'while' ;
DO          : 'do' ;
LET         : 'let' ;
IN          : 'in' ;
BEGIN       : 'begin' ;
END         : 'end' ;
CONST       : 'const' ;
VAR         : 'var' ;


//--------------------------------------------------------------
// Letter
IDENT : LETTER(LETTER|DIGIT)*;

LITERAL
    : DIGIT DIGIT*
    ;

fragment LETTER
    : [a-zA-Z]
    ;

fragment DIGIT
    : [0-9]
    ;

//--------------------------------------------------------------
// skiped words
WS              : [ \r\t\n]+                -> skip ;
BLOCK_COMMENT   : '/*' .*? '*/'             -> skip;
COMMENT    : '//' ~[\r\n]* '\r'? '\n'       -> skip ;