package com.kavinschool.pattern.examples.creational.builder.internal;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PizzaTest {
    @Test
    public void testPizzaCreation() {
        Pizza pizza1 = new Pizza.PizzaBuilder("Cheese", "wheat","american")
                .withMeat("chicken")
                .withSauceType("tomato")
                .withVegetables(Arrays.asList(new String[]{"Pineapple", "capcicum"}))
                .build();
        //System.out.println("pizza1 = " + pizza1);
        Assert.assertEquals("Pizza[name='Cheese', breadType='wheat', cheese='american', meat='chicken', sauceType='tomato', vegetables=[Pineapple, capcicum]]",
                pizza1.toString());
    }
}