import java.util.ArrayList;
public class StackArray {
    private ArrayList<Integer> arr;
    private int size;
    private int top; //the item that will be popped from a stack
    private int bottom;
    //default constructor
    public StackArray(){
        arr = new ArrayList<>();
        top = -1;
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
        arr.add(++top, add);
        //top++;
        size++;
    } 
    public int peek(){
        if (arr.isEmpty()){
            throw new NullPointerException("This Stack is empty");
        }
        return arr.get(top);
    }
    //peek the current 
    public int pop(){
        int out = peek();
        arr.remove(top);
        size--;
        top--;  
        return out;
    }
    

    public double average(){
        int sum=0;
        for (int i =0; i < size; i++){
            sum += arr.get(i);
        }
        double avg = sum/size;
        return avg;
        
    }
    

}
