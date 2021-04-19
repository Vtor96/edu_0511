/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args){
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 10);
            System.out.println("Массив: " + array[i]);

            if (array[i] == 5){
                System.out.println("Да!");
                break;
            }else
                System.out.println("Нет");
        }
    }
}
