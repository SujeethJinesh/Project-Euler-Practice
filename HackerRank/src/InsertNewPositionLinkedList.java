/**
 * Created by lab on 5/28/2016.
 */
public class InsertNewPositionLinkedList {

    /**
     * Runs in O(n)
     * @param head given head node
     * @param data given data
     * @param position position to add node
     * @return head
     */
    Node InsertNth(Node head, int data, int position) {
        // This is a "method-only" submission.
        // You only need to complete this method.

        if (position == 0) {

            Node node = new Node();
            node.data = data;
            node.next = head;
            head = node;

        } else {
            int counter = 1;

            Node current = head.next;
            Node prev = head;

            Node newNode = new Node();
            newNode.data = data;

            while (counter != position) {
                counter++;
                prev = current;
                current = current.next;
            }
            prev.next = newNode;
            newNode.next = current;
        }
        return head;
    }

}