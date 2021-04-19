/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа.
Если эти числа равны - пусть функция вернет true, а если не равны - false.
*/


public class Main {
    public static void main(String[] args) {
        System.out.println(ChislaRavny(5, 7));
        System.out.println(ChislaRavny(7, 7));
        System.out.println(ChislaRavny(7, 5));
    }

    public static boolean ChislaRavny(int a, int b){
        if (a == b){
            return true;
        }
        else{
            return false;
            }
    }
}
