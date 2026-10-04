class CircularQueue {

    int capacity = 5;
    int[] queue = new int[capacity];
    int front = -1;
    int rear = -1;

    // Enqueue operation
    void enqueue(int data) {

        if ((rear + 1) % capacity == front) {
            System.out.println("Queue is full.");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = data;

        System.out.println(data + " inserted into circular queue.");
    }

    // Dequeue operation
    void dequeue() {

        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println(queue[front] + " removed from circular queue.");

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
    }

    // Peek operation
    void peek() {

        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }

    // Display operation
    void display() {

        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Queue elements:");
        
        int i = front;
        while (true) {
            System.out.println(queue[i]);
            if (i == rear) {
                break;
            }
            i = (i + 1) % capacity;
        }
    }

    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        queue.peek();

        queue.dequeue();

        queue.display();
    }
}
