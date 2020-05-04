package com.kavinschool.pattern.examples.behavior;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorContextTest {

    @Test
    public void executeStrategy() {
        CalculatorContext context = new CalculatorContext(new AddCalculator());
        assertEquals(15, context.executeStrategy(10,5));
    }
}