/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 6 строк.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации. */

public class Main {
    public static void main(String[] args) {
        System.out.println("РамуМылаМама");
        System.out.println("РамуМамаМыла");
        System.out.println("МылаМамаРаму");
        System.out.println("МылаРамуМама");
        System.out.println("МамаМылаРаму");
        System.out.println("МамаРамуМыла");
    }
}
