package by.tms.bulavko.hw04;

import java.util.Random;
import java.util.Scanner;

public class Home_2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Random random = new Random();
        int b = 0;
        //Создание квадратной матрицы
        System.out.println("Введите число");
        int n = num.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(50);
                System.out.print(a[i][j] + "     ");
            }
            System.out.println();
        }
        //Вывод нечетных чисел ниже гл. диагонали (включительно)
        System.out.println("Вывод нечетных чисел");
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                b = a[i][j] % 2;
                if (b == 1) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }
}
