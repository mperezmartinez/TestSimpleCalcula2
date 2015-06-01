/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula2;

import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Calcula2Test {
   private float inputNumber;
   private float inputNumber2;
   private int opc;
   private float expectedRes;
   private Calcula2 Calcula2Test;

   @Before
   public void initialize() {
      Calcula2Test = new Calcula2();
   }

   // Each parameter should be placed as an argument here
   // Every time runner triggers, it will pass the arguments
   // from parameters we defined in primeNumbers() method
   public Calcula2Test(float inputNumber,float inputnumber2 , Integer opc ,float expectedRes) {
      this.inputNumber = inputNumber;
      this.inputNumber2=inputnumber2;
      this.opc = opc;
      this.expectedRes=expectedRes;
   }

   @Parameterized.Parameters
   public static Collection Calcula2Test() {
      return Arrays.asList(new Object[][] {
         {2,2,1,4},
         { 4,2,1,6},
         { 8,4,2,4},
         { 2,4,3,8},
         { 9,3,4,3}
      });
   }

    /**
     * Test of realizaOperacion method, of class Calcula2.
     */
    @Test
    public void testRealizaOperacion() {
     System.out.println("Parameterized Number is : " + inputNumber);
      assertEquals(expectedRes, Calcula2.realizaOperacion(inputNumber, inputNumber2, opc),0);
    }
    
}
