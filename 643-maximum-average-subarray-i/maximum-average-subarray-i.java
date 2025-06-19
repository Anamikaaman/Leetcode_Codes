class Solution {
    public double findMaxAverage(int[] nums, int k){
        int s=0;
        int e=0;
        int n=nums.length;
        double currSum=0;
        double maxSum=Integer.MIN_VALUE;

while(e<n){        currSum+=nums[e];
        int currWindowSize=e-s+1;
        if(currWindowSize<k)e++;
        else if(currWindowSize==k){
            maxSum=Math.max(maxSum,currSum);
            currSum-=nums[s];
            s++;
            e++;
        }


    }
    return maxSum/k;
}
}