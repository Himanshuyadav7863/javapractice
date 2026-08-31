import java.util.Scanner;

public class recursionset_02 {
    static void display(int i,int n){

        if(i>n){
            return;
        }
        System.out.println(i);
        display(i+1,n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of i");
        int i=sc.nextInt();
        System.out.println("Enter  value of n ");
        int n=sc.nextInt();
        display(i,n);
    }
}
