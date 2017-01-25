/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjava01hernandez17;

/**
 *
 * @author hernandez17
 */
import java.io.*;


public class Prjava01hernandez17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        File f = new File("fitxer01hernandez17.html");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(f))){
            bw.write("<html>"); 
            bw.newLine();
            bw.write("  <head>"); 
            bw.newLine();
            bw.write("      <title>"); 
            bw.newLine();
            bw.write("         Nova pàgina web de hernandez17"); 
            bw.newLine();
            bw.write("      </title>"); 
            bw.newLine();
            bw.write("  </head>"); 
            bw.newLine();
            bw.write("  <body>"); 
            bw.newLine();
            bw.write("         DAW2 UF4 Pràctica 2"); 
            bw.newLine();
            bw.write("  </body>"); 
            bw.newLine();
            bw.write("</html>"); 
            bw.newLine();
            bw.close();
        }
    }
}
