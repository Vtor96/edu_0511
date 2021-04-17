/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов этого массива.
*/

public class Main {
    public static void main(String[] args) {
        int sum = 1;
        int[] elem= {2, 3, 4, 5};
        for(int i = 0; i < elem.length; i++){
            sum = sum * elem[i];
        }
        
        System.out.println("Произведение элементов в массиве = " + sum);
    }
}
