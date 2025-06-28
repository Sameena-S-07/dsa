package addon;

public class Task1day5 {
	Node last;

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

	public Task1day5()

	{

		last=null;

	}

	

	public void insertValue(int val)

	{

		Node newnode=new Node(val);

		if(last==null)

		{

			last=newnode;

			last.next=last;

		}

		else

		{

			
			
			
			newnode.next = last.next; 
            last.next = newnode;   

		}

	}

		public void display()

		{

			Node temp=last.next;

	do		
			{

				System.out.println(temp.data+" ");

				temp=temp.next;

			}while(temp!=last.next);

			System.out.println();

		}

	

	public static void main(String args[]) {

		Task1day5 d5=new Task1day5();

		d5.insertValue(45);

		d5.insertValue(55);
		d5.insertValue(56);
		d5.display();

	}



}


