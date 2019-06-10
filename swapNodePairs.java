/**
    Given a linked list, swap every two adjacent nodes and return its head.
 */

class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = head;
        head = p.next;
        while (p != null && p.next != null) {
            ListNode next = p.next;
            ListNode t = next.next;
            next.next = p;
            if (t == null || t.next == null) {
                p.next = t;
            }
            else {
                p.next = t.next;
            }
            p = t;
            
        }
        return head;
        
    }
    
    
}