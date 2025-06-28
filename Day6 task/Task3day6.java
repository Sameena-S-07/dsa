package addon;

public class Task3day6 {


		    int arr[] = new int[5];
		    int rear;

		    public Task3day6() {
		        rear = 0; 
		        }

		    public void enqueue(int val) {
		        if (rear < arr.length) {
		            arr[rear++] = val;
		        } else {
		            System.out.println("Oops... Queue is Full!");
		        }
		    }

		    public void dequeue() {
		        if (rear == 0) {
		            System.out.println("Queue is Empty");
		        } else {
		            for (int i = 0; i < rear - 1; i++) {
		                arr[i] = arr[i + 1]; 
		            }
		            arr[--rear] = 0;  
		        }
		    }

		    public void display() {
		        System.out.println("Queue Elements:");
		        for (int i = 0; i < arr.length; i++) {
		            System.out.print(arr[i] + " ");
		        }
		    }
		    public static void main(String[] args) {
		    	Task3day6 a = new Task3day6();
		        a.enqueue(34);
		        a.enqueue(10);
		        a.enqueue(62);
		        a.enqueue(45);
		        a.enqueue(2);
		        System.out.println("After enqueue operation");
		        a.display();
		        a.dequeue();
		        a.dequeue();
		        System.out.println("\nAfter dequeue operation");
		        a.display();
		    }
		}




