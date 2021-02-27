package com.mycode.datastructure;

public class DataStructurMain {
	
	public static void main(String[] args) {
		processQueue();
	}
	
	
	
	public static void processQueue() {
		Queue queue = new Queue();
		queue.enQueue(12);
		queue.enQueue(5);
		queue.enQueue(9);
		queue.enQueue(1);
		queue.enQueue(2);
		
		System.out.println(queue);
		
		queue.enQueue(7);
		queue.enQueue(32);
		
		System.out.println("removed element:"+queue.deQueue());
		System.out.println("removed element:"+queue.deQueue());
		System.out.println("removed element:"+queue.deQueue());
		System.out.println("removed element:"+queue.deQueue());
		System.out.println("removed element:"+queue.deQueue());
		System.out.println("removed element:"+queue.deQueue());
		System.out.println(queue);
	}
	
	public static void processStack() {
		Stack stack =  new Stack();
		stack.push(2);
		stack.push(4);
		stack.push(8);
		stack.push(11);
		stack.push(45);
		System.out.println(stack);
		System.out.println("peek: "+stack.peek());
		System.out.println("pop: "+stack.pop());
		System.out.println("peek: "+stack.peek());
		System.out.println(stack.isFull());
		System.out.println(stack.isEmpty());
		System.out.println(stack);
	}
}
