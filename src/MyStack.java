public class MyStack<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();
    public int getSize()
    {
        return  list.getSize();
    }
    public void push(T newItem) {
        list.addElement(newItem);
    }


    public T peek() {
        return get();
    }
    public T get()
    {
        return list.get(list.getSize()-1);
    }
    public T pop() {


        T removedItem = get();
        list.remove(list.getSize() - 1);
        return removedItem;
    }
    public boolean empty() {
        return list.getSize() == 0;
    }
}
