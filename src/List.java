public interface List<T> {
    void addElement(T data);
    //some pretty methods goes here
    void set(int index,T item );
    T get(int Index);
    T getFist();
    T getLast();
    void remove(int index);
    void removeFirst();
    void removeLast();
    void sort();
    int indexOf(T item);
    int lastIndexOf(T item );
    boolean consists();
    void clear();
}

