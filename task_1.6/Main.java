/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число = ");
        float a = scan.nextFloat();
        double proc = a + ((15.0 * a) / 100);
        System.out.println("Ваше увеличенное число = " + proc);
    }
}
