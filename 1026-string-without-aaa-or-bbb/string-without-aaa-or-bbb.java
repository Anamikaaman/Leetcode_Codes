class Solution {
    public String strWithout3a3b(int aCount, int bCount) {
        StringBuilder result = new StringBuilder();
        while (aCount > 0 && bCount > 0) {
            if (aCount > bCount) {
                result.append("aab");
                aCount -= 2; 
                bCount -= 1; 
            } 
            else if (aCount < bCount) {
                result.append("bba");
                aCount -= 1; 
                bCount -= 2; 
            } 
            else {
                result.append("ab");
                aCount -= 1; 
                bCount -= 1; 
            }
        }
        while (aCount > 0) {
            result.append("a");
            aCount--;
        }
        while (bCount > 0) {
            result.append("b");
            bCount--;
        }
        return result.toString();
    }
}