public class practiceset_019 {
    public static void main(String[] args){
        int space=0;
        int n=5;
        for(int i=0; i<n; i++){
            for(int j = 1;  j<=n-i; j++){
                System.out.print("*");
            }
            for(int j = 0; j<space; j++){
                System.out.print(" ");
            }
            for(int j = 1;  j<=n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
            space+=2;
        }
        int mspace=8;
        int n1=5;
        for(int i=1; i<=n1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < mspace; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            mspace-= 2;
        }
    }
}
