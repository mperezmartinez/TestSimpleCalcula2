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
    static Modelo contenedor;

    public static void main(String[] args) {

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
                contenedor.setOperacion("SUMA");
                break;
            case 2:
                contenedor.setOperacion("RESTA");
                break;
            case 3:
                contenedor.setOperacion("MULTIPLICAR");
                break;
            case 4:
                contenedor.setOperacion("DIVIDIR");
            default:
                System.exit(0);
        }

    }

    public float realizaOpracion(float num1, float num2, String oper) {

        if ("SUMA".equals(oper)) {
            float res= num1+num2;
            return ("Suma = "+res);
        }
        if ("RESTA".equals(oper)) {

        }
        if ("MULTIPLICAR".equals(oper)) {

        }
        if ("DIVIDIR".equals(oper)) {

        }
        
    }

}
