package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test void testAdd() { assertEquals(5, new Calculator().add(2, 3)); }

    @Test void testSubtract() { assertEquals(1, new Calculator().subtract(3, 2)); }

    // ✅ Test d’exception : division par zéro
    @Test void testDivideByZero() {
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calc.divide(4, 0));
    }

    @Test void testDivide() { assertEquals(2, new Calculator().divide(4, 2)); }
}
