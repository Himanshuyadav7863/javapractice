import java.sql.SQLOutput;
import java.util.Scanner;

public class takinginput_02 {
    public static void main(String[] args){
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("the sum of these number is");
        System.out.println(sum);

    }
}
