package net.oop3;

public abstract class Mammals extends Animals {
    private int speed;
    private String typeOfMeals;

    public Mammals(String type, String name, int age, String areal, int speed, String typeOfMeals) {
        super(type, name, age, areal);
        this.speed = Math.max(speed, 0);
        this.typeOfMeals = (typeOfMeals != null & !"".equals(typeOfMeals)) ? typeOfMeals : "Meal";
    }

    public void walk() {
        System.out.println("I walk");
    }

    public int getSpeed() {
        return speed;
    }

    public String getTypeOfMeals() {
        return typeOfMeals;
    }
}
