import java.util.ArrayList;
public class StackArray {
    private ArrayList<Integer> arr;
    private int size;
    private int top; //the item that will be popped from a stack
    private int bottom;
    //default constructor
    public StackArray(){
        arr = new ArrayList<>();
        top = 0;
    }
    public StackArray(int size){
        arr = new ArrayList<>(size);
        this.size = size;
        top = 0;
    }
    //getters
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(arr.isEmpty()){
            return true;
        }
        return false;
    }


    public void push(int add){
        top++;
        arr.add(top, add);
        size++;
    }
    public int peek(){
        return arr.get(top);
    }
    //peek the current 
    public int pop(){
        int out = peek();
        if (out == 0 && top == 0){
            throw new NullPointerException("This Stack is empty");
        }
        arr.remove(top);
        size--;
        top--;
        return out;
    }
    

    public double average(){
        int sum=0;
        int i =0;
        for (; i < size; i++){
            sum += arr.get(i);
        }
        double avg = sum/i;
        return avg;
        
    }
    

}
