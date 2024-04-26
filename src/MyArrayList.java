public class MyArrayList<T> implements List<T>{
    private T[] arr = (T[]) new Object[5];
    private int size;



    public MyArrayList(){
        size = 0;
    }
    @Override
    public void addElement(T element){
        if(size>=arr.length){
            increaseBuffer();
        }
        arr[size++] = element;
    }
    @Override
    public void set( int index,T element){
        checkIndex(index);
        if(size>= arr.length){
            increaseBuffer();
        }
        arr[index] = element;
    }


    private void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    @Override
    public T get(int index){
        checkIndex(index);
        return arr[index];
    }


    public int getSize(){
        return size;
    }

    @Override
    public void remove(int index){
        checkIndex(index);
        for (int i = index+1; i <size ; i++) {
            arr[i-1] = arr[i];
        }
        size--;
    }


    private void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("index not correct");
        }
    }

    @Override
    public void clear(){
        arr = (T[]) new Object[5];
        size = 0;
    }
    @Override
    public void removeLast() {
        T removedElement = arr[size - 1];
        size--;
    }
    @Override
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            if (((Comparable<T>) arr[i]).compareTo(arr[i + 1]) > 0) {
                T temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    @Override
    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(element)) {
                return i;
            }
        }
        return -1; // Element not found
    }
    @Override
    public int lastIndexOf(T element) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i]==element) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public boolean consists(T element) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public T getFist() {

        return arr[0];
    }
    @Override
    public T getLast() {

        return arr[size - 1];
    }
    @Override
    public void removeFirst() {

        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

}
