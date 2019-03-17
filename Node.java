/**
 * This is a Node
 */
public class Node {
    private Object data;
    Node next;
    public Node(){
        
    }
    public Node(Object data){
        this.data = data;
        this.next = null;
    }
    public Node(Object data, Node next){
        this.data = data;
        this.next = next;
    }
    // getters
    public Object getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    // setters
    public void setData(Object data){
        this.data = data;
    }
    public void setNext(Node next){
        this.next = next;
    }
}