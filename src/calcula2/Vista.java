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
public class Vista {
 
    public static void imprimir(Modelo obj){
        
  if (obj.getOperacion()==1){
     JOptionPane.showMessageDialog(null, "Suma "+obj.getNum1()+"+"+obj.getNum2()+ "= "+obj.getResultado());    
  } 
   if (obj.getOperacion()==2){
     JOptionPane.showMessageDialog(null, "Resta "+obj.getNum1()+"-"+obj.getNum2()+ "= "+obj.getResultado());    
  }
    if (obj.getOperacion()==3){
     JOptionPane.showMessageDialog(null, "Multiplicacion "+obj.getNum1()+"*"+obj.getNum2()+ "= "+obj.getResultado());    
  }
     if (obj.getOperacion()==4){
   JOptionPane.showMessageDialog(null, "Division "+obj.getNum1()+"/"+obj.getNum2()+ "= "+obj.getResultado()); 
  }
    }
    
    
}
