package util;

public class Stack {
	private int count = 0;
	
	public void push(Object obj) {
		original(obj);
		count++;
		System.out.println("pushing the object");
	}
	
	public Object pop() {
		if(count > 0) {
			count--;
			return original(); // calling the overriden method
		}
		else{
			System.out.println("no more objects to pop");
			System.out.println("no more objects to pop");
			return null;
		}
	}
}
