package by.tms.bulavko.hw03;

import java.util.Random;

public class home3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[15];
        int b;
        int result = 0;
        for (int i = 0; i < 15; i++) {
            a[i] = r.nextInt(99);
            System.out.print(a[i] + " ");
            b = a[i] % 2;
            if (b == 0) {
                b += 1;
                result += b;
            }
        }
        System.out.println();
        System.out.println("Количество четных: " + result);
    }
}
