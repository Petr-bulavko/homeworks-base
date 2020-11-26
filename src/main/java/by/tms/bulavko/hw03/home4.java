package by.tms.bulavko.hw03;

import java.util.Random;

public class home4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[20];
        int b;
        for (int i = 0; i < 20; i++) {
            a[i] = r.nextInt(20);
            System.out.print(a[i] + " ");
        }
        //Замена каждого элемента с нечётным индексом на ноль
        System.out.println();
        for (int i = 0; i < 20; i++) {
            b = a[i] % 2;
            if (b == 1) {
                a[i] = 0;
            }
            System.out.print(a[i] + " ");
        }
    }
}
