package com.kavinschool.pattern.examples.creational.builder.internal;

import java.util.List;
import java.util.StringJoiner;

public class Pizza {
        private String name;
        private String breadType;
        private String cheese;
        private String meat;
        private String sauceType;
        private List vegetables;


    private Pizza(String name, String breadType, String cheese) {
        this.name = name;
        this.breadType = breadType;
        this.cheese = cheese;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getSauceType() {
        return sauceType;
    }

    public void setSauceType(String sauceType) {
        this.sauceType = sauceType;
    }

    public List getVegetables() {
        return vegetables;
    }

    public void setVegetables(List vegetables) {
        this.vegetables = vegetables;
    }

    public static final class PizzaBuilder {
        private String name;
        private String breadType;
        private String cheese;
        private String meat;
        private String sauceType;
        private List vegetables;

        PizzaBuilder(String name, String breadType, String cheese) {
            this.name = name;
            this.breadType = breadType;
            this.cheese = cheese;
        }

        public static PizzaBuilder aPizza(String name, String breadType, String cheese) {
            return new PizzaBuilder(name, breadType, cheese);
        }

        public PizzaBuilder withMeat(String meat) {
            this.meat = meat;
            return this;
        }

        public PizzaBuilder withSauceType(String sauceType) {
            this.sauceType = sauceType;
            return this;
        }

        public PizzaBuilder withVegetables(List vegetables) {
            this.vegetables = vegetables;
            return this;
        }

        public Pizza build() {
            Pizza pizza = new Pizza(name, breadType, cheese);
            pizza.setMeat(meat);
            pizza.setSauceType(sauceType);
            pizza.setVegetables(vegetables);
            return pizza;
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Pizza.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("breadType='" + breadType + "'")
                .add("cheese='" + cheese + "'")
                .add("meat='" + meat + "'")
                .add("sauceType='" + sauceType + "'")
                .add("vegetables=" + vegetables)
                .toString();
    }
}
