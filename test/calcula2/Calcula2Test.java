/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel
 */
public class Calcula2Test {
    
    public Calcula2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of realizaOperacion method, of class Calcula2.
     */
    @Test
    public void testRealizaOperacion() {
        System.out.println("realizaOperacion");
        float num1 = 2.0F;
        float num2 = 3.0F;
        int oper = 1;
        float expResult = 5.0F;
        float result = Calcula2.realizaOperacion(num1, num2, oper);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
