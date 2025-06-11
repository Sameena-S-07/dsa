package addon;

import addon.Task3day3.Node;

public class Task3day3 {
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int val)
		{
			data=val;
			next=null;
		}
	}

	
	public void InsertData(int val) {
		Node newNode=new Node(val);
		if(head==null)
		{
			head=newNode;
			newNode.next=null;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
	}
	public void deleteAtPosition(int delpos)
	{
		Node temp=head;
		Node dtemp=null;
		for(int i=0;i<delpos-1;i++)
		{
			dtemp=temp;
			temp=temp.next;
		}
		dtemp.next=temp.next;
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String []args)
	{
		Task3day3 d1=new Task3day3();
		d1.InsertData(45);
		d1.InsertData(67);
		d1.InsertData(87);
		d1.InsertData(56);
		d1.InsertData(78);
		d1.deleteAtPosition(3);
		d1.display();
	}

}
