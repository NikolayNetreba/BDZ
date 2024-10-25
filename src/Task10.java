import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Task10 {
    public static int[] doArray(String y) {
        int m = y.length();
        int[] lps = new int[m];
        int len = 0;
        int i = 1;

        lps[0] = 0;
        while (i < m) {
            if (y.charAt(i) == y.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
    public static void KMP(String y, String x) {
        int m = y.length();
        int n = x.length();
        int[] lps = doArray(y);
        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < n) {
            if (y.charAt(j) == x.charAt(i)) {
                i++;
                j++;
            }
            if (j == m) {
                result.add(i - j);
                j = lps[j - 1];
            } else if (i < n && y.charAt(j) != x.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        if (result.isEmpty()) {
            System.out.println("-1");
        } else {
            for (int index : result) {
                System.out.print(index + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        String y = in.nextLine();
        KMP(y, x);
    }
}
