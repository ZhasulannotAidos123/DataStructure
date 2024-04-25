public class MyLinkedList<T> implements List<T>{
    private Node<T> head;
    private int size;
    private Node<T> tail;

    public MyLinkedList() {
        head = null;
        size = 0;
    }
    public void addElementAtIndex(int index,T value)
    {
        checkIndex(index);
        Node<T> current = head;
        Node<T> newNode=new Node(value);
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        newNode.next=current.next;
        newNode.perv=current;
        current.next=newNode;
        size+=1;
    }
    public void clear() {
        head = null;
        size = 0;
    }
    public boolean contains(T value) {
        Node<T> current = head;
        while (current != null) {
            if (current.data==value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public int indexOf(T value) {
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            if (current.data==value) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public void addElement(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }


    public int getSize() {
        return size;
    }


    public T getData(int index) {
        checkIndex(index);
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }


    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index not correct");
    }


    public void remove(int index) {
        checkIndex(index);
        if (index == 0) {
            head = head.next;
        }
        else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }




}
