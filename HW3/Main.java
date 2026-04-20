package HW3;
import java.util.*;
public class Main {
    public static void main(String[] args){
        QueueProof();
    }
    //Part b of Q1
    public static void QueueProof(){
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

        System.out.printf("Queue currently has %d items.%nThe top item is currently %d%n", queue.size(), queue.poll());
        System.out.println("After polling from the top of the list, the top item is " + queue.peek() + " and the size is " + queue.size());
        int temp = 0;
        System.out.println("printing queue with for loop as proof of move_to_rear function:");
        for (int i = 0; i < queue.size(); i++){
            System.out.print(queue.move_to_rear() + " ");
        }
        System.out.println("\nemptying queue");
        queue.empty();
        System.out.println("Queue size is now " +queue.size);
    }
}