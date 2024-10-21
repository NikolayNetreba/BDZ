import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean flag = true;
        while(n != 0){
            if(flag && n % 10 == 0){
                n /= 10;
            } else {
                System.out.print(n % 10);
                flag = false;
                n /= 10;
            }
        }
    }
}
