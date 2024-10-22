import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dd = in.nextInt(), mm = in.nextInt(), yy = in.nextInt();
        if (mm == 1 || mm == 2) {
            mm += 12;
            yy -= 1;
        }
        int k = yy % 100;
        int j = yy / 100;
        int f = (dd + (13 * (mm + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        switch (f) {
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
        }
    }
}



