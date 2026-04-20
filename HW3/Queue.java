package HW3;
import java.util.LinkedList;
//A queue using the <> data type 
//I'd prefer the linked list


public class Queue<T> {
    private LinkedList<T> list;
    int size;

    public Queue(){
        size = 0;
        list = new LinkedList<T>();
    }
    public Queue(T initialItem){
        list = new LinkedList<T>();
        list.add(initialItem);
        size = 1;
    }
    public boolean offer(T e){
        try {
            list.offer(e);
            size++;
            return true;
        }
        catch(Error err){
            throw err;
        }
    }
    public T poll(){
        if(list.isEmpty()){
            throw new Error("Queue is Empty");
        }
        size--;
        return list.poll();
    }
    public T peek(){
        if(list.isEmpty()){
            throw new Error("Queue is Empty");
        }
        return list.peek();
    }
    public int size(){
        return size;
    }

    public T move_to_rear(){
        T temp;
        list.offer(temp = list.poll());
        return temp;
    }
    public void empty(){
        list.clear();
        size = 0;
    }
}
