public class Main {
    public static void main(String[] args) {
        // Create a stack of integers
        MyStack<Integer> stack = new MyStack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Print the size of the stack
        System.out.println("Size of the stack: " + stack.getSize());

        // Print the top element of the stack (peek)
        System.out.println("Top element of the stack: " + stack.peek());

        // Pop elements from the stack
        System.out.println("Pop elements from the stack:");
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.empty());
    }
}


