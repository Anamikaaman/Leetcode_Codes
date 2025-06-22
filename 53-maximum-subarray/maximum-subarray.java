class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];          // Start with first element
        int currentSum = nums[0];      // Current running sum

        for (int i = 1; i < nums.length; i++) {
            // Either take the current number alone or add to previous sum
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maxSum if currentSum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum; // This is the answer
    }
}
