import java.util.LinkedList;
//Queue class that can be used to edit a variety of types.
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
    //takes in an object of the predefined object and adds it to the end of the queue
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
    //returns the object at the front of the queue and removes it
    public T poll(){
        if(list.isEmpty()){
            throw new Error("Queue is Empty");
        }
        size--;
        return list.poll();
    }
    //returns the current item at the front of the queue without removing it from the queue
    public T peek(){
        if(list.isEmpty()){
            throw new Error("Queue is Empty");
        }
        return list.peek();
    }
    //returns how many items are in the queue
    public int size(){
        return size;
    }
    //sends the current head of the queue to the rear
    public T move_to_rear(){
        T temp;
        list.offer(temp = list.poll());
        return temp;
    }
    //removes all items from the queue, 
    // note it does not reset the excpected object type
    public void empty(){
        list.clear();
        size = 0;
    }
    //Q3
    
}
