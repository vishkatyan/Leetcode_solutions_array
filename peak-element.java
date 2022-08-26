class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int start =0;
        int end = n-1;
        while(start<= end){
            int mid = (start+end)/2;
       
        if((mid == 0 || nums[mid-1] <= nums[mid]) && (mid == n-1 || nums[mid]>= nums[mid+1])){
            return mid;
        } else if (mid> 0 && nums[mid-1]> nums[mid]){
           end= mid-1;
        } else{
            start= mid+1;
        }
        }
       return -1;
             
    }
}
