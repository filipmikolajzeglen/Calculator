package com.github.filipmikolajzeglen.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.filipmikolajzeglen.classes.Calculator;
import org.junit.jupiter.api.Test;

public class JunitCalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void addition() {
        assertEquals(1, calculator.add(1));
        assertEquals(4, calculator.add(3));
        assertEquals(5, calculator.add(1));
        assertEquals(20, calculator.apply(15));
    }

    @Test
    void subtraction() {
        assertEquals(-1, calculator.subtract(1));
        assertEquals(-4, calculator.subtract(3));
        assertEquals(-5, calculator.subtract(1));
        assertEquals(10, calculator.apply(15));
    }

    @Test
    void multiplication() {
        assertEquals(2, calculator.add(2)); // initial data initialization
        assertEquals(6, calculator.multiply(3));
        assertEquals(30, calculator.multiply(5));
        assertEquals(30, calculator.apply(0));
    }

    @Test
    void division() {
        assertEquals(20, calculator.add(20)); // initial data initialization
        assertEquals(10, calculator.divide(2));
        assertEquals(2, calculator.divide(5));
        assertEquals(10, calculator.apply(8));
    }

    @Test
    void operations() {
        assertEquals(1, calculator.add(1));
        assertEquals(4, calculator.add(3));
        assertEquals(5, calculator.add(1));
        assertEquals(10, calculator.multiply(2));
        assertEquals(5, calculator.divide(2));
        assertEquals(2, calculator.subtract(3));
        assertEquals(20, calculator.apply(18));
    }
}
