package org.shkim.queue.priority;

public class PriorityQueue
{
	private int		max_size;
	private long[]	queue_array;
	private int		count;

	public PriorityQueue(int max_size)
	{
		this.max_size = max_size;
		this.queue_array = new long[this.max_size];
		this.count = 0;
	}

	public boolean is_empty()
	{
		return (count == 0);
	}
	
	public boolean is_full(){
		return (count == max_size);
	}
	
	// queue sorted big -> small
	// search item small pass
	public void insert(long item){
		if(is_full()){
			throw new ArrayIndexOutOfBoundsException();
		}
		if (is_empty()){
			queue_array[count++] = item;
		}else{
			int i = 0;
			for (i = count-1; i >= 0; i--)
			{
				if (item > queue_array[i])
				{
					queue_array[i+1] = queue_array[i];
				}else{
					break;
				}
			}
			
			queue_array[i+1] = item;
			count++;
		}
	}
	
	public Object peek(){
		if(is_empty()){
			throw new ArrayIndexOutOfBoundsException();
		}
		return queue_array[count-1];
	}
	
	public Object remove(){
		Object item = peek();
		count--;
		return item;
	}
}
