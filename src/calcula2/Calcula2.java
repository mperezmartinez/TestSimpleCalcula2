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
        
     Modelo contenedor = new Modelo();    
        

        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Primer Numero"));

        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo Numero"));

        contenedor.setNum1(num1);
        contenedor.setNum2(num2);
        

        opc = JOptionPane.showOptionDialog(
                null, "MENU", "ELIJA SU OPERACION", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "+",
                    "-",
                    "x",
                    "/"},
                "Exit") + 1;

        switch (opc) {
            case 1:
                contenedor.setOperacion(1);
                break;
            case 2:
                contenedor.setOperacion(2);
                break;
            case 3:
                contenedor.setOperacion(3);
                break;
            case 4:
                contenedor.setOperacion(4);
            default:
                System.exit(0);
        }
        
        
        
       Calcula2 cal= new Calcula2();
        
        
         
        Vista.imprimir(cal.realizaOpracion(num1, num2, opc));

    }

    public float realizaOpracion(float num1, float num2, int oper) {
        float res = 0;
        if (oper==1) {
            res = num1 + num2;

        }
        if (oper==2) {
            res = num1 - num2;
        }
        if (oper==3) {
            res = num1 * num2;
        }
        if (oper==4) {
            res = num1 / num2;
        }
        return res;
    }

}
