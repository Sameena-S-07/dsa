package addon;

public class mainprg6 {


		int arr[]=new int[5];
		int rear;
		int front;
	public mainprg6() {
		rear=-1;
		front=-1;
	}
	public void enqueue(int val) {
		if(rear<=4) {
			arr[++rear]=val;
		}
		else
		{
			System.out.println("Oops... Queue is Full!");
		}	
	}
	public void dequeue() {
		if(front==4) {
			System.out.println("Queue is Empty");
		}
		else
		{
			arr[++front]=0;
		}
	}
	public void display() {
		System.out.println("\nQueue Elements");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		mainprg6 q=new mainprg6();
		q.enqueue(34);
		q.enqueue(10);
		q.enqueue(62);
		q.enqueue(45);
		q.enqueue(2);
		q.display();
		q.dequeue();
		q.dequeue();
		q.display();
	}
	}


