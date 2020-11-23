package by.tms.bulavko.hw05;

public class Homework {
    public static void main(String[] args) {
        Computer my = new Computer();
        my.centralProcessingUnit = "AMD Ryzen 5 2600";
        my.randomAccessMemory = 16;
        my.hardDiskDrive = 1000;
        my.fullCycleResources = 1000;
        my.displayInfo();
        my.computerOnn();
    }
}
