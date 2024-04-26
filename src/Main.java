public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        // Add elements
        list.addElement("apple");
        list.addElement("banana");
        list.addElement("cherry");

        // Get size
        System.out.println("List size: " + list.getSize()); // Output: List size: 3

        // Get element
        System.out.println("First element: " + list.get(0)); // Output: First element: apple

        // Set element
        list.set(1, "orange");
        System.out.println("List after set: " + list.get(1)); // This would require a toString() method for MyLinkedList to print the list contents

        // Remove element
        list.remove(2);
        System.out.println("List after remove: " + list.getSize()); // This would require a toString() method for MyLinkedList to print the list contents

        // Contains check
        System.out.println("Contains 'banana': " + list.consists("banana")); // Output: Contains 'banana': false

        // Clear list
        list.clear();
        System.out.println("List size after clear: " + list.getSize()); // Output: List size after clear: 0

        MyLinkedList<String> list1 = new MyLinkedList<>();
        list1.addElement("apple");
        list1.addElement("cherry");

        int index = list1.indexOf("orange");
        System.out.println(" Index of orange is " + index ); // Output: List size after clear: -1
        MyLinkedList<String> list2 = new MyLinkedList<>();
        list2.addElement("apple");
        list2.addElement("banana");
        list2.addElement("apple");

        int lastIndex = list2.lastIndexOf("apple");
        System.out.println("Last index of 'apple': " + lastIndex); // Output: Last index of 'apple':

    }
}


