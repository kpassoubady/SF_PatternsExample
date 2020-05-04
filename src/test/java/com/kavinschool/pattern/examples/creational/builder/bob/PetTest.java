package com.kavinschool.pattern.examples.creational.builder.bob;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetTest {

    @Test
    public void builderTest() {
        Pet pet1 = Pet.builder().setAge(2).setColor("blue").setHeight(1.5f).setName("blue whale").setWeight(3.2f).build();
        assertEquals(pet1.getName(),"blue whale");
    }
}