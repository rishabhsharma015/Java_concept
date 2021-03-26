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
    public void printLinkedList(){                                            // Printing Linked List
        Node p = head;
        while(p.next!=null){
            System.out.print(p.data+" ");
            p = p.next;
        }
        System.out.print(p.data);
    }

    public void insertionAtFront(Node newnode){                               // Inserting a new Node at beginning
        newnode.next = head;
        head = newnode;
    }

    public void insertionAtEnd(Node newnode){                                 // Inserting a new Node at End
        Node p = head;
        while(p.next != null){
            p = p.next;
        }
        p.next = newnode;
    }

    public void insertionAtSpecificPostion(Node newnode, int pos){            // Inserting a new Node at Specific Postion
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
    
    public void deleteFromFront(){                                           // Deleting a Node from Front
        if(head == null){
            System.out.println("List is Empty");
        }
        else {
            head = head.next;
        }
    }

    public void deleteFromEnd(){                                             // Deleting a Node from End
        Node p = head;
        if(head == null){
            System.out.println("Can't delete, list is Empty");
        }
        else {
            while (p.next.next != null) {
                p = p.next;
            }
            p.next = null;
        }
    }

    public void deleteFromSpecificPostion(int pos){                        // Deleting a Node from specific Postion.
        Node p = head;
        Node d;
        int count = 1;
        while(count < pos-1){
            p = p.next;
            count++;
        }
        d = p.next;
        p.next = d.next;
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
