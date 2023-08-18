// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void printList(ListNode ln) {
        ListNode lnT = ln;
        while (lnT != null) {
            System.out.print(lnT.val + " ");
            lnT = lnT.next;
        }
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(3);
        list1.next = new ListNode(5);
        list1.next.next = new ListNode(7);

        ListNode list2 = new ListNode(11);
        list2.next = new ListNode(13);
        list2.next.next = new ListNode(14);

        System.out.println("List1:");
        System.out.print("[");
        printList(list1);
        System.out.println("]");

        System.out.println("List2:");
        System.out.print("[");
        printList(list2);
        System.out.println("]");

        Solution solution = new Solution();
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        System.out.println("Merged List:");
        System.out.print("[");
        printList(mergedList);
        System.out.println("]");
    }
}