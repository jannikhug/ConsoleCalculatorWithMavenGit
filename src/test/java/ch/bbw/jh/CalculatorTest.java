package ch.bbw.jh;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {
    Calculator testee;

    @BeforeEach
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
}