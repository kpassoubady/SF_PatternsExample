package com.kavinschool.pattern.examples.creational.factory;

import com.kavinschool.pattern.examples.creational.factory.Shape;

public class Rectangle implements Shape {

    public Rectangle() {
    }

    @Override
    public void draw() {
        System.out.println("Rectangle.draw");
    }
}
