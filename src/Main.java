import IBLinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.prepend(4);
        ll.printLinkedList();
        ll.delete(2);
        ll.printLinkedList();
    }
}
