package advanced;

import lab6.advanced.DoubleCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleCalculatorTest {
    private DoubleCalculator calc;

    @BeforeEach
    public void setUp()
    {
        calc=new DoubleCalculator().init();
    }

    @Test
    public void testAdd()
    {
        calc.add(5.3);
        assertEquals(5.3, calc.result());
    }
    @Test
    public void testSubtract()
    {
        calc.subtract(3.2);
        assertEquals(-3.2, calc.result());
    }
    @Test
    public void testMultiply()
    {
        calc.add(5.2).multiply(2.0);
        assertEquals(10.4, calc.result());
    }
    @Test
    public void testDivide() {
        calc.add(4.0).divide(2.0);
        assertEquals(2.0, calc.result());
    }
    @Test
    public void testMultipleOperations() {
        calc.add(10.5).subtract(2.5).multiply(3.0).divide(4.0);
        assertEquals(6, calc.result());
    }
    @Test
    public void testAddNegative() {
        calc.add(-5.8);
        assertEquals(-5.8, calc.result());
    }
    @Test
    public void testSubtractNegative() {
        calc.subtract(-5.0);
        assertEquals(5, calc.result());
    }
    @Test
    public void testMultiplyWithZero() {
        calc.add(5.0).multiply(0.0);
        assertEquals(0, calc.result());
    }
    @Test
    public void testDivideByOne() {
        calc.add(10.8).divide(1.0);
        assertEquals(10.8, calc.result());
    }
    @Test
    public void testDivideByZero() {
        calc.add(10.6);
        try {
            calc.divide(0.0);
        } catch (ArithmeticException e) {
            assertEquals("/ by zero", e.getMessage());
        }
    }
    @Test
    public void testInitialState() {
        assertEquals(0, calc.result());
    }
    @AfterEach
    public void tearDown()
    {
        calc=null;
    }

}
