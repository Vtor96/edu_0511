/*
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, по вашему усмотрению
Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(2, 5, 5);
        Cat cat2 = new Cat(1, 1, 1);
        Cat cat3 = new Cat(5, 6, 7);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat3));
        System.out.println(cat3.fight(cat1));
    }
}

class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat(int age, int weight, int strength){
        int count = 0;
        count++;

        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        int fightCount = 0;
        fightCount++;

        int agePlus = this.age > anotherCat.age ? 1:0;
        int weightPlus = this.weight > anotherCat.weight ? 1:0;
        int strengthPlus = this.strength > anotherCat.strength ? 1:0;

        int score = agePlus + weightPlus + strengthPlus;
        return score > 2;
    }
}
