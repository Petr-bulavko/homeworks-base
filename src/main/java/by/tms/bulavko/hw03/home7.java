package by.tms.bulavko.hw03;

import java.util.Random;

public class home7 {

    static Random rand = new Random();
    private static final int arrSize = 12;
    private static final int maxRand = 15;

    public static void main(String[] args) {
        int[] array = randomArray();
        int max = getMaxAndIndexOfMaxInArray(array)[0];
        int index = getMaxAndIndexOfMaxInArray(array)[1];
        System.out.println();
        System.out.println("Максимальное число " + max);
        System.out.print("Индекс максимального значения " + index);
    }

    public static int[] randomArray() {
        int[] array = new int[arrSize];

        for (int i = 0; i < 12; i++) {
            array[i] = rand.nextInt(maxRand);
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static int[] getMaxAndIndexOfMaxInArray(int[] array) {
        int[] maxAndIndex = new int[2];
        int max = array[0];
        int index = 0;

        for (int i = 11; i >= 0; i--) {
            if (array[i] > max) {
                max = array[i];
                index = i + 1;
            }
        }

        maxAndIndex[0] = max;
        maxAndIndex[1] = index;

        return maxAndIndex;
    }
}
