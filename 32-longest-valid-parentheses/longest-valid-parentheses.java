import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);  // Base index to calculate lengths
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);  // Push index of '('
            } else {
                stack.pop();  // Pop previous '(' or base

                if (stack.isEmpty()) {
                    stack.push(i);  // Push index of unmatched ')'
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek());  // Valid substring length
                }
            }
        }
        return maxLen;
    }
}
