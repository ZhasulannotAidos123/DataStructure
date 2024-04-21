public class Main {
    public static void main(String[] args) {
        testAdd();
        testGet();
        testSet();
        testRemove();
        testSize();

    }
    public static void testAdd() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        System.out.println("Added elements: " + list); // Output: [1, 2, 3]
    }

    public static void testGet() {
        MyArrayList<String> list = new MyArrayList<>();
        list.addElement("apple");
        list.addElement("banana");
        System.out.println("Element at index 1: " + list.getElement(1)); // Output: "banana"
    }

    public static void testSet() {
        MyArrayList<Double> list = new MyArrayList<>();
        list.addElement(1.1);

        System.out.println("Updated list: " + list); // Output: [2.2]
    }

    public static void testRemove() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        list.removeElement(1);
        System.out.println("List after removal: " + list); // Output: [1, 3]
    }

    public static void testSize() {
        MyArrayList<String> list = new MyArrayList<>();
        list.addElement("q");
        list.addElement("wqe");
        System.out.println("Size of the list: " + list.getSize()); // Output: 2
    }
}