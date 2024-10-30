public class lc206 {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    class Solution {
        public ListNode reverseList(ListNode head) {
           ListNode prev = null;
            ListNode tail = head;
            ListNode curr = tail;
            ListNode next;
            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
            return head;
    
        }
    }
}
