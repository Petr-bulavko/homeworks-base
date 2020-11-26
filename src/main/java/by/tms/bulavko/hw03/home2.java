package by.tms.bulavko.hw03;

public class home2 {
    public static void main(String[] args) {
        int a[] = new int[50];
        for (int i = 0; i < 50; i++) {
            a[i] = 2 * i + 1;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 50; i++) {
            a[i] = 100 - 2 * i - 1;
            System.out.print(a[i] + " ");
        }
    }
}
