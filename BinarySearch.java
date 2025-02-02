import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= new int[10];
        Scanner ab= new Scanner(System.in);
        System.out.println("Enter array ");
        for (int i=0;i<10;i++){
            arr[i]=ab.nextInt();
        }
        System.out.println("Enter target");
        int target=ab.nextInt();
        int tar=binary_search(arr, target);
        System.out.println(tar);
        ab.close();
    }
    static int binary_search(int[] arr, int target){
        Arrays.sort(arr);
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid= start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }

}
