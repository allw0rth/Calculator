package org.alan.calculator;


public class DoubleCalc implements Calc <Double> {

    public Double addition(Double x, Double y) {
        return x + y;
    }

    public Double subtraction(Double x, Double y) {
        return x - y;
    }

    public Double multiply(Double x, Double y) {
        return x * y;
    }

    public Double divide(Double x, Double y) {
        if (y.intValue() == 0) {
            throw new IllegalArgumentException("Could not divide by zero");
        }
        return x / y;
    }
}
