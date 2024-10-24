import java.util.Scanner;

public class Task8 {
    static void hanoi(int q, int from, int to) {
        String ans = "Move disk " + q +
                " from " + Character.toString('A' + from) +
                " to " + Character.toString('A' + to);
        if (q == 1) {
            System.out.println(ans);
            return;
        }
        int buf = 3 - from - to;
        hanoi(q - 1, from, buf);
        System.out.println(ans);
        hanoi(q - 1, buf, to);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        hanoi(n, 0, 2);
    }

}
