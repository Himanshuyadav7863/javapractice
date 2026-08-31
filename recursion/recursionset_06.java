public class recursionset_06 {
    static void reversearray(int arr[],int p1,int p2){
        while(p1>=p2){
            return;
        }
            int temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
            reversearray(arr,p1+1,p2-1);


    }
    public static void main(String[] args){
        int arr[]={1,2,3,4};
        reversearray(arr,0,arr.length-1);
        System.out.print("Reverse array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
