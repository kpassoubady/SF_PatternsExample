package com.kavinschool.pattern.examples.creational.builder.step;

import javax.annotation.Generated;

public class Human {
    private String name;
    private int age;
    private int height;

    private Human() {
    }

    public static FinalStep newInstance() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    @Generated(value = "Step Builder Generator Plugin")
    public interface FinalStep {
        Human build();

        FinalStep name(String name);

        FinalStep age(int age);

        FinalStep height(int height);
    }

    @Generated(value = "Step Builder Generator Plugin")
    private static final class Builder implements FinalStep {
        private String name;
        private int age;
        private int height;

        public FinalStep name(String name) {
            this.name = name;
            return this;
        }

        public FinalStep age(int age) {
            this.age = age;
            return this;
        }

        public FinalStep height(int height) {
            this.height = height;
            return this;
        }

        public Human build() {
            Human theObject = new Human();
            theObject.name = name;
            theObject.age = age;
            theObject.height = height;
            return theObject;
        }
    }
}
