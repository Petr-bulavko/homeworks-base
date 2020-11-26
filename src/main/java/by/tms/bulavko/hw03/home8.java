package by.tms.bulavko.hw03;

import java.util.Random;

public class home8 {
    public static void main(String[] args) {
        Random r = new Random();
        double[] a = new double[10];
        double[] b = new double[10];
        double[] c = new double[10];
        double d;
        double result = 0;
        for (int i = 0; i < 10; i++) {
            a[i] = r.nextInt(9);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            b[i] = r.nextInt(9);
            System.out.print(b[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            c[i] = a[i] / b[i];
            System.out.printf("%1.1f ", c[i]);
            d = c[i] % 1;
            if (d == 0) {
                d += 1;
                result += d;
            }
        }
        System.out.println();
        System.out.println("Количество целых " + result);
    }
}
