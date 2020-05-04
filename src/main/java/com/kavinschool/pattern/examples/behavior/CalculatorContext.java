package com.kavinschool.pattern.examples.behavior;

public class CalculatorContext {
    private CalculatorStrategy strategy;

    public CalculatorContext(CalculatorStrategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
