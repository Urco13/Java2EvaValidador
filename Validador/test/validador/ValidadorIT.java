/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam115
 */
public class ValidadorIT {
    
    private static Validador instance;
    
    public ValidadorIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("***************************************************");
        System.out.println("*************Ejercicio validador*******************");
        System.out.println("***************************************************");
        System.out.println(Integer.MIN_VALUE+" limites "+Integer.MAX_VALUE);
        instance=new Validador();
        assertNotNull(instance);
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
     * Test of menorQue method, of class Validador.
     */
    @Test
    public void testMenorQue() {
        System.out.println("----> CORRECTOS <-----");
        System.out.println("******LIMITES*********");
        System.out.println(" 1-***** -2e31 menorQue 0 es true");
        int a = -2147483648;
        int b = 11;
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.menorQue(a, b);
        assertEquals(expResult, result);
        
        System.out.println(" 2=**** -2147483647 menorQue 0 es true");
        assertEquals(true,instance.menorQue(-2147483647, 0));
        
        System.out.println("****NO LIMITES");
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of mayorQue method, of class Validador.
     */
    @Test
    public void testMayorQue() {
        System.out.println("mayorQue");
        int a = 0;
        int b = 0;
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.mayorQue(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of igualQue method, of class Validador.
     */
    @Test
    public void testIgualQue() {
        System.out.println("igualQue");
        int a = 0;
        int b = 0;
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.igualQue(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
