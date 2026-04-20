package HW3;
import java.util.*;
public class Main {
    public static void main(String[] args){
        //Queue Section
        Queue<Integer> queue = new Queue<Integer>();
        //10 items
        queue.offer(3);
        queue.offer(5);
        queue.offer(7);
        queue.offer(8);
        queue.offer(5);
        queue.offer(12);
        queue.offer(6);
        queue.offer(11);
        queue.offer(100);
        queue.offer(19);

        System.out.printf("Queue currently has %d items.%nThe top item is currently %d", queue.size(), queue.poll());
        System.out.println("removing top item");
        System.out.println("After polling from the top of the list, the top item is " + );


    }
}