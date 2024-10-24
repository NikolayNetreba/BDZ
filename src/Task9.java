import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.next();
        char[] xx = x.toCharArray();
        Set<String> all = new HashSet<>();

        permute(xx, 0, all);
        List<String> sortedAll = new ArrayList<>(all);
        Collections.sort(sortedAll);
        for (String perm : sortedAll) {
            if (perm.charAt(0) != '0') {
                System.out.print(perm + " ");
            }
        }
    }

    private static void permute(char[] arr, int index, Set<String> all) {
        if (index == arr.length - 1) {
            all.add(new String(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            permute(arr, index + 1, all);
            swap(arr, index, i);
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
