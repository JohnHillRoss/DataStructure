class Solution {
    public ListNode removeElements(ListNode head,int val) {

        while(head != null && head.val == val) {
            // head = head.next;
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }

        if(head == null) {
            return unll;
        }

        ListNode prev = head;
        while(prev.next != null) {
            if(prev.next.val == val) {
                // prev.next = prev.next.next;
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            }else {
                prev = prev.next;
            }
        }

        return head;
    }
}