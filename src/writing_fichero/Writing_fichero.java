/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package writing_fichero;

import java.io.*;

/**
 *
 * @author vant
 */
public class Writing_fichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Escritura accede_es = new Escritura();
        
        accede_es.Escriu();
        
    }
    
}
class Escritura{
    
    public void Escriu (){
        
        String valor = "El valor de NO3 es ";

        try {
            
            FileWriter medicions = new FileWriter ("/home/vant/Archivos/valors.txt/prueba2.txt");
            
            
            for(int i = 0; i > valor.length(); i++){
                
                medicions.write(valor.charAt(i));
            }
            
            
        } catch (IOException ex) {
            System.out.println("No se encuentra el archivo");        }
    }
    
}

