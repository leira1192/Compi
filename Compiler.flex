import java_cup.runtime.Symbol;
import java.util.*;
%%
%class Compiler
%unicode
%standalone
%line
%column
%int
%cup
%public

%{
	public Symbol symbol(int type, Object value){
        return new Symbol(type, yyline+1, yycolumn+1, value);
    }
%}

ffvariable_tipo = integer|char|boolean|string|constchar|conststr

ffarray = array
ffof = of

ffwrite = writeln|write
ffleer = readln|read


ffwhile = while
fffor = for
ffto = to
ffdownto = downto
ffdo = do
ffrepeat = repeat


finLinea = \r|\n|\r\n
entradaCaracter = [^\r\n]
WhiteSpace = {finLinea} | [ \t\f]

boolean = true|false

comentario = "/**" [^**] ~"**/"
digito = [0-9]
entero = {digito}{digito}?{digito}?{digito}?
decimal = {entero} "." {digito}{digito}?
letra = [a-zA-Z]
palabra = {letra}*

%%

<YYINITIAL>{

	{boolean} {return new Symbol(sym.BOOLEAN, yyline + 1, yycolumn + 1, yytext());}
	{entero} {System.out.println("Este es un entero "+ yytext());}
	{decimal} {System.out.println("Este es un decimal "+ yytext());}
	{comentario} {System.out.println("Este es un comentario " + yytext());}
	{palabra} {
	if(yytext().equals("true"))
	System.out.println("Esta es una palabra" + yytext());}
 	. {}
}