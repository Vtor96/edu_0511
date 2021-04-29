/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ArrayList<Integer> ar2 = new ArrayList<Integer>();
        for (int i = 0; i < 12; i++){
            ar.add(i);

            if((i > 0) && (i < 10))
                ar2.add(i);
        }
        System.out.println("Числа, больше 0, но меньше 10: " + ar2);
    }
}
