%%
%class lexerProyecto
%unicode
%standalone
%line
%column

%{

	
%}

ENDLINE = \r|\n|\r\n
entradaCaracter = [^\r\n]
WHITESPACE = {ENDLINE} | [ \t\f]

COMMENT = "/**" [^**] ~"**/"
DIGIT = [0-9]
NUM = {DIGIT}{DIGIT}?{DIGIT}?{DIGIT}?
DECIMAL = {NUM} "." {DIGIT}{DIGIT}?
LETRA = [a-zA-Z]
PALABRA = {LETRA}*
ID = {LETRA}({LETRA}|{DIGIT})*
BOOLEAN = "bool" 
BREAK = "break"
BYTE = "byte"
CASE = "case"
CHAR = "char"
FUNC = "func"
CONTINUE = "continue"
REPEAT = "repeat"
DO = "do"
TO = "to"
DOUBLE = "double"
ELSE = "else"
FOR = "for"
DEFAULT = "default"
INT = "int"
NEW = "new"
GOTO = "goto"
IF = "if"
THEN = "then"
SWITCH = "switch"
RETURN = "return"
WHILE = "while"
THIS = "this"
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
GT = ">"
LT = "<"
NOT = "!"
QUESTION = "?"
EQEQ = "=="
LTEQ = "<="
GTEQ = ">="
NOTEQ = "!="
AND = "&&"
OR = "||"
PLUSPLUS = "++"
MINUSMINUS = "--"
PLUS = "+"
MINUS = "-"
MULT = "*"
DIV = "/"
MOD = "%"
PLUSEQ = "+="
MINUSEQ = "-="
MULTEQ = "*="
DIVEQ = "/="

%%

<YYINITIAL>{
	{BOOLEAN}                      { System.out.println("BOOLEAN"); }
	{BREAK}                        { System.out.println("BREAK"); }
	{BYTE}                         { System.out.println("BYTE"); }
	{CASE}                         { System.out.println("CASE"); }
	{CHAR}                         { System.out.println("CHAR"); }
	{FUNC}                         { System.out.println("FUNC"); }
	{CONTINUE}                     { System.out.println("CONTINUE"); }
	{REPEAT}                       { System.out.println("REPEAT"); }
	{DO}                           { System.out.println("DO"); }
	{TO}                           { System.out.println("TO"); }
	{DOUBLE}                       { System.out.println("DOUBLE"); }
	{ELSE}                         { System.out.println("ELSE"); }
	{FOR}                          { System.out.println("FOR"); }
	{DEFAULT}                      { System.out.println("DEFAULT"); }
	{INT}                          { System.out.println("INT"); }
	{NEW}                          { System.out.println("NEW"); }
	{GOTO}                         { System.out.println("GOTO"); }
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
	{ASIG}                         { System.out.println("ASIG"); }
	{GT}                           { System.out.println("GT"); }
	{LT}                           { System.out.println("LT"); }
	{NOT}                          { System.out.println("NOT"); }
	{QUESTION}                     { System.out.println("QUESTION"); }
	{EQEQ}                         { System.out.println("EQEQ"); }
	{LTEQ}                         { System.out.println("LTEQ"); }
	{GTEQ}                         { System.out.println("GTEQ"); }
	{NOTEQ}                        { System.out.println("NOTEQ"); }
	{AND}                          { System.out.println("AND"); }
	{OR}                           { System.out.println("OR"); }
	{PLUSPLUS}                     { System.out.println("PLUSPLUS"); }
	{MINUSMINUS}                   { System.out.println("MINUSMINUS"); }
	{PLUS}                         { System.out.println("PLUS"); }
	{MINUS}                        { System.out.println("MINUS"); }
	{MULT}                         { System.out.println("MULT"); }
	{DIV}                          { System.out.println("DIV"); }
	{MOD}                          { System.out.println("MOD"); }
	{PLUSEQ}                       { System.out.println("PLUSEQ"); }
	{MINUSEQ}                      { System.out.println("MINUSEQ"); }
	{MULTEQ}                       { System.out.println("MULTEQ"); }
	{DIVEQ}                        { System.out.println("DIVEQ"); }

 	/* numeric literals */
	{NUM} 						   { System.out.println("NUM"); }
	{DECIMAL} 					   { System.out.println("NUM"); }
	{ID}  						   { System.out.println("ID"M); }	
	{ENDLINE}					   {}
	{WHITESPACE}				   {}
	. 							   { System.out.println("Error "+ yytext() +" en la linea "+ yyline + ", columna " + yycolumn); }
}