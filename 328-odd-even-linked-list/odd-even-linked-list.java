class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;  // ✅ added safety check

        ArrayList<Integer> al = new ArrayList<>();
        ListNode fast = head;

        // \U0001f7e2 collect odd-positioned node values
        while (fast != null) {
            al.add(fast.val);
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                break;
            }
        }

        ArrayList<Integer> al1 = new ArrayList<>();
        ListNode temp = head.next;

        // \U0001f7e2 collect even-positioned node values
        while (temp != null) {
            al1.add(temp.val);   // ✅ FIXED: you were wrongly adding to 'al' instead of 'al1'
            if (temp.next != null) {
                temp = temp.next.next;
            } else {
                break;
            }
        }

        al.addAll(al1);  // combine odd + even
        System.out.println(al);  // optional: print final values

        // \U0001f527 Rebuild Linked List from combined values
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : al) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;  // return new head
    }
}
