class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        // Find the largest pile (used for max possible speed)
        for (int pile : piles) {
            if (pile > right) right = pile;
        }

        while (left < right) {
            int mid = (left + right) / 2;
            int totalHours = 0;

            // Calculate total hours needed at speed = mid
            for (int pile : piles) {
                totalHours += (int)Math.ceil((double)pile / mid); // Same as ceil(pile / mid)
            }

            if (totalHours <= h) {
                right = mid; // Try slower speed
            } else {
                left = mid + 1; // Need faster speed
            }
        }

        return left; // Minimum speed found
    }
}