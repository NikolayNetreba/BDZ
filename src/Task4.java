import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static boolean check(String a, String b) {
        a = a.toLowerCase(); b = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        char[] charArray1 = a.toCharArray();
        char[] charArray2 = b.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        for(int i = 0; i < a.length(); i++) {
            if(charArray1[i] != charArray2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine(), b = scanner.nextLine();

        if (check(a, b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

