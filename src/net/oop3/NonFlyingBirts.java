package net.oop3;

import java.util.Objects;

public class NonFlyingBirts extends Birts{

    public NonFlyingBirts(String type, String name, int age, String areal, String typeOfMovement) {
        super(type, name, age, areal, typeOfMovement);
    }

    @Override
    public void go() {
        System.out.println("I walk on land");
    }

    @Override
    public String toString() {
        return "Type: " + getType() +
                ", Name: " + getName() +
                ", Age: " + getAge() +
                ", Areal: " + getAreal() +
                ", Type of movement: " + getTypeOfMovement();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NonFlyingBirts nonFlyingBirts = (NonFlyingBirts) o;
        return getType().equals(nonFlyingBirts.getType()) &&
                getName().equals(nonFlyingBirts.getName()) &&
                getAge() == nonFlyingBirts.getAge() &&
                getAreal().equals(nonFlyingBirts.getAreal()) &&
                getTypeOfMovement().equals(nonFlyingBirts.getTypeOfMovement());
    }

}
