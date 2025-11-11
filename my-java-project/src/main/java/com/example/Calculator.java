package com.example;

public class Calculator {
    public int add(int a, int b) { return a + b; }

    // bug fixed
    public int subtract(int a, int b) { 
        return a - b; 
    }

    // ✅ handle divide by zero
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed!");
        }
        return a / b;
    }

  
}
