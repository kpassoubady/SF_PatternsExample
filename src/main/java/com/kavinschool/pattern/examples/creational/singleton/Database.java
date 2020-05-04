package com.kavinschool.pattern.examples.creational.singleton;

// Singleton Example
public class Database {
    private static Database databaseInstance;

    private Database() {
    }

    public static Database getInstance() {
        if (databaseInstance == null) {
            databaseInstance = new Database();
        }
        return databaseInstance;
    }

    public String getConnection() {
        return "Connected";
    }
}
