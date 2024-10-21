import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int cnt = 1;
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == a.charAt(i - 1)) {
                cnt++;
            } else {
                System.out.print(a.charAt(i - 1) + "" + cnt);
                cnt = 1;
            }
        }
        System.out.println(a.charAt(a.length() - 1) + "" + cnt);
    }
}
