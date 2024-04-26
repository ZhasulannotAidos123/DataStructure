public   class MyLinkedList<T> implements List<T>{
    private Node<T> head;
    private int size;
    private Node<T> tail;

    public MyLinkedList() {
        head = null;
        size = 0;
    }
    @Override
    public void set(int index,T value)
    {
        checkIndex(index);
        Node<T> current = head;
        Node<T> newNode=new Node(value);
        for (int i = 0; i < index-1; i++) {
            current = current.next;
        }
        newNode.next=current.next;
        newNode.perv=current;
        current.next=newNode;
        size+=1;
    }
    @Override
    public T getFist()
    {
        return head.data;
    }
    @Override
    public T getLast()
    {
        return tail.data;
    }
    @Override
    public void removeFirst()
    {
        head=head.next;
    }
    @Override
    public void removeLast()
    {
        tail.perv=tail;
    }
    @Override
    public int lastIndexOf(T value)
    {
        int i=0;
        Node<T> current = head;
        Node<T> newNode=new Node(value);
        while(current.next!=null){

            if(current.data==value)
            {
                return i;
            }
            i+=1;
            current = current.next;
        }
        return  -1;
    }
    @Override
    public void clear() {
        head = null;
        size = 0;
    }
    @Override
    public void sort()
    {
        int n = size;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (((Comparable<T>) get(i)).compareTo(get(i + 1)) > 0) {
                    T i1=get(i);
                    T i2=get(i+1);
                    T temp = i1;
                    i1=i2;
                    temp=i2;
                }
            }
        }
    }
    @Override
    public boolean consists(T value) {
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

    @Override
    public T get(int index) {
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
