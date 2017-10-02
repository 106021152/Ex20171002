import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        int v1 = sum.nextInt();
        int a = v1/1000;
        v1=v1%1000;
        int b = v1/100;
        v1=v1%100;
        int c = v1/10;
        v1=v1%10;
        int d = v1%10;
        System.out.println(+ a + "thousand\t" + b +"hundred\t" + c + "ten\t"+ d + "dollar\t");
    }
}
