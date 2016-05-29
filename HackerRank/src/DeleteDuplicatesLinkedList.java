/**
 * Created by lab on 5/29/2016.
 */
public class DeleteDuplicatesLinkedList {

    Node RemoveDuplicates(Node head) {
        // This is a "method-only" submission.
        // You only need to complete this method.

        Node current = head.next;
        Node prev = head;

        while (current != null) {
            if (prev.data == current.data) {
                head = deleteNode(head, prev.data);
            }
            prev = current;
            current = current.next;
        }
        return head;
    }

    Node deleteNode(Node head, int number) {
        Node prev = head;
        Node current = head.next;

        if (prev.data == number) { //base case
            Node temp = head;
            head = head.next;
            temp.next = null;
        } else {
            while (current.data != number) {
                prev = current;
                current = current.next;
            }
            prev.next = current.next;
            current.next = null;
        }
        return head;
    }

}
