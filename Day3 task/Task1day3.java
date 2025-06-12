package addon;

public class Task1day3 {
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int val)
		{
			data=val;
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
		Task1day3 d1=new Task1day3();
		d1.InsertData(45);
		d1.InsertData(67);
		d1.InsertData(87);
		d1.display();
	}

}
