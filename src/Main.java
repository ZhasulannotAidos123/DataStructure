public class Main {
    public static void main(String[] args) {
        testInsert();
        testGetMin();
        testExtractMin();
    }

    // Tests the insert method by adding items to the min heap and checking the size
    public static void testInsert() {
        MyMinHeap heap = new MyMinHeap();
        heap.insert(4.0);
        heap.insert(2.0);
        heap.insert(7.0);
        heap.insert(1.0);
        heap.insert(5.0);
        System.out.println("Size of the heap after inserting: " + heap.size()); // Output: 5
    }

    // Tests the getMin method by adding items to the min heap and retrieving the minimum
    public static void testGetMin() {
        MyMinHeap heap = new MyMinHeap();
        heap.insert(4.0);
        heap.insert(2.0);
        heap.insert(7.0);
        heap.insert(1.0);
        heap.insert(5.0);
        System.out.println("Minimum element in the heap: " + heap.getMin()); // Output: 1.0
    }

    // Tests the extractMin method by adding items to the min heap, extracting the minimum, and checking the size
    public static void testExtractMin() {
        MyMinHeap heap = new MyMinHeap();
        heap.insert(4.0);
        heap.insert(2.0);
        heap.insert(7.0);
        heap.insert(1.0);
        heap.insert(5.0);
        double min = heap.extractMin();
        System.out.println("Extracted minimum element: " + min); // Output: 1.0
        System.out.println("Size of the heap after extraction: " + heap.size()); // Output: 4
    }
}