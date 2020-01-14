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

    //SUMME TESTCASES
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
        System.out.println(testee.summe(Integer.MAX_VALUE, 3));
    }
    @Test
    public void testSummeMIN_VALUEIsOk(){
        assertTrue(testee.summe(Integer.MIN_VALUE, 5) == Integer.MIN_VALUE+5);
        System.out.println(testee.summe(Integer.MIN_VALUE, 5));
    }
    @Test
    public void testSummeTwoNegativesIsOk(){
        assertTrue(testee.summe(-23, -12) ==-35);
    }
    @Test
    public void testSummeMAX_VALUEAndNegativeIsOk(){
        assertTrue(testee.summe(Integer.MAX_VALUE, -5) == Integer.MAX_VALUE-5);
        System.out.println(testee.summe(Integer.MAX_VALUE, -5));
    }
    @Test
    public void testSumMIN_VALUEAndNegativeIsOk(){
        assertTrue(testee.summe(Integer.MIN_VALUE, -6) == Integer.MIN_VALUE-6);
        System.out.println(testee.summe(Integer.MIN_VALUE, -6));
    }


    //SUBTRAKTION TESTCASES
    @Test
    public void testSubtractionZweiPositiveIsOk(){
        assertTrue(testee.subtraktion(25, 10) ==15);
    }
    @Test
    public void testSubtractionPositiveAndNegativeIsOk(){
        assertTrue(testee.subtraktion(-12, 6) ==-18);
    }
    @Test
    public void testSubtractionPositiveAndNullIsOk(){
        assertTrue(testee.subtraktion(6, 0) ==6);
    }
    @Test
    public void testSubtractionMAX_VALUEIsOk(){
        assertTrue(testee.subtraktion(Integer.MAX_VALUE, 98) == Integer.MAX_VALUE-98);
        System.out.println(testee.subtraktion(Integer.MAX_VALUE, 98));
    }
    @Test
    public void testSubtractionMIN_VALUEIsOk(){
        assertTrue(testee.subtraktion(Integer.MIN_VALUE, 34) == Integer.MIN_VALUE-34);
        System.out.println(testee.subtraktion(Integer.MIN_VALUE, 34));
    }
    @Test
    public void testSubtractionTwoNegarivesIsOk(){
        assertTrue(testee.subtraktion(-37, -43) ==6);
    }
    @Test
    public void testSubtractionMAX_VALUEAndNegativeIsOk(){
        assertTrue(testee.subtraktion(Integer.MAX_VALUE, -21) == Integer.MAX_VALUE+21);
        System.out.println(testee.subtraktion(Integer.MAX_VALUE, -21));
    }
    @Test
    public void testSubtractionMIN_VALUEAndNegativeIsOk(){
        assertTrue(testee.subtraktion(Integer.MIN_VALUE, -42) == Integer.MIN_VALUE+42);
        System.out.println(testee.subtraktion(Integer.MIN_VALUE, -41));
    }


    //DIVISION TESTCASES
    @Test
    public void testDivisionTwoPositiveIsOk(){
        assertTrue(testee.division(24, 6) ==4);
    }
    @Test
    public void testDivisionTwoPositiveAndNegativeIsOk(){
        assertTrue(testee.division(35, -5) == -7);
    }
    @Test
    public void testDivisionMAX_VALUEAndPositiveIsOk(){
        assertTrue(testee.division(Integer.MAX_VALUE, 2) ==Integer.MAX_VALUE/2);
        System.out.println(testee.division(Integer.MAX_VALUE, 2));
    }
    @Test
    public void testDivisionMIN_VALUEAndPositive(){
        assertTrue(testee.division(Integer.MIN_VALUE, 4) ==Integer.MIN_VALUE/4);
        System.out.println(testee.division(Integer.MIN_VALUE, 4));
    }
    @Test
    public void testSubtractionTwoNegativeIsOk(){
        assertTrue(testee.division(-42, -7) ==6);
    }
    @Test
    public void testDivisionMAX_VALUEAndNegativeIsOk(){
        assertTrue(testee.division(Integer.MAX_VALUE, -8) == Integer.MAX_VALUE/-8);
        System.out.println(testee.division(Integer.MAX_VALUE, -8));
    }
    @Test(expected=ArithmeticException.class)
    public void testExpectedExcpetion(){
        assertTrue(testee.division(8, 0) ==0);
    }
    /*@Test
    public void testUnexpectedException() throws ArithmeticException{
        assertTrue(testee.division(8, 0) ==0);
    }*/


    //OTHER TESTCASES
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