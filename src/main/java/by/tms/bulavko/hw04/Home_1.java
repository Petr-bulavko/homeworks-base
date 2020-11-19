package by.tms.bulavko.hw04;

import java.util.Random;
import java.util.Scanner;

public class Home_1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Random random = new Random();
        //Создание квадратной матрицы (Надо разделить на классы)
        System.out.println("Введите число");
        int result = 0;
        int n = num.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(50);
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
        //Вычисление суммы четных чисел на главной диагонали
        for (int i = 0; i < n; i++) {
            int j = i;
            int d;
            d = a[i][j];
            result += d;
        }
        System.out.println("Сумма четных чисел на гл. диагонали равна: " + result);
    }
}
