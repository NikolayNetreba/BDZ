import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] triangle = new int[N][];

        for (int i = 0; i < N; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = in.nextInt();
            }
        }
        for (int i = N - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }
        }
        System.out.println(triangle[0][0]);
    }
}
