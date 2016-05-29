/**
 * Created by lab on 5/28/2016.
 */
public class Compare {

    int CompareLists(Node headA, Node headB) {
        // This is a "method-only" submission.
        // You only need to complete this method

        Node currentA = headA;
        Node currentB = headB;

        while (true) {
            if (currentA == null && currentB == null) {
                break;
            }
            if (currentA == null || currentB == null || currentA.data != currentB.data) {
                return 0;
            }
            currentA = currentA.next;
            currentB = currentB.next;
        }
        return 1;
    }

}
