/*
Задача вывести на экран такое сообщение (для объекта gosha):
Меня зовут "имя объекта"
Имя моей мамы: "имя мамы"
Имя моего папы: "имя папы"
У меня две бабушки, бабушка "имя бабушки" и "имя бабушки"
У меня два деда, деда "имя деда" и "имя деда"
*/

public class Main {
    public static void main(String[] args) {
        Person valera = new Person("Валера","Иванов",69,null,null);
        Person olga = new Person("Ольга","Иванова",67,null,null);
        Person oleg = new Person("Олег","Петров",65,null,null);
        Person jula = new Person("Юля","Петрова",67,null,null);
        Person alex = new Person("Алексей","Иванов",37,olga,valera);
        Person eva  = new Person("Ева","Иванова",37,jula,oleg);
        Person gosha= new Person("Гоша","Иванов",10,eva,alex);

        gosha.getInfo();
    }
}

class Person{
    private String name;
    private String lastname;
    private int age;
    private Person mother;
    private Person father;

    public Person(String name, String lastname, int age, Person mother, Person father){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    public void getInfo(){
        String info = "Меня зовут: " + this.lastname + " " + this.name + "\n";

        if ((this.mother != null) && (this.father != null)){
            info += "Имя моей мамы: " + this.mother.lastname + " " + this.mother.name + "\n";
            info += "Имя моего папы: " + this.father.lastname + " " + this.father.name + "\n";
            info += "У меня две бабушки и два дедушки:" + "\n";


            if (this.mother != null) {
                if (this.mother.mother != null) {
                    info += "Бабушку по маме зовут: " + this.mother.mother.lastname + " " + this.mother.mother.name + "\n";
                }

                if (this.mother.father != null) {
                    info += "Дедушку по маме зовут: " + this.mother.father.lastname + " " + this.mother.father.name + "\n";
                }
            }

            if (this.father != null) {
                if (this.father.father != null) {
                    info += "Дедушку по папе зовут: " + this.father.father.lastname + " " + this.father.father.name + "\n";
                }

                if (this.father.mother != null) {
                    info += "Бабушку по папе зовут: " + this.father.mother.lastname + " " + this.father.mother.name + "\n";
                }
            }
        }
        System.out.println(info);
    }

    public String getName(){
        return this.name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public Person getMother(){
        return this.mother;
    }

    public Person getFather() {
        return father;
    }
}
