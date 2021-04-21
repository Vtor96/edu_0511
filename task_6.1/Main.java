package FamilyTree;

/* В нашем мире у Person не должно быть больше 100ед. здоровья */

public class Main {
    public static void main (String [] args) {
        Person vlad = new Person("Влад", 75, null, null);
        Person ira = new Person("Ира", 70, null, null);
        Person ivan = new Person("Иван", 65, null, null);
        Person nina = new Person("Нина", 60, null, null);
        Person oleg = new Person("Олег", 40, ira, vlad);
        Person olga = new Person("Ольга", 35, nina, ivan);
        Person igor = new Person("Игорь", 13, olga, oleg);

        /*int medKit = 50;
        System.out.println(oleg.name);
        oleg.setHp(-30);
        System.out.println("Здоровье: " + oleg.getHp());
        oleg.setHp(medKit);
        System.out.println("Здоровье: " + oleg.getHp());*/

        igor.getInfo();
    }
}

class Person {
    private String name;
    private int age;
    private int hp;
    private Person mother;
    private Person father;

    public Person(String name, int age, Person mother, Person father) {
        this.name = name;
        this.age = age;
        this.hp = 100;
        this.mother = mother;
        this.father = father;
    }

    public void getInfo(){
        String info = "Меня зовут: " + this.name + "\n";

        if (this.mother != null){
            info += "Мою маму зовут: " + this.mother.name + "\n";

            if (this.mother.mother != null){
                info += "Бабушку по маме зовут: " + this.mother.mother.name + "\n";
            }

            if (this.mother.father != null){
                info += "Дедушку по маме зовут: " + this.mother.father.name + "\n";
            }
        }

        if (this.father != null){
            info += "Моего папу зовут: " + this.father.name + "\n";

            if (this.father.father != null){
                info += "Дедушку по папе зовут: " + this.father.father.name + "\n";
            }

            if (this.father.mother != null){
                info += "Бабушку по папе зовут: " + this.father.mother.name + "\n";
            }
        }

        System.out.println(info);
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp){
        if (this.hp + hp > 100)
            this.hp = 100;
        else this.hp = this.hp + hp;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }
}
