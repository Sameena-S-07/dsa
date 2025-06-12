package addon;

import java.util.LinkedList;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
    }
}

public class mainprg3 {

   
    static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev; 
    }

    
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
       
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Original list:");
        printList(head);

        head = reverseList(head);

        System.out.println("Reversed list:");
        printList(head);
    }
}
