import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < n; i++) {
            set.add(in.nextInt());
        }
        for(Integer i : set) {
            System.out.print(i + " ");
        }
    }
}
