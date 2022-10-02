package net.oop3;

public class FlyingBirts extends Birts{

    public FlyingBirts(String type, String name, int age, String areal, String typeOfMovement) {
        super(type, name, age, areal, typeOfMovement);
    }

    @Override
    public void go() {
        System.out.println("I walk in the sky");
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
        FlyingBirts flyingBirts = (FlyingBirts) o;
        return getType().equals(flyingBirts.getType()) &&
                getName().equals(flyingBirts.getName()) &&
                getAge() == flyingBirts.getAge() &&
                getAreal().equals(flyingBirts.getAreal()) &&
                getTypeOfMovement().equals(flyingBirts.getTypeOfMovement());
    }
}
