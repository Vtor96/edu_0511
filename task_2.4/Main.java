/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно.
Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        long vklad = scanner.nextLong();
        System.out.print("Введите процент: ");
        long procent = scanner.nextLong();

        for (int year = 1; year <= 5; year++){
            vklad += ((vklad * procent)/100);
            System.out.println("За " + year + " год на Вашем счету " + Math.round(vklad) + " рублей");
        }



    }
}
