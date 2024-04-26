public class MyMinHeap<T> {
    private MyArrayList<Double> array = new MyArrayList<>();
    private int size;


    public int size() {
        return size;
    }


    public boolean empty() {
        return size == 0;
    }


    public double getMin() {


        return array.get(0);
    }


    public double extractMin() {


        double min = array.get(0);
        array.set(0,array.get(size - 1));
        array.remove(size - 1);
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


        if (leftChildIndex < size && array.get(leftChildIndex) < array.get(smallest)) {
            smallest = leftChildIndex;
        }
        if (rightChildIndex < size && array.get(rightChildIndex) < array.get(smallest)) {
            smallest = rightChildIndex;
        }


        if (smallest != index) {
            swap(index, smallest);
            heapify(smallest);
        }
    }


    private void traverseUp(int index) {
        while (index > 0 && array.get(index) < array.get(parentOf(index))) {
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
        double temp = array.get(index1);
        array.set( index1,array.get(index2));
        array.set( index2,temp);
    }
}

