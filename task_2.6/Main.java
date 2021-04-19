/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b.
Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();
        
        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();
        
        double i = a % b;
        
        if (i == 0){
            System.out.println("Делится без остатка! " + i);
        }else {
            System.out.println("Делится с остатком! Остаток = " + i);
        }
    }
}
