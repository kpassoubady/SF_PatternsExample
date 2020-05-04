package com.kavinschool.pattern.examples.creational.factory;

public class Square implements Shape{

    public Square() {
    }

    @Override
    public void draw() {
        System.out.println("Square.draw");
    }
}
