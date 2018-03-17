%%
%class lexerProyecto
%unicode
%standalone
%line
%column
%char
%ignorecase

ENDLINE = \r|\n|\r\n
WHITESPACE = {ENDLINE} | [ \t\f]
STRING = [\"] [^\"\n]+ [\"\n]

COMMENT = "/**" [^**] ~"**/"
DIGIT = [0-9]
NUM = {DIGIT}{DIGIT}?{DIGIT}?{DIGIT}?
DECIMAL = {NUM} "." {DIGIT}{DIGIT}?
LETRA = [a-zA-Z]
ID = {LETRA}({LETRA}|{DIGIT})*
TK_BOOLEAN = "bool" 
TK_BREAK = "break"
TK_CASE = "case"
TK_STRING = "string"
TK_CHAR = "char"
TK_FUNC = "func"
TK_DOUBLE = "double"
TK_ELSE = "else"
TK_FOR = "for"
TK_DEFAULT = "default"
TK_INT = "int"
TK_IF = "if"
TK_THEN = "then"
TK_SWITCH = "switch"
TK_RETURN = "return"
TK_WHILE = "while"
TK_THIS = "this"
TK_PRINTLN = "println"
TK_TRUE = "true"
TK_FALSE = "false"
TK_NULL = "null"
TK_LPAREN = "("
TK_RPAREN = ")"
TK_LBRACE = "{"
TK_RBRACE = "}"
TK_LBRACK = "["
TK_RBRACK = "]"
TK_SEMICOLON = ";"
TK_COMMA = ","
TK_DOT = "."
TK_ASIG = "="

GT = ">"
LT = "<"
EQEQ = "=="
LTEQ = "<="
GTEQ = ">="
NOTEQ = "!="
TK_OPLOG = GT | LT | EQEQ | LTEQ | GTEQ | NOTEQ

TK_PLUSPLUS = "++"
TK_MINUSMINUS = "--"

PLUS = "+"
MINUS = "-"
MULT = "*"
DIV = "/"
MOD = "%"
TK_OPMAT = PLUS | MINUS | MULT | DIV | MOD

AND = "&&"
OR = "||"
TK_OPREL = AND | OR

%%

<YYINITIAL>{
	{TK_BOOLEAN}                      { System.out.println("TK_BOOLEAN"); }
	{TK_BREAK}                        { System.out.println("TK_BREAK"); }
	{TK_CASE}                         { System.out.println("TK_CASE"); }
	{TK_CHAR}                         { System.out.println("TK_CHAR"); }
	{TK_STRING} 					   { System.out.println("TK_STRING"); }
	{TK_FUNC}                         { System.out.println("TK_FUNC"); }
	{TK_DOUBLE}                       { System.out.println("TK_DOUBLE"); }
	{TK_ELSE}                         { System.out.println("TK_ELSE"); }
	{TK_FOR}                          { System.out.println("TK_FOR"); }
	{TK_DEFAULT}                      { System.out.println("TK_DEFAULT"); }
	{TK_INT}                          { System.out.println("TK_INT"); }
	{TK_IF}                           { System.out.println("TK_IF"); }
	{TK_THEN}						   { System.out.println("TK_THEN"); }
	{TK_SWITCH}                       { System.out.println("TK_SWITCH"); }
	{TK_RETURN}                       { System.out.println("TK_RETURN"); }
	{TK_WHILE}                        { System.out.println("TK_WHILE"); }
	{TK_PRINTLN}					   { System.out.println("TK_PRINTLN"); }

	/* boolean literals */
	{TK_TRUE}                         { System.out.println("TK_TRUE"); }
	{TK_FALSE}                        { System.out.println("TK_FALSE"); }

	/* null literal */
	{TK_NULL}                         { System.out.println("TK_NULL"); }


	/* separators */
	{TK_LPAREN}                       { System.out.println("TK_LPAREN"); }
	{TK_RPAREN}                       { System.out.println("TK_RPAREN"); }
	{TK_LBRACE}                       { System.out.println("TK_LBRACE"); }
	{TK_RBRACE}                       { System.out.println("TK_RBRACE"); }
	{TK_LBRACK}                       { System.out.println("TK_LBRACK"); }
	{TK_RBRACK}                       { System.out.println("TK_RBRACK"); }
	{TK_SEMICOLON}                    { System.out.println("TK_SEMICOLON"); }
	{TK_COMMA}                        { System.out.println("TK_COMMA"); }
	{TK_DOT}                          { System.out.println("TK_DOT"); }

	/* operators */
	{TK_ASIG}                         { System.out.println("TK_ASIG"); }
	{TK_OPLOG}						   { System.out.println("TK_OPLOG"); }
	{TK_OPMAT}						   { System.out.println("TK_OPMAT"); }
	{TK_OPREL}						   { System.out.println("TK_OPREL"); }
	{TK_PLUSPLUS}                     { System.out.println("TK_PLUSPLUS"); }
	{TK_MINUSMINUS}                   { System.out.println("TK_MINUSMINUS"); }

 	/* numeric literals */
	{ENDLINE}					   {}
	{WHITESPACE}				   {}
	{COMMENT}					   {}
	{NUM} 						   { System.out.println("NUM"); }
	{DECIMAL} 					   { System.out.println("NUM"); }
	{STRING} 					   { System.out.println("STRING"); }
	{ID}  						   { System.out.println("ID"); }	
	. 							   { System.out.println("Error "+ yytext() +" en la linea "+ yyline + ", columna " + yycolumn); }
} 