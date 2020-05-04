package com.kavinschool.pattern.examples.creational.builder.step;

import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    @Test
    public void newInstanceTest() {
        Human human1 = Human.newInstance().age(10).name("Kangs").build();
        assertEquals("Kangs",human1.getName());
    }
}
