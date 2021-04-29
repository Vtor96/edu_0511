/*
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> aR = new ArrayList<>();
        try{
            System.out.println("Введите путь к файлу:");
            BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream fis = new FileInputStream(bR.readLine().trim());
            Scanner scan = new Scanner(fis);

            while (scan.hasNextLine()){
                aR.add(Integer.parseInt(scan.nextLine()));
            }
            fis.close();
            scan.close();
            bR.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        Collections.sort(aR);

        System.out.println("Отсортированные четные числа по возрастанию:");
        for (Integer i : aR){
            if (i % 2 == 0)
            System.out.println(i);
        }
    }
}



