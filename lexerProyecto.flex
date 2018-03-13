%%
%class lexerProyecto
%unicode
%standalone
%line
%column

%{

	
%}

ENDLINE = \r|\n|\r\n
WHITESPACE = {ENDLINE} | [ \t\f]

COMMENT = "/**" [^**] ~"**/"
DIGIT = [0-9]
NUM = {DIGIT}{DIGIT}?{DIGIT}?{DIGIT}?
DECIMAL = {NUM} "." {DIGIT}{DIGIT}?
LETRA = [a-zA-Z]
ID = {LETRA}({LETRA}|{DIGIT})*
BOOLEAN = "bool" 
BREAK = "break"
BYTE = "byte"
CASE = "case"
CHAR = "char"
FUNC = "func"
DOUBLE = "double"
ELSE = "else"
FOR = "for"
DEFAULT = "default"
INT = "int"
NEW = "new"
IF = "if"
THEN = "then"
SWITCH = "switch"
RETURN = "return"
WHILE = "while"
FF = "ff"
PRINTLN = "println"
TRUE = "true"
FALSE = "false"
NULL = "null"
LPAREN = "("
RPAREN = ")"
LBRACE = "{"
RBRACE = "}"
LBRACK = "["
RBRACK = "]"
SEMICOLON = ";"
COMMA = ","
DOT = "."
ASIG = "="
OPREL = ">"|"<"|"=="|"<="|">="|"!="|"&&"|"||"|"++"|"--"|"*"|"/"|"%"
OPSUMA = "+"|"-"

%%

<YYINITIAL>{
	{BOOLEAN}                      { System.out.println("BOOLEAN"); }
	{BREAK}                        { System.out.println("BREAK"); }
	{BYTE}                         { System.out.println("BYTE"); }
	{CASE}                         { System.out.println("CASE"); }
	{CHAR}                         { System.out.println("CHAR"); }
	{FUNC}                         { System.out.println("FUNC"); }
	{DOUBLE}                       { System.out.println("DOUBLE"); }
	{ELSE}                         { System.out.println("ELSE"); }
	{FOR}                          { System.out.println("FOR"); }
	{DEFAULT}                      { System.out.println("DEFAULT"); }
	{INT}                          { System.out.println("INT"); }
	{NEW}                          { System.out.println("NEW"); }
	{IF}                           { System.out.println("IF"); }
	{THEN}						   { System.out.println("THEN"); }
	{SWITCH}                       { System.out.println("SWITCH"); }
	{RETURN}                       { System.out.println("RETURN"); }
	{WHILE}                        { System.out.println("WHILE"); }
	{THIS}                         { System.out.println("THIS"); }
	{FF}						   { System.out.println("FF"); }
	{PRINTLN}					   { System.out.println("PRINTLN"); }

	/* boolean literals */
	{TRUE}                         { System.out.println("TRUE"); }
	{FALSE}                        { System.out.println("FALSE"); }

	/* null literal */
	{NULL}                         { System.out.println("NULL"); }


	/* separators */
	{LPAREN}                       { System.out.println("LPAREN"); }
	{RPAREN}                       { System.out.println("RPAREN"); }
	{LBRACE}                       { System.out.println("LBRACE"); }
	{RBRACE}                       { System.out.println("RBRACE"); }
	{LBRACK}                       { System.out.println("LBRACK"); }
	{RBRACK}                       { System.out.println("RBRACK"); }
	{SEMICOLON}                    { System.out.println("SEMICOLON"); }
	{COMMA}                        { System.out.println("COMMA"); }
	{DOT}                          { System.out.println("DOT"); }

	/* operators */
	{ASIG}						   { System.out.println("ASIG"); }
	{OPREL}                        { System.out.println("OPREL"); }
	{OPSUMA}					   { System.out.println("OPSUMA"); }

 	/* numeric literals */
	{NUM} 						   { System.out.println("NUM"); }
	{DECIMAL} 					   { System.out.println("NUM"); }
	{ID}  						   { System.out.println("ID"); }	
	{ENDLINE}					   {}
	{WHITESPACE}				   {}
	{COMMENT}					   {}
	. 							   { System.out.println("Error "+ yytext() +" en la linea "+ yyline + ", columna " + yycolumn); }
}