package test.sample;

public class Queueoperations {
	
	/**
	 * size   -- number of elements in array
	 * front  -- initialized to -1
	 * rear   -- initialized to -1
	 * values -- array 
	 */
	int size;
	int front = -1, rear = -1;
	int queuearr[];
	
	/**
	 * Constructor with 2 parameters -- elements and size
	 * @param elements is an array of int data type
	 * @param size     is number of elements stored in array
	 */
	Queueoperations(int size){
		queuearr = new int[size];
		this.size = size;
	}
	
	/**
	 * This method checks whether the array is empty or not
	 * @return true if the array is empty (i.e) rear is equal to -1 or front is greater than rear otherwise false.
	 */
	boolean queueUnderflow() {
		if(rear == -1 || front>rear) {
			return true;
		}
		return false;
	}
	
	/**
	 * This method checks whether the queue(array) is full or not
	 * @return true if the rear is equal to number of elements in the array - 1 otherwise false. 
	 */
	boolean queueOverflow() {
		if(rear == size-1) {
			return true;
		}
		return false;
	}
	
	/**
	 * This method will add elements in the array
	 * If array is full then it displays queue is full
	 * Otherwise it add elements to the array
	 * @param addElement is add the element in queue
	 */
	public void queueEnqueue(int addElement) {
		if(queueOverflow()) {
			System.out.println("QUEUE IS FULL");
		}
		else {
			if(front == -1) {
				front = 0;
			}
			queuearr[++rear] = addElement;
		}
	}
	
	/**
	 * This method remove a first element from the array
	 * If the array is empty then it displays "queue is empty"
	 * Otherwise It remove an element from the array
	 */
	public void queueDequeue() {
		if(queueUnderflow()) {
			System.out.println("QUEUE IS EMPTY");
		}
		else {
			int removeElement = queuearr[front++];
			System.out.println(removeElement + " is popped from queue");
		}
	}
		
	/**
	 * This method will display all the element in the array
	 * If the array is empty then it displays queue is empty
	 * Otherwise it displays the elements in the array
	 */
	public void queueDisplay() {
		if(queueUnderflow()) {
			System.out.println("QUEUE IS EMPTY");
		}
		else {
			System.out.println("The elements are ");
			for(int i=front; i<=rear; i++) {
				System.out.println(queuearr[i]);
			}
		}
	}
	
	/**
	 * This method returns the first element from the array
	 * @return first element from the array
	 */
	public void peek() {
		System.out.println("The front element in the queue is"+queuearr[front]);
	}
	
	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String args[]) {
		int size = 5;
		Queueoperations queue = new Queueoperations(size); //Creating an object of Queue operations class
		
		queue.queueEnqueue(56);
		
		queue.queueDisplay();
		
		queue.queueDequeue();
		
		queue.queueDisplay();
		
		queue.queueEnqueue(56);
		queue.queueEnqueue(34);
		queue.queueEnqueue(65);
		queue.queueEnqueue(89);
		
		queue.queueDisplay();
		
		queue.peek();
		
		queue.queueDisplay();
		
		queue.queueEnqueue(23);
		
		
		
		
		
		
	}

}