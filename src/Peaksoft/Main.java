package Peaksoft;



public class Main {

    public static void main(String[] args) {
        Animal[] animal = {new Shark(), new Turtle(), new Eagle()};

        for (Animal anima : animal) {
            if (anima instanceof Shark) {
                ((Shark) anima).attack();
            }
            if (anima.getClass().getName().equals("Peaksoft")) {
                ((Shark) anima).attack();
            }
            if (anima instanceof Turtle) {
                ((Turtle) anima).swim();
            }
            if (anima.getClass().getName().equals("Peaksoft")) {
                ((Turtle) anima).swim();
            }
            if (anima instanceof Eagle) {
                ((Eagle) anima).fly();
            }
            if (anima.getClass().getName().equals("Peaksoft")) ;
        }
        Animal[] fish = {new Shark()};
        Animal[] reptile = {new Turtle()};
        Animal[] bird = {new Eagle()};


    }
}