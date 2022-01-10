public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
           this.data = d;
           next = null;
        }
    }

    public void push(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void imprimirLinkedList(){
       Node n = head;
       while(n != null){
           System.out.println(n.data + " ");
           n = n.next;
       }
    }

    public static void main(String[] args) {


        LinkedList llist = new LinkedList();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second;
        second.next = third;

        llist.imprimirLinkedList();
    }
}
