import java.util.Scanner;

public class practiveset_05 {
    public static void main(String[] args){

        //wap which asks the user to enter his|her  name  and greet them with "hello <name > and have a good day" text.

        System.out.println("what is your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello" + name + "have a good day!");
    }
}
