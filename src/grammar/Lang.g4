grammar Lang;

// whitespace
NEWLINE : '\r'? '\n' ;
SPACE : [ \t\r\n]+  -> channel(HIDDEN);  // skip spaces, tabs, newlines

// keywords
MAIN_ID : 'main';
FUN_DECLARE : 'function';
TYPE_INT : 'int';
TYPE_FLOAT : 'float';
TYPE_CHAR : 'char';
TYPE_ARRAY : 'array';
TYPE_STRING : 'string';
FUN_PRINT : 'print';
END : 'end';

IF : 'if';
FI : 'fi';
ELSE : 'else';
FOR	: 'for';
WHILE : 'while';
AND : 'and';
OR : 'or';
NOT : 'not';
DO : 'do';
OD : 'od';
TO : 'to';

//operators
PLUS : '+';
MINUS : '-';
MULT :'*';
DIVIDE : '/';
MOD : '%' ;

L_CBR : '[';
R_CBR : ']';
L_BR : '(';
R_BR : ')';
QUOTES : '"';
COMMA : ',';
COLON : ':';
SEMICOLON : ';';
ASSIGN : '=';
EQUALS : '==';
NOT_EQUALS : '<>';
MORE_THAN : '>';
LESS_THAN : '<';

// literals
INT	:	'0'|[1-9][0-9]* ;
FLOAT : INT '.' [0-9]+ ;
CHAR  :  [a-z|A-Z] ;
STRING  :	QUOTES (CHAR|INT|' ')* QUOTES ;
NULL : 'null';

// identifier
ID : (CHAR|'_') (CHAR|INT|'_')* ;

program : MAIN L_BR R_BR statement+ END ;
statement 	:
                (var_define
                | assign
                | fun_print
                | if_stat
                | while_stat
                | for_stat)
                NEWLINE
                ;

var_define 	:
        type ID ASSIGN var_value NEWLINE
        ;

type :
       TYPE_INT
       | TYPE_STRING
       | TYPE_CHAR
       | TYPE_ARRAY
       | TYPE_FLOAT
       ;

var_value	:
	 ID
	|INT
	|FLOAT
	|CHAR
	|STRING
	|NULL
;

assign 	:	ID ASSIGN expr ;

fun_print :	FUN_PRINT L_BR expr R_BR ;

if_stat	:	IF L_BR expr R_BR
            statement+
            (ELSE statement+ )*
            FI ;

while_stat :
            (WHILE L_BR expr R_BR
            statement+
            OD )
            | (DO
            statement+
            WHILE L_BR expr R_BR)
            ;

for_stat :
        FOR L_BR for_expr R_BR
        statement +
        OD
        ;

for_expr :
        assign TO expr
        | ID COLON ID
        ;

expr :
	mult ((PLUS|MINUS) mult)*
;
mult :
	subexpr (MULT|DIVIDE|MOD subexpr)*
;
subexpr :
	L_BR expr R_BR
	| var_value
;










