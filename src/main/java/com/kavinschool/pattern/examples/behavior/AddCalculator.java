package com.kavinschool.pattern.examples.behavior;


//Strategy Pattern Example
public class AddCalculator implements CalculatorStrategy {

    @Override
    public int doOperation(int x, int y) {
        return x + y;
    }

}
