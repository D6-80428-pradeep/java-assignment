/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    int carry;
    
    public void doubleUtil(ListNode head) {
        if (head == null) return;
        
        doubleUtil(head.next);
        
        int cur = 2 * head.val + carry;
        carry = cur / 10;
        
        head.val = cur % 10;
    }
    
    public ListNode doubleIt(ListNode head) {
        carry = 0;
        doubleUtil(head);

        return (carry == 0) ? head : new ListNode(carry, head);
    }
}