/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] mass = new int[10];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 10);
            System.out.println("Массив: " + mass[i]);

            if (mass[i] == 5) 
                System.out.println("Да!");
            else 
                System.out.println("Нет");
        }
    }
}
