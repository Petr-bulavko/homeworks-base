package by.tms.bulavko.hw06;

public interface PowerAware {//name: -able or -aware
    static final double KILOWATTS_IN_ONE_HORSEPOWER = 0.74;

    double getPowerInHorses();

    default double getPowerInKilowatts() {
        return KILOWATTS_IN_ONE_HORSEPOWER * getPowerInHorses();
    }
}
