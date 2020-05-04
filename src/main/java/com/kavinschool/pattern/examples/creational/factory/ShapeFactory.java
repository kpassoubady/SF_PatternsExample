package com.kavinschool.pattern.examples.creational.factory;

public class ShapeFactory {
    private static ShapeFactory shapeFactoryInstance;

    private ShapeFactory() {
    }

    public static ShapeFactory getInstance() {
        if (shapeFactoryInstance == null) {
            shapeFactoryInstance = new ShapeFactory();
        }
        return shapeFactoryInstance;
    }

    public Shape getShape(ShapeEnum shapeEnum) {
        switch (shapeEnum) {
            case RECTANGLE: {
                return new Rectangle();
            }
            case CIRCLE: {
                return new Circle();
            }
            case SQUARE: {
                return new Square();
            }
            default: {
                return null;
            }
        }
    }
}