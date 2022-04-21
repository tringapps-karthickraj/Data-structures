package test.sample;
import java.util.Scanner;

public class LinkedlistOperations {
	Scanner input = new Scanner(System.in);
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}
	public Node head = null;
	public Node tail = null;
	
	public void createlist() {
		Node temp = head;
		int choice = 1;
		int insertdata;
		while(choice == 1) {
			System.out.println("ENTER A VALUE TO INSERT IN ");
			insertdata = input.nextInt();
			Node newNode = new Node(insertdata);
			newNode.data = insertdata;
			newNode.next = null;
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			System.out.println("press 1 to continue and 2 to exit ");
			choice = input.nextInt();
		}
		
		System.out.println("the element created in the linked list  ");
		temp = head;
		while(temp != null) {
			System.out.println(temp.data + "\t");
			temp = temp.next;
		}
	}
	/**
	 * 
	 * this method used to add the data at first in the linked list
	 * @param is the data to add at the beginning*/
	public void addAtBegin(int data)  
	{
		Node newNode = new Node(data);
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}
	/**
	 * 
	 * this method used to add the data in the specified index 
	 * @param index is refer as the specified index
	 * @param data is what the data added in the index*/
	public void addnode(int index, int data) {
		Node newNode = new Node(data);
		Node temp = head;
		for(int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		newNode.data = data;
		newNode.next = temp.next;
		temp.next = newNode;
	}
	/**
	 * 
	 * this method used to add the data at end in the linked list
	 * @param is the data to add at the end*/
	public void addAtEnd(int data) {
		Node newNode = new Node(data);
		newNode.data = data;
		newNode.next = null;
		tail.next = newNode;
		tail = newNode;
	}
	
	/**
	 * 
	 * this method used to delete the data at the beginning in the linked list
	 * */
	public void deleteAtBeginning() {
		Node temp = head;
		if(temp == null) {
			System.out.println("EMPTY LIST");
		}
		else {
			head = head.next;
			temp.next = null;
		}

	}
	/**
	 * 
	 * this method used to delete specify the data  in the linked list
	 * */
	public void deletenode(int deleteIndex) {
		Node current = head;
		if(head == null) {
			System.out.println("EMPTY LIST");
		}
		else {

			for(int i = 0; i < deleteIndex - 1 ;i++) {
				current = current.next;
			}
			current.next = current.next.next;

		}
		
	}
	/**
	 * 
	 * this method used to delete the data at the end in the linked list
	 * */
	public void deleteAtEnd()
	{
		Node temp = head;
		if(temp == null) {
			System.out.println("EMPTY LIST");
		}
		else {
			while(temp.next != tail) {
				temp = temp.next;
			}
			temp.next = null;
			tail = temp;
		}

	}
	/**
	 * 
	 * this method used to display the data  in the linked list
	 * */
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("EMPTY LIST");
		}
		else {
			System.out.println("THE ELEMENTS IN THE LIST ARE ");
			while(current != null) {
				System.out.println(current.data);
				current = current.next;
			}
		}

	}
	
	public static void main(String args[]) {
		LinkedlistOperations linkedlist = new LinkedlistOperations();
		linkedlist.createlist();
		
		
		
		linkedlist.addAtBegin(34);
		
		linkedlist.display();
		
		linkedlist.addnode(1, 9);
		
		linkedlist.display();
		
		linkedlist.deleteAtBeginning();
		
		linkedlist.display();
		
		linkedlist.deleteAtEnd();
		
		linkedlist.display();
		
		linkedlist.deletenode(2);
		
		linkedlist.display();
		
		
		
		
		}

		
	
}
