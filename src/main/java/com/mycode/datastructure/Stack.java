package com.mycode.datastructure;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Stack {
		private int[] container;
		private int top=-1;
		public Stack() {
			this(5);
		}
		
		public Stack(int size) {
			this.container = new int[size];
		}
		
		public int peek() {
			return container[top];
		}
		
		public int push(int element) {
			if(isFull()) {
				System.out.println("Stack is Full...");
			}else {
				top++;
				container[top]= element;
				
			}
			return element;
		}
		
		
		public int pop() {
			int val = container[top];
			top--;
			return val;
		}
		
		
		public boolean isFull() {
			return !(top < container.length-1);
		}
		
		public boolean isEmpty() {
			return top ==-1;
		}

		@Override
		public String toString() {
			if(top==-1)return "[]";
			else
			return Arrays.stream(container).limit(top+1).mapToObj(e -> e+"").collect(Collectors.joining(",","[","]"));
		}
		
}
