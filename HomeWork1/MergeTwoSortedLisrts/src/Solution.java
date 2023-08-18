public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode result = null;
        ListNode resultHead = null;

        while (head1 != null || head2 != null) {
            Integer i1 = null;
            Integer i2 = null;

            if (head1 != null) {
                i1 = Integer.valueOf(head1.val);
            }

            if (head2 != null) {
                i2 = Integer.valueOf(head2.val);
            }

            if (i1 != null && i2 != null) {
                if (i1.intValue() < i2.intValue()) {
                    if (result == null) {
                        resultHead = new ListNode(i1.intValue());
                        result = resultHead;
                    } else {
                        resultHead.next = new ListNode(i1.intValue());
                        resultHead = resultHead.next;
                    }
                    head1 = head1.next;
                } else {
                    if (result == null) {
                        resultHead = new ListNode(i2.intValue());
                        result = resultHead;
                    } else {
                        resultHead.next = new ListNode(i2.intValue());
                        resultHead = resultHead.next;
                    }
                    head2 = head2.next;
                }
            } else if (i1 != null) {
                if (result == null) {
                    resultHead = new ListNode(i1.intValue());
                    result = resultHead;
                } else {
                    resultHead.next = new ListNode(i1.intValue());
                    resultHead = resultHead.next;
                }
                head1 = head1.next;
            } else {
                if (result == null) {
                    resultHead = new ListNode(i2.intValue());
                    result = resultHead;
                } else {
                    resultHead.next = new ListNode(i2.intValue());
                    resultHead = resultHead.next;
                }
                head2 = head2.next;
            }
        }

        return result;
    }
}
