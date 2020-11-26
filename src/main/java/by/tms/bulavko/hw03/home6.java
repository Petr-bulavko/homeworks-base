package by.tms.bulavko.hw03;

import java.util.Random;

public class home6 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[4];
        boolean flag = true;
        for (int i = 0; i < 4; i++) {
            a[i] = r.nextInt(10);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < 4; i++) {
            if (a[i - 1] >= a[i]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.print("Возрастающая последовательность");
        } else {
            System.out.println("Не возрастающая последовательность");
        }

    }
}
