package org.shkim.queue;

/**
 * using array first in - front last in rear rear - queue - front
 * size fixed. when max time do not use this queue
 * @author parad
 *
 */
public class Queue
{
	private Object[]	queue_array;
	private int			max_size;
	private int			rear;
	private int			front;

	public Queue(int max_size)
	{
		this.front = 0;
		this.rear = -1;
		this.max_size = max_size;
		this.queue_array = new Object[max_size];
	}

	// function

	// isEmpty
	public boolean is_empty(){
		return (front == rear+1);
	}
	// isFull
	public boolean is_full(){
		return (rear == max_size-1);
	}
	
	// insert
	public void insert(Object item){
		if(is_full()){
			throw new ArrayIndexOutOfBoundsException();
		}
		queue_array[++rear] = item;
	}
	
	// remove
	public Object remove(){
		Object item = peek();
		front++;
		return item;
	}
	
	// peek
	public Object peek(){
		if(is_empty()){
			throw new ArrayIndexOutOfBoundsException();
		}
		return queue_array[front];
	}
	//
}
