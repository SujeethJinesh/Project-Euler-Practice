/**
 * Created by lab on 5/29/2016.
 */
public class CycleDetectionLinkedList {

    boolean hasCycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (slow != null || fast != null) {
            slow = slow.next;
            fast = fast.next;

            if (slow == null || fast == null) {
                return false;
            }

            fast = fast.next;

            if (fast == null) {
                return false;
            }

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

}
