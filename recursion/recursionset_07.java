public class recursionset_07 {
    static void reversestring(char[] str,int p1,int p2){
        if (p1>=p2){
            return;
        }
        char temp=str[p1];
        str[p1]=str[p2];
        str[p2]=temp;
        reversestring(str,p1+1,p2-1);


    }
    public static void main(String[] args){
         String str="MADAM";
        char[] arr = str.toCharArray();
        reversestring(arr,0,arr.length-1);
        System.out.print("Reverse array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
