/*
ВНИМАНИЕ эта задача для ДЗ и не является обязательной.
Задание: 1. Создай массив чисел.
2. Добавь в массив 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
*/

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mass = new int[10];
        //int[] mass = {2, 4, 8, 4, 8, 4, 4, 12, 12, 14};

        System.out.println("Введите 10 чисел в массив через пробел: ");
        for (int i = 0; i < mass.length; i++){
            mass[i] = scanner.nextInt();
        }

        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < mass.length; i++){
            Arrays.sort(mass);
            System.out.print(mass[i] + " ");
        }

        System.out.println("\nПовторы чисел: ");
        displayDuplicate(mass);
    }

    static void displayDuplicate(int[] ar){
        boolean[] done = new boolean[ar.length];

        for (int i = 0; i < ar.length; i++){
            if (done[i])
                continue;
            int nb = 0;

            for (int j = i; j < ar.length; j++){
                if (done[j])
                    continue;

                if (ar[j] == ar[i]){
                    done[j] = true;
                    nb++;
                }
            }
            System.out.println("Число " + ar[i] + " повторяется " + nb);
        }
    }
}
