package net.oop3;

public class Main {

    public static void main(String[] args) {
        Animals[] animals = new Animals[14];
        animals[0] = new Herbivores("gazelle", "John", 5, "savanna", 60, "grass");
        animals[1] = new Herbivores("giraffe", "Poul", 7, "savanna", 0, "sheets");
        animals[2] = new Herbivores("horse", "Adam", 2, "zoo", 60, "hay");
        animals[3] = new Predator("hyena", "Padla", 165, "Africa", 60, "slate meet");
        animals[4] = new Predator("tiger", "Rafshan", 6, "Africa", 70, "fresh meet");
        animals[5] = new Predator("bear", "Michael", 10, "zoo", 60, "fresh meet");
        animals[6] = new Amphibians("frog", "Beatrice", 2, "swamp");
        animals[7] = new Amphibians("snake", "Ban", 1, "swamp");
        animals[8] = new NonFlyingBirts("peacock", "Jozefina", 3, "zoo", "By lags");
        animals[9] = new NonFlyingBirts("penguin", "Bo", 4, "zoo", "By lags");
        animals[10] = new NonFlyingBirts("dodo", "Do", 2, "zoo", "By lags");
        animals[11] = new FlyingBirts("seagull", "Fy", 9, "anywhere", "By wings");
        animals[12] = new FlyingBirts("albatross", "Alba", 5, "anywhere", "By wings");
        animals[13] = new FlyingBirts("falcon", "Falcon", 2, "anywhere", "By wings");

        for (Animals animal : animals) {
            System.out.println(animal.getClass().getName());
            System.out.println(animal.toString());
        }

        System.out.println(animals[1].equals(animals[2]));

    }
}
