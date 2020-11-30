package by.tms.bulavko.hw06;

import java.util.Scanner;

public class NumberedExample {
    public static void main(String[] args) {
        int counter = 1;
        Transport[] transports = new Transport[10];
        System.out.println("Введите тип машины");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            Transport newTransport;
            switch (i) {
                case 1:
                    newTransport = new Truck();
                    newTransport.brand = "МАЗ";
                    break;
                case 2:
                    newTransport = new MilitaryTransport();
                    newTransport.brand = "КрАЗ";
                    break;
                default:
                    throw new IllegalArgumentException("Неподдерживаемый тип");
            }
            newTransport.brand += counter;
            transports[counter - 1] = newTransport;

            if (counter == 10) {
                break;
            }
            counter++;
        }

        for (Transport transport : transports) {
            if (transport instanceof Truck) {
                ((Truck) transport).displayInfoTruck();
            }
            if (transport instanceof MilitaryTransport) {
                ((MilitaryTransport) transport).displayInfoMilitaryTransport();
            }
        }
    }
}
