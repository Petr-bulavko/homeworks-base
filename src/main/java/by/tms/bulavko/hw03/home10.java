package by.tms.bulavko.hw03;

import java.util.Random;
import java.util.Scanner;

public class home10 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Введите число больше 3 ");

        int n = num.nextInt();
        int b;
        int d = 0;
        int result3 = 0;

        if (n <= 3) {
            System.out.println("Вы ввели число меньше 3 или равное 3");
        }

        System.out.println("Первый массив");

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(n);
            System.out.print(a[i] + " ");
        }

        //Создание второго массива
        System.out.println();
        System.out.println("Второй массив созданный из четных чисел первого");

        for (int i = 0; i < n; i++) {

            b = a[i] % 2;

            d++;
            result3 += d;

            if (b == 0) {

                int[] c = new int[result3];

                c[i] = a[i];

                System.out.print(c[i] + " ");
            }
        }
    }
}
