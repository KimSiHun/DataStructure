package org.shkim.queue.circular;

public class CircularQueue
{
	private int			front;
	private int			rear;
	private int			max_size;
	private Object[]	queue_array;

	public CircularQueue(int max_size)
	{
		this.front = 0;
		this.rear = -1;

		// empty & full issue avoid size +1
		this.max_size = max_size + 1;
		this.queue_array = new Object[this.max_size];
	}

	public boolean is_empty()
	{
		return (front == rear + 1) || (front + (max_size - 1) == rear);
	}

	public boolean is_full()
	{
		return (rear == max_size - 1) || (front + (max_size - 2) == rear);
	}

	public void insert(Object item)
	{
		if (is_full())
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		if (rear == max_size - 1)
		{
			rear = -1;
		}
		queue_array[++rear] = item;
	}

	public Object peek()
	{
		if (is_empty())
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		return queue_array[front];
	}

	public Object remove()
	{
		Object item = peek();
		front++;
		if (front == max_size)
		{
			front = 0;
		}
		return item;
	}
}
