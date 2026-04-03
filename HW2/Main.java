import java.util.*;
public class Main {
    public static void main(String[] args){
         //q1.
         //LinkedList Ssingle = new LinkedList<>();
         //q2
        StackArray stk = new StackArray();
        if(stk.isEmpty()){
            System.out.println("Stack is empty");
        }
        stk.push(3);
        stk.push(5);
        stk.push(3);
        stk.push(2);
        stk.push(17);
        System.out.println("Average is " + stk.average());
        System.out.println("numbers in stack are:");
        while(!stk.isEmpty()){
            System.out.println(stk.pop());
        }

    }

}
