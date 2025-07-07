class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int insertposition=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[insertposition]=nums[i];
                insertposition++;
            }

        }
        while(insertposition<n){
            nums[insertposition++]=0;
        }
        
    }
}