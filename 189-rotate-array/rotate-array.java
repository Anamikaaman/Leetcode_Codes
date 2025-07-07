class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k= k % n; //to handle k>n
        //to reverse the whole array
        reverse(nums,0,n-1);
        // to reverse upto k steps
        reverse(nums,0,k-1);
        //reverse the remaining elements
        reverse(nums,k,n-1);
    
    }
    private void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}