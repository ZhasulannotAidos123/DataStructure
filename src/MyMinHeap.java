public class MyMinHeap {
    private MyArrayList<Double> array = new MyArrayList<>();
    private int size;


    public int size() {
        return size;
    }


    public boolean empty() {
        return size == 0;
    }


    public double getMin() {


        return array.getElement(0);
    }


    public double extractMin() {


        double min = array.getElement(0);
        array.addElement(array.getElement(size - 1), 0);
        array.removeElement(size - 1);
        size--;
        heapify(0);
        return min;
    }


    public void insert(double newItem) {
        array.addElement(newItem);
        size++;
        traverseUp(size - 1);
    }


    private void heapify(int index) {
        int leftChildIndex = leftChildOf(index);
        int rightChildIndex = rightChildOf(index);
        int smallest = index;


        if (leftChildIndex < size && array.getElement(leftChildIndex) < array.getElement(smallest)) {
            smallest = leftChildIndex;
        }
        if (rightChildIndex < size && array.getElement(rightChildIndex) < array.getElement(smallest)) {
            smallest = rightChildIndex;
        }


        if (smallest != index) {
            swap(index, smallest);
            heapify(smallest);
        }
    }


    private void traverseUp(int index) {
        while (index > 0 && array.getElement(index) < array.getElement(parentOf(index))) {
            swap(index, parentOf(index));
            index = parentOf(index);
        }
    }


    private int leftChildOf(int index) {
        return 2 * index + 1;
    }


    private int rightChildOf(int index) {
        return 2 * index + 2;
    }


    private int parentOf(int index) {
        return (index - 1) / 2;
    }
    private void swap(int index1, int index2) {
        double temp = array.getElement(index1);
        array.addElement(array.getElement(index2), index1);
        array.addElement(temp, index2);
    }
}

