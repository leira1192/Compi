/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocompi1;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniela
 */
public class compi {
    public static void main(String[] args) {
    String path = "./src/proyectocompi1/lexer.flex";
    generarLexer(path);  
    String[] parametros = new String[5];
    parametros[0]="-destdir";
    parametros[1]= "./src/proyectocompi1/";
    parametros[2] = "-parser";
    parametros[3] ="Parser";
    parametros[4]= "./src/proyectocompi1/Parser.cup";

    sintactico(parametros); 
    }    
    public static void generarLexer(String path){
        File file = new File(path);
        jflex.Main.generate(file);
    }
    public static void sintactico(String[] parametros){
        try {
            java_cup.Main.main(parametros);
        } catch (IOException ex) {
            Logger.getLogger(compi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(compi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}