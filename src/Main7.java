import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        int x = sum.nextInt();
        if (x > 1) {
            System.out.println((2 * x) + 3);
        } else if (x < -1) {
            System.out.println(3 * (x * x));
        } else {
            System.out.println((x * x * x) + (3 * x - 3));
        }
    }
}
