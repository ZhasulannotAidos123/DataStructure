public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        // Add elements to the list
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        list.addElement(4);
        list.addElement(5);

        // Print the elements in the list
        System.out.println("Elements in the list:");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("Index " + i + ": " + list.getElement(i));
        }

        // Add an element at a specific index
        list.addElement(10, 2);

        // Print the elements in the list after adding an element at index 2
        System.out.println("\nElements in the list after adding 10 at index 2:");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("Index " + i + ": " + list.getElement(i));
        }

        // Remove an element at a specific index
        list.removeElement(3);

        // Print the elements in the list after removing an element at index 3
        System.out.println("\nElements in the list after removing element at index 3:");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("Index " + i + ": " + list.getElement(i));
        }

        // Clear the list
        list.clear();

        // Print the elements in the list after clearing
        System.out.println("\nElements in the list after clearing:");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("Index " + i + ": " + list.getElement(i));
        }
    }


}