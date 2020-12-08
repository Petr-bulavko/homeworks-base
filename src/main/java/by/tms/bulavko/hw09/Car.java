package by.tms.bulavko.hw09;

import java.util.Random;

public class Car {

    static Random random = new Random();

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private static String brand;
    private double speed;
    private double price;

    public void displayInfo() {

        /*писать что то вроде этого
         * String str1 = String.format("s",brand)
         * System.out.println(str1)*/

        System.out.printf("Марка = %s \t Скорость = %s \t Цена = %s %n",
                brand, speed, price);
    }

    public static void start() {

        int a = random.nextInt(21);

        if (a % 2 == 0) {

            int b = random.nextInt(2);

            try {
                System.out.println("Деление рандомного числа до 20 на рандомное число (0 или 1) = " + a / b);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                System.out.println("Ошибка деление на ноль");
            }

            System.out.println("Автомобиль " + brand + " завелся");

        } else {
            System.out.println("Мы никуда не едем");
        }

        System.out.println();

    }

}
