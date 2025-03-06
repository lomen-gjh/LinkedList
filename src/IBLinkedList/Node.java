package IBLinkedList;

public class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    public void setData(int data) {
        this.data = data;
    }
    public int getData() {
        return this.data;
    }
    public void add(int data){
        next=new Node(data);
    }
    public void add(Node node){
        next=node;
    }
}
