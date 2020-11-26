package by.tms.bulavko.hw03;

import java.util.Random;

public class home5 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[5];
        int[] b = new int[5];
        double c = 0;
        double d = 0;
        double result1 = 0;
        double result2 = 0;
        //Первый массив
        for (int i = 0; i < 5; i++) {
            a[i] = r.nextInt(15);
            c += a[i];

            System.out.print(a[i] + " ");
        }
        System.out.println();
        //Второй массив
        for (int i = 0; i < 5; i++) {
            b[i] = r.nextInt(15);
            d += b[i];

            System.out.print(b[i] + " ");
        }
        //Вычисление среднее арифметическое
        result1 = c / 5;
        result2 = d / 5;
        System.out.println();
        if (result1 > result2) {
            System.out.println(result1 + " Больше чем " + result2);
        }
        if (result1 < result2) {
            System.out.println(result1 + " Меньше чем " + result2);
        }
        if (result1 == result2) {
            System.out.println(result1 + " Равно " + result2);
        }
    }
}
