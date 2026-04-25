import java.util.LinkedList;
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
    //Q3
    //standard insertion sort using a LinkedList
    public static void linkedInsertionSort(LinkedList<Integer> list){
        int i, j, key;
        boolean insertionNeeded = false;
        for (j = 1; j < list.size(); j++){
            key = list.get(j);
            insertionNeeded = false;
            for (i = j - 1; i >= 0; i--){
                int temp = list.get(i);
                if (key < list.get(i)){
                    list.set(i+1,list.get(i)); 
                    // larger values move right
                    insertionNeeded = true;
                }
                else{
                    break;
                }
            }
        if (insertionNeeded) {
            list.set(i+1, key); // put key into its properlocation
            }
        }
    }
}