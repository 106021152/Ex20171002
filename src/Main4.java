import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        int a = sum.nextInt();
        int b = sum.nextInt();
        int c = sum.nextInt();
        if(a * a + b * b == c * c ){
            System.out.println("Ture");
        }
        else{
            System.out.println("False");
        }
    }
}
