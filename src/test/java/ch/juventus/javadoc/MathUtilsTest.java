package ch.juventus.javadoc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MathUtilsTest {

    @Test
    public void fiveMinusFourShouldEqualOne(){
        MathUtils mathUtils = new MathUtils();
        double resultSub = mathUtils.substraction(5, 4);

        assertEquals(1, resultSub);
    }

    @Test
    public void nineDivideThreeShouldEqualThree() {
        MathUtils mathUtils = new MathUtils();
        double resultDiv = mathUtils.division(9, 3);

        assertEquals(3, resultDiv);
    }

    @Test
    public void sevenMultiplyFourShouldEqualTwentyEight(){
        MathUtils mathUtils = new MathUtils();
        double resultMul = mathUtils.multiplication(7,4);

        assertEquals(28, resultMul);
    }
}



