package org.shkim.queue.list;

import java.util.NoSuchElementException;

public class LinkedQueue
{
	protected Node	front, rear;
	public int		size;

	/* Constructor */
	public LinkedQueue()
	{
		front = null;
		rear = null;
		size = 0;
	}
	
	/* function */
	
	/* is empty */
	public boolean is_empty(){
		return (front == null);
	}
	
	/* get size */
	public int get_size(){
		return size;
	}
	
	public void insert(int data){
		Node n = new Node(data, null);
		if (rear == null)
		{
			front = n;
			rear = n;
		}else{
			rear.set_link(n);
			rear = rear.get_link();
		}
		size++;
	}
	
	/* remove front */
	public int remove(){
		if(is_empty()){
			throw new NoSuchElementException("Underflow Exception");
		}
		Node n = front;
		front = n.get_link();
		if (front == null)
		{
			rear = null;
		}
		size--;
		return n.get_data();
	}
	
	/* check front */
	public int peek(){
		if(is_empty()){
			throw new NoSuchElementException("Underflow Exception");
		}
		return front.get_data();
	}
	
	/* display statue */
	public void display(){
		System.out.print("\nQueue = ");
		if (size == 0){
			System.out.print("Empty\n");
			return;
		}
		Node n = front;
		while(n != rear.get_link()){
			System.out.print(n.get_data()+" ");
			n = n.get_link();
		}
		System.out.println();
	}
}
