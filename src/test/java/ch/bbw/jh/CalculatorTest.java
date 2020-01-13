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
    public void testSummePositivAndNegativIsOk(){
        assertTrue(testee.summe(-5, 10) ==5);
    }

    @Test
    public void testSummePositiveAndNullIsOk(){
        assertTrue(testee.summe(3, 0) ==3);
    }

    @Test
    public void testSummeMAX_VALUEIsOk(){
        assertTrue(testee.summe(Integer.MAX_VALUE, 3) == Integer.MAX_VALUE+3);
    }

    @Test
    public void testSummeMIN_VALUEIsOk(){
        assertTrue(testee.summe(Integer.MIN_VALUE, 5) == Integer.MIN_VALUE+5);
    }

    @Test
    public void testSummeTwoNegativesIsOk(){
        assertTrue(testee.summe(-23, -12) ==-35);
    }

    @Test
    public void testSummeMAX_VALUEAndNegativeIsOk(){
        assertTrue(testee.summe(Integer.MAX_VALUE, -5) == Integer.MAX_VALUE+-5);
    }

    @Test
    public void testSumMIN_VALUEAndNegativeIsOk(){
        assertTrue(testee.summe(Integer.MIN_VALUE, -6) == Integer.MIN_VALUE+-6);
    }







    @Test
    public void testSubtractionZweiPositiveIsOk(){
        assertTrue(testee.subtraktion(25, 10) ==15);
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

    @Test
    public void testProtectedMethod(){
        assertTrue(testee.protectedSumme(22, 4) ==26);
    }

    //Kann nicht auf die Methode zugreifen, da sie private ist.
    /*@Test
    public void testPrivateMethod(){
        assertTrue(testee.privateSumme(50, 12) ==62);
    }*/
}