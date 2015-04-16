/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula2;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Calcula2 {

    /**
     * @param args the command line arguments
     */
    
     static int opc;
    public static void main(String[] args) {
      

     int num1=Integer.parseInt(  JOptionPane.showInputDialog(null, "Primer Numero"));
        
     int num2=Integer.parseInt(  JOptionPane.showInputDialog(null, "Segundo Numero"));
     
     
     
     
            
                opc = JOptionPane.showOptionDialog(
                        null, "MENU", "ELIJA SU OPERACION", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                            "+",
                            "-",
                            "x",
                            "/"},
                        "Exit") + 1;

                switch (opc) {
                    case 1:
                      
                        break;
                    case 2:
                 
                        break;
                    case 3:
                      
                        break;
                    case 4:
                     
                    default:
                        System.exit(0);
                }

    }
    
    public void realizaOpracion(float num1,float num2 ,String oper){
        
        
        
        
        
    }
    
    
}
