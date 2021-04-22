/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.
Требования:
•	Создай класс Dog.
•	Создай класс Cat.
•	В классе Dog должно быть три переменные.
•	В классе Cat должно быть три переменные.
•	Должен быть создан хотя бы один объект типа Mouse.
•	Должен быть создан хотя бы один объект типа Dog.
•	Должен быть создан хотя бы один объект типа Cat.
*/

public class Main {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 10, 12, 5);
        Cat tomCat = new Cat("Tom",16, 30, 8);
        Dog spikeDog = new Dog("Spike", 17, 50, 2);

        jerryMouse.infoMouse();
        tomCat.infoCat();
        spikeDog.infoDog();
    }
}
class Mouse {
    String name;
    int age;
    int height;
    int tail;

    public Mouse(String name, int age, int height, int tail) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.tail = tail;
    }

    public void infoMouse(){
        System.out.println(this.name + ": ");
        System.out.println("Любит кушать сыр");
        System.out.println("Ему " + this.age + " лет");
        System.out.println("Ростом " + this.height + " см и его хвост " + this.tail + " см\n");
    }
}

class Cat{
    String name;
    int age;
    int height;
    int tail;

    public Cat(String name, int age, int height, int tail) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.tail = tail;
    }

    public void infoCat(){
        System.out.println(this.name + ": ");
        System.out.println("Любит кушать мясо");
        System.out.println("Ему " + this.age + " лет");
        System.out.println("Ростом " + this.height + " см и его хвост " + this.tail + " см\n");
    }
}

class Dog{
    String name;
    int age;
    int height;
    int tail;

    public Dog(String name, int age, int height, int tail) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.tail = tail;
    }

    public void infoDog(){
        System.out.println(this.name + ": ");
        System.out.println("Любит кушать косточки");
        System.out.println("Ему " + this.age + " лет");
        System.out.println("Ростом " + this.height + " см и его хвост " + this.tail + " см");
    }
}
