package IBLinkedList;

public class LinkedList {
    Node head;
    public LinkedList() {
        head = null;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void append(int data){
        if (isEmpty()){
            head=new Node(data);
        }
        else{
            Node current=head;
            while (current.next!=null){//while there is a next node
                current=current.next; //move to the next node
            }
            //when the loop ends, current is the last node
            current.next=new Node(data);//add a new node to the end of the list
        }
    }
    public void prepend(int data){
        Node current=new Node(data);
        current.next=head;
        head=current;
    }
    public int delete(int target){ //returns deleted Node, if any
        if (isEmpty()){
            System.out.println("Nothing to delete...");
            return -1;
        }
        if (head.data==target){
            Node temp=head; //previous head needs to be returned, so store it in a temp variable
            head=head.next; //head.next will be new head
            return temp.data; //previous head will be deleted, the value returned
        }
        Node current=head;
        while (current.next!=null){
            if (current.next.data==target){
                Node temp=current.next; //store the node to be deleted
                current.next=current.next.next; //skip the node to be deleted
                return temp.data; //return the value of the deleted node
            }
            current=current.next; //move to the next node
        }
        System.out.println("Target not found");
        return -1;
    }
    public void printLinkedList(){
        if (isEmpty()){
            System.out.println("Nothing to print...");
        }
        else{
            Node current=head;
            while (current!=null){
                System.out.print(current.data+"->");
                current=current.next;
            }
            System.out.println();
        }
    }

}
