package by.tms.bulavko.hw05;

import java.util.Random;
import java.util.Scanner;

/*Честно я посмотрел код у кого-то другого так как не понял до конца задание,
но после просмотра я понял задание и переделал(чуть-чуть в основном в методе workOrHaveError,
у него не работало условие Компьютер сломан)
 */
public class Computer {
    Scanner scn = new Scanner(System.in);
    Random random = new Random();
    String centralProcessingUnit;
    int randomAccessMemory;
    int hardDiskDrive;
    int fullCycleResources;
    static boolean conditionOfComputer = true;
    //если true компьютер работает, если false сломан
    String computerBroken = "Компьютер сломан";

    //Вывод значений
    void displayInfo() {
        System.out.printf("CPU - %s \tRAM - %s \tHDD - %s\t " +
                "Ресурс полных циклов - %s", centralProcessingUnit, randomAccessMemory, hardDiskDrive, fullCycleResources);
    }

    void computerOnn() {
        if (conditionOfComputer) {
            System.out.print("\nКомпьютер включился!\n");
            workOrHaveError();
        }
    }

    //Этот метод описывает поведение компьютера после включения(есть ошибка или нет)
    void workOrHaveError() {
        //может лучше назвать а как mistake
        int a = random.nextInt(2);

        if (a == 0) {

            System.out.println("Произошла ошибка.Введите 0 или 1 для решения.");
            int c = random.nextInt(2);
            int b = scn.nextInt();
            if (c == b) {
                System.out.println("Удача на вашей стороне.Компьютер продолжает работу.");

            } else System.out.print(computerBroken);

        } else System.out.print("Компьютер продолжает работу без ошибки.");
    }
}
