package ch.bbw.jh;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalculatorTest {
    Calculator testee;

    @Before
    public void setUp(){
        testee = new Calculator();
    }

    @Test
    public void testSummeZweiPositiveIsOk(){
        assertTrue(testee.summe(10, 25) ==35);
    }

    @Test
    public void testSubtractionZweiPositiveIsOk(){
        assertTrue(testee.subtraktion(25, 10) ==15);
    }

    @Test
    public void testSummePositivAndNegativIsOk(){
        assertTrue(testee.summe(-5, 10) ==5);
    }

    @Test
    public void testSubtractionPositiveAndNegativeIsOk(){
        assertTrue(testee.subtraktion(-12, 6) ==-18);
    }

    @Test(expected=ArithmeticException.class)
    public void testExpectedExcpetion(){
        assertTrue(testee.division(8, 0) ==0);
    }

    @Test
    public void testUnexpectedException() throws ArithmeticException{
        assertTrue(testee.division(8, 0) ==6);
    }
}