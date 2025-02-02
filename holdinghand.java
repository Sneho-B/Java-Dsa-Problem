public class holdinghand {
    static int minSwapsCouples(int[] nums) {
        int count=0;
        for (int i=0;i<nums.length;i+=2){
            int firsthand=nums[i];
            int secondhand=firsthand^1;
            if(nums[i+1]!=secondhand){
                int partnerindex= findPatnerIndex(nums,secondhand,i+2);
                swap(nums,i+1,partnerindex);
                count++;    
            }
        }
        return count;
    }
    static int findPatnerIndex(int[] nums,int secondhand,int start){
        for (int i=start;i<nums.length;i++){
            if(nums[i]==secondhand){
                return i;
            }
        }
        return -1;
    }

    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void main(String[] args) {
        int[] arr={3,5,2,1,0,4};
        int hands=minSwapsCouples(arr);
        System.out.println(hands);
    }
}

