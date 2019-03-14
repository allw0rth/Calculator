package org.alan.calculator;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class DoubleCalcTest {
    private DoubleCalc calc;

    @BeforeClass
    public void setup() {
        calc = new DoubleCalc();
    }

    @DataProvider
    public static Object[][] divideTest() {
        return new Object[][] {
                {100.0, -10.0, -10.0},
                {50.0, -10.0, -5.0}
        };
    }

    @Test (expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = ".*zero")
    public void shouldNotAllowDivideByZero() {
        calc.divide(100.0, 0.0);
    }

    @Test(dataProvider = "divideTest")
    public void shouldDivideByOperands(Double x, Double y, Double res) {
        Double result = calc.divide(x, y);
        assertThat(result)
                .isEqualTo(res);

    }

    @DataProvider
    public static Object[][] multiplyTest() {
        return new Object[][] {
                {100.0, -10.0, -1000.0},
                {50.0, -10.0, -500.0}
        };
    }

    @Test(dataProvider = "multiplyTest")
    public void shouldMultiplyCorrectly(Double x, Double y, Double res) {
        Double result = calc.multiply(x, y);
        assertThat(result)
                .isEqualTo(res);

    }

    @DataProvider
    public static Object[][] additionTest() {
        return new Object[][] {
                {100.0, -10.0, 90.0},
                {50.0, -10.0, 40.0}
        };
    }

    @Test(dataProvider = "additionTest")
    public void shouldAddCorrectly(Double x, Double y, Double res) {
        Double result = calc.addition(x, y);
        assertThat(result)
                .isEqualTo(res);

    }

    @DataProvider
    public static Object[][] subtractionTest() {
        return new Object[][] {
                {100.0, -10.0, 110.0},
                {50.0, -10.0, 60.0}
        };
    }

    @Test(dataProvider = "subtractionTest")
    public void shouldSubtractCorrectly(Double x, Double y, Double res) {
        Double result = calc.subtraction(x, y);
        assertThat(result)
                .isEqualTo(res);

    }



}
