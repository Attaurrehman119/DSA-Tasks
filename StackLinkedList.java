
class StackLinkedList {

  
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    // Push operation
    void push(int data) {

        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;

        System.out.println(data + " pushed into stack.");
    }

    // Pop operation
    void pop() {

        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println(top.data + " popped from stack.");

        top = top.next;
    }

    // Peek operation
    void peek() {

        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }

    // Display operation
    void display() {

        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }

        Node temp = top;

        System.out.println("Stack elements:");

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        stack.peek();

        stack.pop();

        stack.display();
    }
}
