package by.tms.bulavko.hw04;

public class HomeTicTacToe {
    public static void main(String[] args) {
        int b = 0;
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b++;
                a[i][j] = b;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
