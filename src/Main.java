public class Main {
    public static void main(String[] args) {
        // Create an instance of MyArrayList
        MyArrayList<Integer> list = new MyArrayList<>();

        // Add elements to the list
        list.addElement(10);
        list.addElement(5);
        list.addElement(8);
        list.addElement(3);

        // Print the elements of the list
        System.out.println("Original list:");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }

        // Remove the first element
        list.removeFirst();
        System.out.println("\nList after removing first element:");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }

        // Remove the last element
        list.removeLast();
        System.out.println("\nList after removing last element:");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }

        // Sort the list
        list.sort();
        System.out.println("\nList after sorting:");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }

        // Test other methods as needed

        // Test indexOf and lastIndexOf
        System.out.println("\nIndex of 8: " + list.indexOf(8));
        System.out.println("Last index of 8: " + list.lastIndexOf(8));

        // Test consists
        System.out.println("Contains 5: " + list.consists(5));
        System.out.println("Contains 15: " + list.consists(15));

        // Test getFirst and getLast
        System.out.println("First element: " + list.getFist());
        System.out.println("Last element: " + list.getLast());

        // Test set
        list.set(1, 15);
        System.out.println("\nList after setting index 1 to 15:");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
    }
}


