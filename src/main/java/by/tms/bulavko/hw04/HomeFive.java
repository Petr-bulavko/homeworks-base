package by.tms.bulavko.hw04;

import java.util.Random;
import java.util.Scanner;

public class HomeFive {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Random random = new Random();
        //Создание квадратной матрицы
        System.out.println("Введите число");
        int n = num.nextInt();
        int[][] a = new int[n][n];
        System.out.println("Полученная матрица");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(50);
                if (a[i][j] < 10) {
                    System.out.print("0" + a[i][j] + " ");
                } else {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //Транспонирование матрицы
        System.out.println("Транспонирование полученной матрицы");
        int[][] b = new int[n][n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                b[i][j] = a[i][j];
                if (b[i][j] < 10) {
                    System.out.print("0" + b[i][j] + " ");
                } else {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
