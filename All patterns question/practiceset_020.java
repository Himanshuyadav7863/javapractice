public class practiceset_020 {
    public static void main(String[] args){
        int n=5;
        int space=8;
        for(int i=0; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for (int j=0; j<=space; j++){
               System.out.print(" ");
           }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            space-=2;
        }
        int mspace=0;
        int n1=4;
        for (int i=0; i<n1; i++){
            for(int j=1; j<=n1-i; j++){
                System.out.print("*");
            }
            for(int j=0; j<=mspace; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n1-i; j++){
                System.out.print("*");
            }
            System.out.println();
            mspace+=2;

        }
    }
}
