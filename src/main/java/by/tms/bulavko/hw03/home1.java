package by.tms.bulavko.hw03;

public class home1 {
    public static void main(String[] args) {
        int a[] = new int[10];
        for (int i = 1; i < 10; i++) {
            a[i] = 2 * i;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < 10; i++) {
            a[i] = 2 * i;
            System.out.println(a[i] + " ");
        }
    }
}
