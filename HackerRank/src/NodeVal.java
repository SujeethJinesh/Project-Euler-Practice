/**
 * Created by lab on 5/28/2016.
 */
public class NodeVal {

    int GetNode(Node head,int n) {
        // This is a "method-only" submission.
        // You only need to complete this method.

        Node first = head;
        Node second = head;

        int counter = 0;

        while (first.next != null) {
            counter++;
            first = first.next;
        }

        counter -= n;

        int placeHolder = 0;

        while (placeHolder != counter) {
            second = second.next;
            placeHolder++;
        }
        return second.data;
    }

}
