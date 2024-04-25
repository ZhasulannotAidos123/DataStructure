public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        // Add elements to the list
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        list.addElement(4);
        list.addElement(5);

        // Print the elements in the list
        System.out.println("Elements in the list:");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("Index " + i + ": " + list.getData(i));
        }

        // Test addElementAtIndex
        list.addElementAtIndex(2, 10);
        System.out.println("\nElements in the list after adding 10 at index 2:");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("Index " + i + ": " + list.getData(i));
        }

        // Test remove
        list.remove(3);
        System.out.println("\nElements in the list after removing element at index 3:");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("Index " + i + ": " + list.getData(i));
        }

        // Test contains
        System.out.println("\nDoes the list contain 5? " + list.contains(5));

        // Test indexOf
        System.out.println("Index of element 3: " + list.indexOf(3));


        // Test clear
        list.clear();
        System.out.println("\nList after clearing:");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("Index " + i + ": " + list.getData(i));
        }
    }


}