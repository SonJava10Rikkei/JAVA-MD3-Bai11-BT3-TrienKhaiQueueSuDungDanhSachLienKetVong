package queue;

public class Node {
    Node link;
    private int data;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }

    public int getData() {
        return this.data;
    }
}
