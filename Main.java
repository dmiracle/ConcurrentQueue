import java.util.Random;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main {
    public static void main(String args[]) {
        Queue<Integer> randos = new Queue<>();
        Queue<Integer> top = new Queue<>();
        Random rand = new Random();
        Integer length = rand.nextInt(1000) + 1;
        for(int i = 0; i < length; i++) {
            Integer test = rand.nextInt(100000000);
            randos.enqueue(test);
        } 
        randos.printQueue();
        System.out.println("Length=" + length + " Size=" + randos.size());
        
        PriorityQueue<Integer> sorter = new PriorityQueue<>(length, Collections.reverseOrder());
        while(randos.hasNext()) {
            sorter.add((Integer)randos.dequeue().getData());
        }
        for(int i = 0; i < 10 ; i++) {
            top.enqueue(sorter.poll());
        }
        top.printQueue();
    }
}