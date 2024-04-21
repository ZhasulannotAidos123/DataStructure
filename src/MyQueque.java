public class MyQueque<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();


    public int getSize() {
        return list.getSize();
    }


    public void enqueue(T newItem) {
        list.addElement(newItem);
    }


    public T peek() {


        return list.getData(0);
    }


    public T dequeue() {


        T removedItem = list.getData(0);
        list.remove(0);
        return removedItem;
    }


    public boolean isEmpty() {
        return list.getSize() == 0;
    }
}
