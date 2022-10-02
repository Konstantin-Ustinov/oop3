package net.oop3;

public class Predator extends Mammals{
    public Predator(String type, String name, int age, String areal, int speed, String typeOfMeals) {
        super(type, name, age, areal, speed, typeOfMeals);
    }

    @Override
    public void eat() {
        System.out.println("I eat meat");
    }

    @Override
    public void go() {
        System.out.println("I walk on land");
    }

    public void hunting() {
        System.out.println("I hunt");
    }

    @Override
    public String toString() {
        return "Type: " + getType() +
                ", Name: " + getName() +
                ", Age: " + getAge() +
                ", Areal: " + getAreal() +
                ", Speed: " + getSpeed() +
                ", Type of meals: " + getTypeOfMeals();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Predator predator = (Predator) o;
        return getType().equals(predator.getType()) &&
                getName().equals(predator.getName()) &&
                getAge() == predator.getAge() &&
                getAreal().equals(predator.getAreal()) &&
                getSpeed() == predator.getSpeed() &&
                getTypeOfMeals().equals(predator.getTypeOfMeals());
    }
}
