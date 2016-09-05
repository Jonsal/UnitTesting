package se.newton.yapp.unittesting;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    /**
     * Test of Add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        int x = 4;
        int y = 5;
        Calculator instance = new Calculator();
        int expResult = 9;
        int result = instance.Add(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of Subtract method, of class Calculator.
     */
    @Test
    public void testSubtract() {
        System.out.println("Subtract");
        int x = 9;
        int y = 5;
        Calculator instance = new Calculator();
        int expResult = 4;
        int result = instance.Subtract(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of Multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("Multiply");
        int x = 4;
        int y = 4;
        Calculator instance = new Calculator();
        int expResult = 16;
        int result = instance.Multiply(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of Divide method, of class Calculator.
     */
    @Test
    public void testDivide() {
        System.out.println("Divide");
        int x = 8;
        int y = 2;
        Calculator instance = new Calculator();
        int expResult = 4;
        int result = instance.Divide(x, y);
        assertEquals(expResult, result);
    }   
}