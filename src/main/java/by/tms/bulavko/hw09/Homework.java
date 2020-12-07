package by.tms.bulavko.hw09;

public class Homework {
    public static void main(String[] args) {

        CreateAudi();
        CreatePorsche();

        /*если полученное число оказалось
        четным, то выбрасываете созданное ранее вами исключение и передаете его к
        месту откуда вызывали метод старт. Если все хорошо и исключение не
        вылетело, то выводить в консоль сообщение что автомобиль с такой-то маркой
        завелся.*/

        try {

            /*По идее я могу написать исключение что то вроде
             * деления на ноль, но как мне вот эту проверку использовать в
             * методе start()*/
        } catch (java.lang.Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void CreateAudi() {
        Car car = new Car();
        car.setBrand("Audi");
        car.setPrice(100000);
        car.setSpeed(270);
        car.displayInfo();
        car.start();
    }

    private static void CreatePorsche() {
        Car car = new Car();
        car.setBrand("Porsche");
        car.setPrice(200000);
        car.setSpeed(310);
        car.displayInfo();
        car.start();
    }
}
