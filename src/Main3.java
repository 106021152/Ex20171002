import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        int a = sum.nextInt()%2;
        if(a==1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}
