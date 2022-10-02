package net.oop3;

public abstract class Birts extends Animals{
    private String typeOfMovement;
    public Birts(String type, String name, int age, String areal, String typeOfMovement) {
        super(type, name, age, areal);
        this.typeOfMovement = (typeOfMovement != null & !"".equals(typeOfMovement)) ? typeOfMovement : "typeOfMovement";
    }

    public void eat() {
        System.out.println("I eat by beak");
    }

    public void hunting() {
        System.out.println("I hunt");
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }
}
