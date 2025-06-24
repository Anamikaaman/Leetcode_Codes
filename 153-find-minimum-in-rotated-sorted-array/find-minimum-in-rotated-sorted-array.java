class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // Binary Search Loop
        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the rightmost, min must be to the right
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Else, the min is in the left half (including mid)
                right = mid;
            }
        }

        // At the end of loop, left == right, which is the index of minimum
        return nums[left];
    }
}
