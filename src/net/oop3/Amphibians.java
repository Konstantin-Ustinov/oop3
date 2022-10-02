package net.oop3;

public class Amphibians extends Animals {
    public Amphibians(String type, String name, int age, String areal) {
        super(type, name, age, areal);
    }

    @Override
    public void eat() {
        System.out.println("I eat bug");
    }

    @Override
    public void go() {
        System.out.println("I walk on land and water");
    }

    public void hunting() {
        System.out.println("I hunt");
    }

    @Override
    public String toString() {
        return "Type: " + getType() +
                ", Name: " + getName() +
                ", Age: " + getAge() +
                ", Areal: " + getAreal();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Amphibians amphibians = (Amphibians) o;
        return getType().equals(amphibians.getType()) &&
                getName().equals(amphibians.getName()) &&
                getAge() == amphibians.getAge() &&
                getAreal().equals(amphibians.getAreal());
    }
}
