/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fastNode = head;
        if(fastNode == null) return null;
		ListNode slowNode = head;
		ListNode currNode = head;
		while(fastNode.next != null) {
			fastNode = fastNode.next;
			if(fastNode.next != null) {
                fastNode = fastNode.next;
                slowNode = slowNode.next;
            }
			if(fastNode == slowNode) {
				while(currNode != slowNode) {
					currNode = currNode.next;
					slowNode = slowNode.next;
				}
				return currNode;
			}
		}
		return null;
    }
}
