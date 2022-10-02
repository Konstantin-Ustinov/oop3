package net.oop3;

public abstract class Animals {
    private String name;
    private int age;
    private String areal;
    private String type;

    public Animals(String type, String name, int age, String areal) {
        this.type = (type != null & !"".equals(type)) ? type : "herbivores";
        this.name = (name != null & !"".equals(name)) ? name : "Name";
        this.age = Math.max(age, 0);
        this.areal = (areal != null & !"".equals(areal)) ? areal : "Somewhere";
    }

    public abstract void eat();

    public void sleep() {
        System.out.println("I sleeping");
    }

    public abstract void go();

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAreal() {
        return areal;
    }

    public final void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    public final void setAreal(String areal) {
        this.areal = (areal != null & !"".equals(areal)) ? areal : "Somewhere";
    }
}
