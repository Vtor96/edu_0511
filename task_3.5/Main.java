/*
Задание: Дан массив с числами. Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num[] = {4,2,6,2,65};

        System.out.println(Arrays.toString(num));
    }

    static int[] massiv(int num[], int pos, int ret[]){
        if (pos < num.length){
            ret[num.length - pos - 1] = num[pos];
            massiv(num, pos + 1, ret);
        }
        return ret;
    }
}
