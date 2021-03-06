package by.tms.bulavko.hw06;

public class Homework {
    public static void main(String[] args) {
        //Спросить как разбить на это на классы или методы?
        //ну и можно вообще комментарий по коду

        //Разбито на специфичные методы
        createPassengerCar();
        createTruck();
        createMilitaryTransport();
        createCivilTransport();
    }

    private static void createCivilTransport() {
        CivilTransport civilTransport = new CivilTransport();
        civilTransport.brand = "Кукурузник";//must use getters and setters
        civilTransport.maximumSpeed = 140;
        civilTransport.power = 260;
        civilTransport.weight = 2000;
        civilTransport.displayInfoCivilTransport();
        civilTransport.displayInfoPassengers();
    }

    private static void createMilitaryTransport() {
        MilitaryTransport militaryTransport = new MilitaryTransport();
        militaryTransport.brand = "Ил-76";
        militaryTransport.maximumSpeed = 500;
        militaryTransport.power = 500;
        militaryTransport.weight = 30000;
        militaryTransport.displayInfoMilitaryTransport();
        militaryTransport.displayInfoMMissiles();
        militaryTransport.displayInfoBailoutSystem();
    }

    private static void createTruck() {
        Truck truck = new Truck();
        truck.brand = "МАЗ";
        truck.maximumSpeed = 85;
        truck.power = 286;
        truck.weight = 18000;
        truck.displayInfoTruck();
        truck.displayInfoLoad();
    }

    private static void createPassengerCar() {
        PassengerCar passengerCar = new PassengerCar();
        passengerCar.brand = "Audi";
        passengerCar.maximumSpeed = 270;
        passengerCar.power = 272;
        passengerCar.weight = 1545;
        passengerCar.displayInfoPassengerCar();
        passengerCar.numberOfKilometers();
    }
}
