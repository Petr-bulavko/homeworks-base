package by.tms.bulavko.hw03;

import java.util.Random;
import java.util.Scanner;

public class home9 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Введите положительное число");
        int n = num.nextInt();
        int result1 = 0;
        int result2 = 0;
        if (n < 0) {
            System.out.println("Вы ввели отрицательное число");
            return;
        }
        //Сам массив
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(15);
            System.out.print(a[i] + " ");
        }
        //Центральное число относится к правой половине
        //Сумма левой половины
        System.out.println();
        for (int i = 0; i < (n / 2); i++) {
            result1 += a[i];
        }
        System.out.println("Сумма левой половины = " + result1);
        //Сумма правой половины
        for (int i = (n / 2); i < n; i++) {
            result2 += a[i];
        }
        System.out.println("Сумма правой половины = " + result2);
        if (result1 > result2) {
            System.out.print("Сумма левой половины " + result1 + " больше чем суммa правой половины " + result2);
        } else if (result1 < result2) {
            System.out.print("Сумма левой половины " + result1 + " меньше чем суммa правой половины " + result2);
        } else {
            System.out.print("Сумма левой половины " + result1 + " равна сумме правой половины " + result2);
        }
    }
}
