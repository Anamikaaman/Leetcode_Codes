class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;                      // Start pointer
        int right = numbers.length - 1;    // End pointer

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // Since the array is 1-indexed
                return new int[] {left + 1, right + 1};
            } else if (sum < target) {
                left++;    // Increase the sum
            } else {
                right--;   // Decrease the sum
            }
        }

        return new int[] {-1, -1};  // Should not happen as per problem constraints
    }
}
