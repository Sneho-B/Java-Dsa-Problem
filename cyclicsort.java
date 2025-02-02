import  java.util.*;
public class cyclicsort {
    static  void cyclic_sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        cyclic_sort(arr);
    }
}
