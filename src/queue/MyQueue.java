package queue;

public class MyQueue {
    private Node front, rear;

    public MyQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        // Tạo node mới và thêm giá trị vào Node
        Node newNode = new Node(data);
        // Nếu hàng đợi là null

        if (this.rear == null) {
            this.front = newNode;
            this.rear = newNode;
            return;
        }
        this.rear.link = newNode;
        this.rear = newNode;
    }

    public int dequeue() {
        if (this.front == null) {
            throw new IllegalStateException("Hàng đợi null ");

        }
        int data = this.front.getData();
        if (this.front == null) {
            this.rear = null;
        }
        this.front = this.front.link;
        return data;
    }

    public void displayData() {

    }
}
