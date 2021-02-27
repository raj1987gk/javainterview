package com.mycode.datastructure;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Queue {

	int[] container;
	int rear,front;
	
	public Queue() {
		this(5);
	}

	public Queue(int size) {
		this.container = new int[size];
		this.rear = -1;
		this.front = -1;
	}
	
	public int enQueue(int element) {
		if(isFull()) {
			System.out.println("Queue is full discarding element "+element);
		}else {
			rear++;
			container[rear] = element;
			if(front==-1) front++;
		}
		return element;
	}
	
	public int deQueue() {
		int element =- 1;
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}else {
			element = container[front];
			if(front >= rear) {
				front= -1;
				rear=-1;
			}else {
				front++;
			}
		}
		return element;
	}
	

	public int peek(int element) {
		
		return 0;
	}
	
	public boolean isFull() {
		return rear==container.length-1;
	}
	

	public boolean isEmpty() {
		return rear==-1;
	}
	
	
	
	@Override
	public String toString() {
		if(isEmpty())
			return "[]";
		else {
			return Arrays.stream(container).skip(front).mapToObj(e -> e+"").collect(Collectors.joining(",","[","]"));
		}
	}
	
	
}
