import java.util.*;
public class insertionsort {
    static void insertion(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter the 6 elements of the array");
        for (int i=0;i<6;i++){
            arr[i] = sc.nextInt();
        }
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
