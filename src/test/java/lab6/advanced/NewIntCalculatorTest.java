package lab6.advanced;

import lab6.advanced.NewIntCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewIntCalculatorTest {
    private NewIntCalculator calc;
    @BeforeEach
    public void setUp()
    {
        calc=new NewIntCalculator().init();
    }

    @Test
    public void testAdd()
    {
        calc.add(5);
        Assertions.assertEquals(5, calc.result());
    }
    @Test
    public void testSubtract()
    {
        calc.subtract(3);
        Assertions.assertEquals(-3, calc.result());
    }
    @Test
    public void testMultiply()
    {
        calc.add(5).multiply(2);
        Assertions.assertEquals(10, calc.result());
    }
    @Test
    public void testDivide() {
        calc.add(4).divide(2);
        Assertions.assertEquals(2, calc.result());
    }
    @Test
    public void testMultipleOperations() {
        calc.add(10).subtract(2).multiply(3).divide(4);
        Assertions.assertEquals(6, calc.result());
    }
    @Test
    public void testAddNegative() {
        calc.add(-5);
        Assertions.assertEquals(-5, calc.result());
    }
    @Test
    public void testSubtractNegative() {
        calc.subtract(-5);
        Assertions.assertEquals(5, calc.result());
    }
    @Test
    public void testMultiplyWithZero() {
        calc.add(5).multiply(0);
        Assertions.assertEquals(0, calc.result());
    }
    @Test
    public void testDivideByOne() {
        calc.add(10).divide(1);
        Assertions.assertEquals(10, calc.result());
    }
    @Test
    public void testDivideByZero() {
        calc.add(10);
        try {
            calc.divide(0);
        } catch (ArithmeticException e) {
            Assertions.assertEquals("/ by zero", e.getMessage());
        }
    }
    @Test
    public void testInitialState() {
        Assertions.assertEquals(0, calc.result());
    }
    @AfterEach
    public void tearDown()
    {
        calc=null;
    }

}
