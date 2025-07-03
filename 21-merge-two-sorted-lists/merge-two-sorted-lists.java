class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> ll = new ArrayList<>();
        
        // Traverse list1 and add values to ll
        ListNode temp1 = list1;
        while(temp1 != null) {
            ll.add(temp1.val);
            temp1 = temp1.next;
        }

        // Traverse list2 and add values to ll
        ListNode temp2 = list2;
        while(temp2 != null) {
            ll.add(temp2.val);
            temp2 = temp2.next;
        }

        // Sort the combined list
        Collections.sort(ll);

        // Create new sorted linked list from ll
        ListNode dummy = new ListNode(0);  // dummy head node
        ListNode current = dummy;
        for(int val : ll) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;  // return the head of the merged list
    }
}
