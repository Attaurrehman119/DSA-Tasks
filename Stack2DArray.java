class Stack2DArray {

    int[][] stack = new int[1][5];

    int top = -1;

    // Push operation
    void push(int data) {

        if (top == stack[0].length - 1) {
            System.out.println("Stack is full.");
            return;
        }

        top++;

        stack[0][top] = data;

        System.out.println(data + " pushed into stack.");
    }

    // Pop operation
    void pop() {

        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println(stack[0][top] + " popped from stack.");

        top--;
    }

    // Peek operation
    void peek() {

        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element: " + stack[0][top]);
        }
    }

    // Display operation
    void display() {

        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[0][i]);
        }
    }

    public static void main(String[] args) {

        Stack2DArray stack = new Stack2DArray();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        stack.peek();

        stack.pop();

        stack.display();
    }
}
