public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode currListNode = head;
        ListNode result = null;

        while (currListNode != null) {
            ListNode nextListNode = new ListNode(currListNode.val);
            nextListNode.next = result;
            result = nextListNode;
            currListNode = currListNode.next;
        }

        return result;

    }
}
