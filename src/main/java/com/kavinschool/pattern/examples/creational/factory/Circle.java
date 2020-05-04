package com.kavinschool.pattern.examples.creational.factory;

import com.kavinschool.pattern.examples.creational.factory.Shape;

public class Circle  implements Shape {

    public Circle() {
    }

    @Override
    public void draw() {
        System.out.println("Circle.draw");
    }
}
