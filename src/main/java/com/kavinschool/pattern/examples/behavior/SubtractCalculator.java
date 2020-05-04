package com.kavinschool.pattern.examples.behavior;

public class SubtractCalculator implements CalculatorStrategy {
    @Override
    public int doOperation(int x, int y) {
        return x-y;
    }
}
