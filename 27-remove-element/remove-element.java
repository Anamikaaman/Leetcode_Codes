class Solution {
    public int removeElement(int[] nums, int val) {
        //arraylist
        ArrayList<Integer> al=new ArrayList<>();
        //arraylist ke andar not equal to val elememt remove karo
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val)al.add(nums[i]);
        }
        //ccopy back to main array=reason:in place
        for(int i=0;i<al.size();i++){
            nums[i]=al.get(i);
        }
        return al.size();

    }
}
