package net.oop3;

public class Herbivores extends Mammals{
    public Herbivores(String type, String name, int age, String areal, int speed, String typeOfMeals) {
        super(type, name, age, areal, speed, typeOfMeals);
    }

    @Override
    public void eat() {
        System.out.println("I eat grass");
    }

    @Override
    public void go() {
        System.out.println("I walk on land");
    }

    public void graze() {
        System.out.println("I graze carefully");
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
        Herbivores herbivores = (Herbivores) o;
        return getType().equals(herbivores.getType()) &&
                getName().equals(herbivores.getName()) &&
                getAge() == herbivores.getAge() &&
                getAreal().equals(herbivores.getAreal()) &&
                getSpeed() == herbivores.getSpeed() &&
                getTypeOfMeals().equals(herbivores.getTypeOfMeals());
    }
}
