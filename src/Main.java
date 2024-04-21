public class Main {
    public static void main(String[] args) {
        testPush();
        testPeek();
        testPop();
        testEmpty();
    }

    // Tests the push method by adding items to the stack and checking the size
    public static void testPush() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Size of the stack after pushing: " + stack.getSize()); // Output: 3
    }

    // Tests the peek method by adding items to the stack and peeking at the top item
    public static void testPeek() {
        MyStack<String> stack = new MyStack<>();
        stack.push("apple");
        stack.push("banana");
        System.out.println("Peek element: " + stack.peek()); // Output: "banana"
    }

    // Tests the pop method by adding items to the stack, popping an item, and checking the size
    public static void testPop() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int removedItem = stack.pop();
        System.out.println("Removed element: " + removedItem); // Output: 3
        System.out.println("Size of the stack after popping: " + stack.getSize()); // Output: 2
    }

    // Tests the empty method by creating an empty stack and checking if it's empty
    public static void testEmpty() {
        MyStack<Character> stack = new MyStack<>();
        System.out.println("Is the stack empty? " + stack.empty()); // Output: true
    }
}