/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal,
в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse,
в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/

public class Main{
    public static void main(String[] args){
        Horse horse = new Horse("Horse");
        Horse.Pegasus pegasus = new Horse.Pegasus("Pegas");

        horse.run();
        pegasus.fly();
    }
}

abstract class Animals{
    String name;

    public Animals(String name){
        this.name = name;
    }
}

class Horse extends Animals {
    public Horse(String name) {
        super(name);
    }

    public void run() {
        System.out.println(this.name + ": Игого, я поскакал(а)");
    }

    static class Pegasus extends Horse {
        public Pegasus(String name) {
            super(name);
        }

        public void fly() {
            System.out.println(this.name + ": Игого, я полетел(а)");
        }
    }
}
