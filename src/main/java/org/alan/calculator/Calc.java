package org.alan.calculator;

public interface Calc <T extends Number> {

    T addition(T x, T y);
    T subtraction(T x, T y);
    T multiply(T x, T y);
    T divide(T x, T y);


}
