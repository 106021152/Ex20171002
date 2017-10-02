import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        char ch = sum.next().charAt(0);
        if(ch -'A' >=0 && ch - 'A'<26){
            System.out.println(Character.toLowerCase(ch));
        }
        if(ch -'a' >=0 && ch - 'a'<26){
            System.out.println(Character.toUpperCase(ch));
        }
    }
}
