/*
Задание: Дано число, например 31. Проверьте, что это число не делится ни на одно другое число кроме себя самого
и единицы. То есть в нашем случае нужно проверить, что число 31 не делится на все числа от 2 до 30.
Если число не делится - выведите 'false', а если делится - выведите 'true'.
*/

public class Main {
    public static void main(String[] args) {
        boolean f = true;
        int num = 31;
        
        for(int i = 2; i < num; i++ ){
            if((num % i) == 0) {
                f = false;
                continue;
            }
        }

        if (f){
            System.out.println("False");
        }else{
            System.out.println("True");
        }
    }
}
