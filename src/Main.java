public class Main {
    public static void main(String[] args) {
        testPush();
        testPeek();
        testPop();
        testEmpty();
    }

    public static void testPush() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Size of the stack after pushing: " + stack.getSize()); // Output: 3
    }

    public static void testPeek() {
        MyStack<String> stack = new MyStack<>();
        stack.push("apple");
        stack.push("banana");
        System.out.println("Peek element: " + stack.peek()); // Output: "banana"
    }

    public static void testPop() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int removedItem = stack.pop();
        System.out.println("Removed element: " + removedItem); // Output: 3
        System.out.println("Size of the stack after popping: " + stack.getSize()); // Output: 2
    }

    public static void testEmpty() {
        MyStack<Character> stack = new MyStack<>();
        System.out.println("Is the stack empty? " + stack.empty()); // Output: true
    }
}