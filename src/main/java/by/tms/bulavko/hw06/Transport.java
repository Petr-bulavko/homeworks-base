package by.tms.bulavko.hw06;

import java.util.Random;
import java.util.Scanner;

public class Transport implements PowerAware {
    double power;
    int maximumSpeed;
    int weight;
    String brand;
    Scanner scanner;

    public Transport() {
        this(new Scanner(System.in));
    }

    public Transport(Scanner scanner) {//конструктор для обеспечения низкой связанности класса
        this.scanner = scanner;
    }

    @Override
    public double getPowerInHorses() {
        return power;
    }
}

/*Спросить на счет метода для перевода л.с. в кВт, я просто в каждом посчитал)
как лучше написать этот метод и использовать*/

class AirTransport extends Transport {

    int wingspan = 20;
    int minimumRunwayLengthForTakeOff = 600;

}

class MilitaryTransport extends AirTransport {

    boolean bailoutSystem = true;
    private int numberOfMissiles = 20;//Использовать минимально возможный/необходимый модификатор видимости
    private final Random random = new Random();

    public void displayInfoMilitaryTransport() {
        //String.format and returning formatted String object so it could be used by caller
        System.out.printf("Марка = %s \t Максимальная скорость = %s км/ч \t Масса = %s кг \t \n" +
                        "Мощность = %s л.с. \t" +
                        "Размах крыльев = %s м \t Минимальное растояние для взлета = %s м \t \n" +
                        "Катапультирование = %s \t Кол-во ракет = %s шт. \t \n" +
                        "Перевод л.с. в кВт = %s кВт \n",
                brand, maximumSpeed, weight, getPowerInHorses(), wingspan,
                minimumRunwayLengthForTakeOff, bailoutSystem, numberOfMissiles, getPowerInKilowatts());

    }

    public void displayInfoMMissiles() {

        System.out.println("Введите кол-во ракет: ");
        int missiles = scanner.nextInt();

        if (missiles > numberOfMissiles) {

            System.out.println("Где я тебе возьму столько ракет");

        } else if (missiles > 0) {

            System.out.println("Саня запускай");

        } else if (missiles == 0) {

            System.out.println("Ракет нет");

        } else {

            System.out.println("Всмысле минус");

        }

    }

    //тут сонар вроде как ругается но и не ругается
    public void displayInfoBailoutSystem() {

        boolean bailout = random.nextBoolean();

        System.out.println("У нас есть система катапультирования?");
        if (bailout) {

            System.out.println("Катапультирование прошло успешно");

        } else {

            System.out.println("У нас нет такой системы");

        }
        System.out.println();
    }

}

class CivilTransport extends AirTransport {

    int numberOfPassengers = 3;
    boolean businessClassAvailable = true;

    public boolean isBusinessClassAvailable() {//getter for boolean uses is prefix
        return businessClassAvailable;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void displayInfoCivilTransport() {

        System.out.printf("Марка = %s \t Максимальная скорость = %s км/ч \t Масса = %s кг \t \n" +
                        "Мощность = %s л.с. \t" +
                        "Размах крыльев = %s м \t Минимальное растояние для взлета = %s м \t \n" +
                        "Кол-во пассажиров = %s \t Бизнес класс = %s \t \n" +
                        "Перевод л.с. в кВт = %s кВт \n",
                brand, maximumSpeed, weight, power, wingspan,
                minimumRunwayLengthForTakeOff, numberOfPassengers, businessClassAvailable, getPowerInKilowatts());

    }

    public void displayInfoPassengers() {

        System.out.println("Введите кол-во пассажиров: ");
        int passengers = scanner.nextInt();

        if (passengers > numberOfPassengers) {

            System.out.println("Слишком много людей, надо кого-то выгнать");

        } else if (passengers > 0) {

            System.out.println("Ну шо куда летим?");

        } else {

            System.out.println("Значит отменять поездки в последний момент это нормально");

        }

        System.out.println();

    }

}

class LandTransport extends Transport {

    int numberOfWheels = 4;
    double fuelConsumption = 7;

}

class PassengerCar extends LandTransport {

    String typeCarcase = "Универсал";
    int numberOfPassengers = 5;

    //Короче не понял почему с %s и %d не показывает ошибку
    public void displayInfoPassengerCar() {

        System.out.printf("Марка = %s\t Тип кузова = %s\t Максимальная скорость = %f км/ч \t \n" +
                        "Масса = %s кг \t Мощность = %s л.с. \t Кол-во колес = %d \t \n" +
                        "Кол-во пассажиров = %s \t Расход топлива = %s л/100км \n" +
                        "Перевод л.с. в кВт = %s кВт \n",
                brand, typeCarcase, (float) maximumSpeed, weight, power,
                numberOfWheels, numberOfPassengers, fuelConsumption, getPowerInKilowatts());

    }

    /*Короче не понимаю как надо сделать чтобы метод вызывался в методе и наоборот
    у меня идет расчет resultKilometers в методе numberOfKilometers,
    но мне нужен этот результат для расчета в private методе
    и полученный результат потом обратно вызвать результат в метод numberOfKilometers
    или можно как-то подругому сделать
    */
    //Я не знаю как это получилось, но получилось осталось понять)

    private Double numberOfFuel = null;

    private double numberOfFuelConsumption() {
        if (numberOfFuel == null) {
            numberOfFuel = resultKilometers / 100 * fuelConsumption;
        }
        return numberOfFuel;
    }

    double resultKilometers;

    public void numberOfKilometers() {


        PassengerCar passengerCar = new PassengerCar();

        System.out.println("Введите время в часах: ");

        double time = scanner.nextInt();

        resultKilometers = time * maximumSpeed;

        double numberOfFuel = passengerCar.numberOfFuelConsumption();

        System.out.println("За время " + time + " ч автомобиль " +
                brand + " двигаясь с максимальной скоростью " + maximumSpeed
                + " км/ч проедет " + resultKilometers + " км " +
                "и изросходует " + numberOfFuel + " литров топлива");
        System.out.println();

    }


}

class Truck extends LandTransport {

    int load = 10000;

    public void displayInfoTruck() {

        System.out.printf("Марка = %s \t Максимальная скорость = %s км/ч \t Масса = %s кг \t \n" +
                        "Мощность = %s л.с. \t Кол-во колес = %d \t" +
                        "Грузоподъемность = %s т \t \n" +
                        "Перевод л.с. в кВт = %s кВт \n",
                brand, maximumSpeed, weight, power, numberOfWheels, load, getPowerInKilowatts());

    }

    public void displayInfoLoad() {

        System.out.println("Введите массу груза которое нужно перевезти: ");
        double inputLoad = scanner.nextInt();

        if (inputLoad > load) {

            System.out.println("Вам нужен грузовик побольше");

        } else if (inputLoad == load) {

            System.out.println("Грузовик загружен по максимуму, не стоит издеваться над машиной");

        } else if (inputLoad < 0) {

            System.out.println("Воровать не хорошо");

        } else {

            System.out.println("Грузовик загружен");

        }
        System.out.println();

    }

}


