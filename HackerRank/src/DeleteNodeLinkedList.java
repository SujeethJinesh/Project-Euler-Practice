/**
 * Created by lab on 5/28/2016.
 */
public class DeleteNodeLinkedList {

    Node Delete(Node head, int position) {

        if (position == 0) { //base case
            Node temp = head;
            head = head.next;
            temp.next = null;
        } else {            // special case
            int counter = 1;

            Node prev = head;
            Node current = head.next;

            while (counter != position) {
                counter++;
                prev = current;
                current = current.next;
            }
            prev.next = current.next;
            current.next = null;
        }
        return head;
    }

}
