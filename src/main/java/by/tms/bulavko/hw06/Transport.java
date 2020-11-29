package by.tms.bulavko.hw06;

import java.util.Random;
import java.util.Scanner;

public class Transport {
    double power;
    int maximumSpeed;
    int weight;
    double kilowatt = 0.74;
    double result = 0;
    String brand;
    Scanner scanner = new Scanner(System.in);
}

/*Спросить на счет метода для перевода л.с. в кВт, я просто в каждом посчитал)
как лучше написать этот метод и использовать*/

class AirTransport extends Transport {

    int wingspan = 20;
    int minimumRunwayLengthForTakeOff = 600;

}

class MilitaryTransport extends AirTransport {

    boolean bailoutSystem = true;
    int numberOfMissiles = 20;

    public void displayInfoMilitaryTransport() {

        result = kilowatt * power;

        System.out.printf("Марка = %s \t Максимальная скорость = %s км/ч \t Масса = %s кг \t \n" +
                        "Мощность = %s л.с. \t" +
                        "Размах крыльев = %s м \t Минимальное растояние для взлета = %s м \t \n" +
                        "Катапультирование = %s \t Кол-во ракет = %s шт. \t \n" +
                        "Перевод л.с. в кВт = %s кВт \n",
                brand, maximumSpeed, weight, power, wingspan,
                minimumRunwayLengthForTakeOff, bailoutSystem, numberOfMissiles, result);

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

        Random random = new Random();
        boolean bailout = random.nextBoolean();

        System.out.println("У нас есть система катапультирования?");
        if (bailout == true) {

            System.out.println("Катапультирование прошло успешно");

        } else {

            System.out.println("У нас нет такой системы");

        }
        System.out.println();
    }

}

class CivilTransport extends AirTransport {

    int numberOfPassengers = 3;
    boolean businessClassAvailability = true;

    public void displayInfoCivilTransport() {

        result = kilowatt * power;

        System.out.printf("Марка = %s \t Максимальная скорость = %s км/ч \t Масса = %s кг \t \n" +
                        "Мощность = %s л.с. \t" +
                        "Размах крыльев = %s м \t Минимальное растояние для взлета = %s м \t \n" +
                        "Кол-во пассажиров = %s \t Бизнес класс = %s \t \n" +
                        "Перевод л.с. в кВт = %s кВт \n",
                brand, maximumSpeed, weight, power, wingspan,
                minimumRunwayLengthForTakeOff, numberOfPassengers, businessClassAvailability, result);

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

        result = kilowatt * power;

        System.out.printf("Марка = %s\t Тип кузова = %s\t Максимальная скорость = %s км/ч \t \n" +
                        "Масса = %s кг \t Мощность = %s л.с. \t Кол-во колес = %d \t \n" +
                        "Кол-во пассажиров = %s \t Расход топлива = %s л/100км \n" +
                        "Перевод л.с. в кВт = %s кВт \n",
                brand, typeCarcase, maximumSpeed, weight, power,
                numberOfWheels, numberOfPassengers, fuelConsumption, result);

    }

    /*Короче не понимаю как надо сделать чтобы метод вызывался в методе и наоборот
    у меня идет расчет resultKilometers в методе numberOfKilometers,
    но мне нужен этот результат для расчета в private методе
    и полученный результат потом обратно вызвать результат в метод numberOfKilometers
    или можно как-то подругому сделать
    */
    //Я не знаю как это получилось, но получилось осталось понять)
    private double numberOfFuel;

    public double getNumberOfFuel() {

        return numberOfFuel;

    }

    public void setNumberOfFuel(double numberOfFuel) {

        this.numberOfFuel = numberOfFuel;

    }


    private void numberOfFuelConsumption() {

        numberOfFuel = resultKilometers / 100 * fuelConsumption;

    }


    double resultKilometers;

    public void numberOfKilometers() {


        PassengerCar passengerCar = new PassengerCar();

        System.out.println("Введите время в часах: ");

        double time = scanner.nextInt();

        resultKilometers = time * maximumSpeed;

        passengerCar.setNumberOfFuel(resultKilometers / 100 * fuelConsumption);

        passengerCar.numberOfFuelConsumption();

        numberOfFuel = resultKilometers / 100 * fuelConsumption;

        System.out.println("За время " + time + " ч автомобиль " +
                brand + " двигаясь с максимальной скоростью " + maximumSpeed
                + " км/ч проедет " + resultKilometers + " км " +
                "и изросходует " + getNumberOfFuel() + " литров топлива");
        System.out.println();

    }


}

class Truck extends LandTransport {

    int load = 10000;

    public void displayInfoTruck() {

        result = kilowatt * power;

        System.out.printf("Марка = %s \t Максимальная скорость = %s км/ч \t Масса = %s кг \t \n" +
                        "Мощность = %s л.с. \t Кол-во колес = %d \t" +
                        "Грузоподъемность = %s т \t \n" +
                        "Перевод л.с. в кВт = %s кВт \n",
                brand, maximumSpeed, weight, power, numberOfWheels, load, result);

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


