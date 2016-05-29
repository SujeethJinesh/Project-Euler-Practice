/**
 * Created by lab on 5/28/2016.
 */
public class ReverseLinkedList {

    /**
     * Reverses a linked list
     * @param head head of the linked list
     * @return updated head
     */
    Node Reverse(Node head) {

        if (head == null) {
            return head;
        } else {
            Node current = head;
            Node next = current.next;
            Node prev = current;

            head.next = null;

            while (true) {
                prev = current;
                current = next;
                next = next.next;

                current.next = prev;
                if (next == null) {
                    head = current;
                    break;
                }

            }
        }
        return head;
    }

}
