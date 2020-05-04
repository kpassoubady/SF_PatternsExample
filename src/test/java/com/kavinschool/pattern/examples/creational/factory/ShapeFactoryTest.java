package com.kavinschool.pattern.examples.creational.factory;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ShapeFactoryTest {

    @Test
    public void getShape() throws IOException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bo));
        Shape circle1 = ShapeFactory.getInstance().getShape(ShapeEnum.CIRCLE);
        circle1.draw();
        bo.flush();
        String allWrittenLines = new String(bo.toByteArray());
        assertEquals("Circle.draw\n", allWrittenLines);
    }
}