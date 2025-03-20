class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        int c = 0;
        while (l1 != null || l2 != null) {
            int sum = c;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            c = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        if (c > 0) {
            current.next = new ListNode(c);
        }
        return head.next;
    }
}
