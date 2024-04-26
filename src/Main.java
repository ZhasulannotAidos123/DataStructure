public class Main {
    public static void main(String[] args) {
        // Create a queue of integers
        MyQueque<Integer> queue = new MyQueque<>();

        // Enqueue elements into the queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Print the size of the queue
        System.out.println("Size of the queue: " + queue.getSize());

        // Print the front element of the queue (peek)
        System.out.println("Front element of the queue: " + queue.peek());

        // Dequeue elements from the queue
        System.out.println("Dequeue elements from the queue:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}


