public class Main {
    public static void main(String[] args) {
        testEnqueue();
        testPeek();
        testDequeue();
        testIsEmpty();
    }

    // Tests the enqueue method by adding items to the queue and checking the size
    public static void testEnqueue() {
        MyQueque<Integer> queue = new MyQueque<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Size of the queue after enqueueing: " + queue.getSize()); // Output: 3
    }

    // Tests the peek method by adding items to the queue and peeking at the front item
    public static void testPeek() {
        MyQueque<String> queue = new MyQueque<>();
        queue.enqueue("apple");
        queue.enqueue("banana");
        System.out.println("Peek element: " + queue.peek()); // Output: "apple"
    }

    // Tests the dequeue method by adding items to the queue, dequeueing an item, and checking the size
    public static void testDequeue() {
        MyQueque<Integer> queue = new MyQueque<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        int removedItem = queue.dequeue();
        System.out.println("Removed element: " + removedItem); // Output: 1
        System.out.println("Size of the queue after dequeueing: " + queue.getSize()); // Output: 2
    }

    // Tests the isEmpty method by creating an empty queue and checking if it's empty
    public static void testIsEmpty() {
        MyQueque<Character> queue = new MyQueque<>();
        System.out.println("Is the queue empty? " + queue.isEmpty()); // Output: true
    }
}