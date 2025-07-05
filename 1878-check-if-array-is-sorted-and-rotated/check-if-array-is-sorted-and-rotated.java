import java.util.*;

class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;

        for (int x = 0; x < n; x++) {
            ArrayList<Integer> list = new ArrayList<>();

            // Rotate the array by x positions
            for (int i = x; i < n; i++) list.add(nums[i]);
            for (int i = 0; i < x; i++) list.add(nums[i]);

            // Check if list is sorted
            boolean sorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) return true;
        }

        return false;
    }
}
