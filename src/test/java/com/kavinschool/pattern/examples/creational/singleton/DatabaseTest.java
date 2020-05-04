package com.kavinschool.pattern.examples.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class DatabaseTest {

    @Test
    public void getConnection() {
        Database database =  Database.getInstance();
        assertEquals("Connected",database.getConnection());
    }
}