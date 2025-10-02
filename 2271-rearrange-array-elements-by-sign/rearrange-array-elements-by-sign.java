class Solution {
    public int[] rearrangeArray(int[] nums) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

       
        for (int num : nums) {
            if (num < 0) {
                a.append(num).append(" ");
            } else {
                b.append(num).append(" ");
            }
        }

       
        String[] starr1 = a.toString().trim().split(" ");
        String[] starr2 = b.toString().trim().split(" ");

        int[] nums1 = new int[starr1.length]; 
        int[] nums2 = new int[starr2.length];
        int[] nums3 = new int[nums.length];   

       
        for (int i = 0; i < starr1.length; i++) {
            nums1[i] = Integer.parseInt(starr1[i]);
        }
        for (int i = 0; i < starr2.length; i++) {
            nums2[i] = Integer.parseInt(starr2[i]);
        }

       
        int i = 0, j = 0, k = 0;
        while (i < nums2.length && j < nums1.length) {
            nums3[k++] = nums2[i++];  
            nums3[k++] = nums1[j++]; 
        }

        return nums3;
    }
}