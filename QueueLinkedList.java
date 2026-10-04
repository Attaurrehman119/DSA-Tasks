class QueueLinkedList {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    // Enqueue operation
    void enqueue(int data) {

        Node newNode = new Node(data);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(data + " inserted into queue.");
    }

    // Dequeue operation
    void dequeue() {

        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println(front.data + " removed from queue.");

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    // Peek operation
    void peek() {

        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element: " + front.data);
        }
    }

    // Display operation
    void display() {

        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node temp = front;

        System.out.println("Queue elements:");

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        QueueLinkedList queue = new QueueLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        queue.peek();

        queue.dequeue();

        queue.display();
    }
}
