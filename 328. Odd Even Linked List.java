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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(),tail2 = odd;
        ListNode even = new ListNode() , tail1 = even; 
        int count = 0;
        while(head!=null){
            if (count%2 == 0){
                tail1.next = head;
                tail1  = tail1.next;

            }else{
                tail2.next = head;
                tail2 = tail2.next;

            }
            count++;
            head = head.next;
        }
        tail1.next = odd.next;
        tail2.next = null;
        return even.next;
    }
}