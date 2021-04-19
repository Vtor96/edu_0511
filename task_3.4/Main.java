/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа.
Если их сумма больше 10 - пусть функция вернет true, а если нет - false.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(ChislaRavny(5, 5));
        System.out.println(ChislaRavny(7, 7));
        System.out.println(ChislaRavny(3, 4));
    }

    public static boolean ChislaRavny(int a, int b){
        if ((a + b) > 10){
            return true;
        }
        else{
            return false;
        }
    }
}
