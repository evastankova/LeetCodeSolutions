import java.util.List;

public class IntersectionOfLinkedLists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;

        while (currA != null) {

            while (currB != null) {
                if (currA == currB) {
                    return currB;
                }
                currB = currB.next;
            }

            currA = currA.next;
            currB = headB;
        }
        return null;
    }

    public static void main(String[] args) {
        // intersection
        ListNode end = new ListNode(5);
        ListNode n1 = new ListNode(6, end);
        ListNode beginning = new ListNode(8, n1);
        // list 1
        ListNode n2 = new ListNode(4, beginning);
        ListNode n3 = new ListNode(6, n2);
        // list 2
        ListNode n4 = new ListNode(1, beginning);

        try {
            System.out.println(getIntersectionNode(n4, n3).val);
        } catch (NullPointerException e) {
            System.out.println("null pointer exception");
        }
    }
}
