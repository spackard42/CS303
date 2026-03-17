public class SingleLinkedList<T> {
    private Node head;
    private Node tail;
    private int size;

    private static class Node<T>{
        T data;
        Node<T> next;
        private Node(){
            data = null;
            next = null;
        }
        private Node(T data){
            this.next = null;
            this.data=data;
        }
        public T data(){
            return data;
        }
        public void setNext(Node n){
            next = n;
        }
        public Node getNext(){
            return next;
        }
        public T getData(){
            return data;
        }
    }
    SingleLinkedList(){
        head = tail = null;
        size = 0;
    }
    public void addFirst(T item){
        Node add = new Node(item); 
    }
    public void addLast(T item){
        Node add = new Node(item);
        tail.setNext(add);
        tail = add;
    }
    public T removeFirst(){
        Node temp = head;
        //head = head.getTail
        head = head.getNext();
        return temp.data;
    }
    public T removeLast(){
        Node temp = tail;
        for (int i = 0; i < size-1; i++)
            temp = temp.next;
        tail = temp;
        return temp.getData();
    }
    public T getFirst(){
        return head.getData();
    }

    public T getLast(){
        return tail.data;
    }
    //tests if the head is empty, if so then linked list is empty and returns true. otherwise returns false.
    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        return false;
    }
    public void insert (int index, T item){

    }
    public boolean remove(int index){
        if (index > size){
            return false;
        }
        //might add test for if head or tail
        for (int i = 0; i < index; i++){
            Node temp = head.getNext();

        }
        return true;
    }

}
