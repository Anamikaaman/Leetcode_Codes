public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;       // Step 1: Copy value from next node
        node.next = node.next.next;     // Step 2: Skip the next node
    }
}
