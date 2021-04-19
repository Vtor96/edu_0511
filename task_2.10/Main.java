/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] mass = new int[10];
        //int[] mass = {5, 7, 9, 4, 5, 5, 8, 5, 1};

        for (int i = 1; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 10);

            System.out.println("Массив: " + mass[i]);

            if (mass[i] == mass[i-1]) {
                System.out.println("Да!");
                break;
            }
            else
                System.out.println("Нет");
        }
    }
}
