/**
 * Created by lab on 5/28/2016.
 */
public class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node() {}
}
