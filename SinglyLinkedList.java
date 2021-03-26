import java.util.Scanner;

public class SinglyLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void printLinkedList(){
        Node p = head;
        while(p.next!=null){
            System.out.print(p.data+" ");
            p = p.next;
        }
        System.out.print(p.data);
    }

    public void insertionAtFront(Node newnode){
        newnode.next = head;
        head = newnode;
    }

    public void insertionAtEnd(Node newnode){
        Node p = head;
        while(p.next != null){
            p = p.next;
        }
        p.next = newnode;
    }

    public void insertionAtSpecificPostion(Node newnode, int pos){
        Node p = head;
        int count=1;
        while(count < pos-1){
            p = p.next;
            count++;
        }
        Node d = p.next;
        p.next = newnode;
        newnode.next = d;
    }

    public static void main(String[] args) {
        SinglyLinkedList s = new SinglyLinkedList();

        // Creating Nodes
        s.head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        // Linking Nodes
        s.head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Scanner sc = new Scanner(System.in);

        s.insertionAtSpecificPostion(new Node(sc.nextInt()), 3);
        s.printLinkedList();
    }

}
