/**
 * Queue with synchronized enqueue, dequeue, and hasNext functions for multithreaded hapiness
 * 
 */
public class Queue<E> {
    private Node front;

    public Queue() {
        front = null;
    }
    public Queue(Node front) {
        this.front = front;
    }
    public synchronized void enqueue(Object data) {
        Node noob = new Node(data, front);
        front = noob;
    }
    public synchronized Node dequeue() {
        Node tmp = front;
        front = front.getNext();
        return tmp;
    }
    public synchronized boolean hasNext() {
        return front != null;
    }
    public void printQueue() {
        Node nd = this.front;
        int i = 0;
        while(nd != null) {
            System.out.println("Queue item: <" + i + "> Node data: " + nd.getData().toString());
            nd = nd.getNext();
            i++;
        }
    }
    public int size() {
        Node nd = this.front;
        int i = 0;
        while(nd != null) {
            nd = nd.getNext();
            i++;
        }
        return i;
    }
}