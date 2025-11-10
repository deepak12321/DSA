
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
 * Proble Link :-
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/-
 * 0 ms
 * Beats 100%
 * 
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // System.out.println(findLength(head));

        int length = findLength(head);

        if (length == 1) {
            head = null;
            return head;
        }
        if (n == length) {
            head = head.next;
            return head;
        }
        ListNode temp = head;

        for (int i = 1; i < length - n; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public int findLength(ListNode head) {
        if (head == null)
            return 0;
        ListNode temp = head;
        int length = 0;

        while (temp != null) {
            temp = temp.next;
            length += 1;
        }

        return length;
    }
}
