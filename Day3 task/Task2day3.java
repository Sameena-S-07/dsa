package addon;

import java.util.Scanner;
public class Task2day3
{

	Node head;
	class Node{
		int data;
		Node next;
		Node(int val)
		{
			data=val;
			next=null;
		}}
	
	public void insertAtBegin(int val)
	{
		Node newNode=new Node(val);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node temp=head;
			newNode.next=temp;
			head=newNode;
		}
		}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
			
		}
	}
	public void insertAtAnyPos(int pos, int val) {
        Node newNode = new Node(val);     
                if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;       
        for (int i = 1; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("The position is out of range.");
                return;
            }
            temp = temp.next;
        }        
        newNode.next = temp.next;
        temp.next = newNode;
	}
	public static void main(String []args)
	{
		Task2day3 d=new Task2day3();

		d.insertAtBegin(3);
		d.insertAtBegin(5);
		d.insertAtBegin(40);
		d.insertAtBegin(45);
		d.insertAtBegin(63);
		d.insertAtBegin(98);
		d.insertAtAnyPos(3,45);
		d.display();
	}

}