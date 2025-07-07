class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        // Step 1: Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            if (!hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), 1);
            } else {
                Integer val = hm.get(s.charAt(i));
                val++;
                hm.put(s.charAt(i), val);
            }
        }

        // ✅ FIXED: Get any frequency from map, not s.charAt(0)
        Integer ans = null;
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            ans = entry.getValue();
            break;
        }

        // Step 2: Check if all values are equal
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (!entry.getValue().equals(ans)) {
                return false;
            }
        }

        return true;
    }
}