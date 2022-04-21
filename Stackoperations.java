package test.sample;
import java.util.*;

public class Stackoperations {
	int[] stackarr;
	int top;
	int lenofstack;
	Stackoperations(int size){
		stackarr = new int[size];
		lenofstack = size;
		top = -1;
	}
	public static void main(String args[]) {
		Stackoperations stack  = new Stackoperations(10);
		stack.push(2323);
		for(int i = 0;i<stack.stackarr.length;i++) {
			System.out.println(stack.stackarr[i]);
		}
		stack.pop();
		stack.pop();
		
		

	}
	public void push(int ins) {
		if(isStackFull()) {
			System.out.println("stack is full");
			System.exit(-1);
		}
		stackarr[++top] = ins;
	}
	int pop() {
		if(isStackEmpty()) {
			System.out.println("stack is empty");
			System.exit(-1);
			 
		}
		return stackarr[top--];
	}
	public boolean isStackFull(){
		return top == lenofstack -1;
	}
	public boolean isStackEmpty(){
		return top ==  -1;
	}
}
