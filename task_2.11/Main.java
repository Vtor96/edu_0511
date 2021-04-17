/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить,
чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        int[] mass = new int[10];
        int sum = 0;
        int cout = 0;

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 10);

            sum += mass[i];
            cout++;

            System.out.print(mass[i] + " ");

            System.out.println("\nСумма = " + sum);

            if (sum > 10)
                System.out.println("Элементов необходимо: " + cout);
        }
    }
}
