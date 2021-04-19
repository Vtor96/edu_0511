/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно.
Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите сумму вклада: ");
        double vklad = scanner.nextLong();
        
        System.out.print("Введите процент: ");
        double procent = scanner.nextLong();

        for (int i = 1; i <= 5; i++){
            vklad += ((vklad * procent)/100);
            
            System.out.println("За " + i + " год на Вашем счету " + Math.round(vklad) + " рублей");
        }
    }
}
