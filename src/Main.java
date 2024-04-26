public class Main {
    public static void main(String[] args) {
        // Create a min heap of doubles
        MyMinHeap heap = new MyMinHeap();

        // Insert elements into the min heap
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(15);
        heap.insert(25);

        // Print the size of the heap
        System.out.println("Size of the min heap: " + heap.size());

        // Print the minimum element of the heap
        System.out.println("Minimum element of the min heap: " + heap.getMin());

        // Extract the minimum element from the heap
        System.out.println("Extracted minimum element from the min heap: " + heap.extractMin());

        // Print the size of the heap after extraction
        System.out.println("Size of the min heap after extraction: " + heap.size());
    }
}


