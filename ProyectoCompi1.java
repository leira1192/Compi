/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocompi1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniela
 */
public class ProyectoCompi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     // try {
/*     parser p = new parser(new lexer(new FileReader(argv)));
      Object result = p.parse().value;      
    } catch (Exception e) {
      e.printStackTrace();
    }*/
    System.out.println("----------------COMETMACH---------------");
        File file;
        file = new File("./src/proyectocompi1/test.txt");
        try {
            lexer Lexical = new lexer(new FileReader(file));
            Parser parser = new Parser(Lexical);
        try {
            parser.parse();
        } catch (Exception ex) {
            Logger.getLogger(ProyectoCompi1.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProyectoCompi1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
