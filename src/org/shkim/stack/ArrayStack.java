package org.shkim.stack;

/**
 * create stack use array. if you create this stack init size value this stack
 * not controll size value.
 * 
 * @author parad
 *
 */
public class ArrayStack
{
	private int			top;
	private int			max_size;
	private Object[]	stack_array;

	public ArrayStack(int max_size)
	{
		this.max_size = max_size;
		this.stack_array = new Object[max_size];
		this.top = -1;
	}

	public boolean isEmpty()
	{
		return (top == -1);
	}

	public boolean isFull()
	{
		return (top == max_size - 1);
	}

	public void push(Object item)
	{
		if (isFull())
			throw new ArrayIndexOutOfBoundsException((top + 1) + ">=" + max_size);
		stack_array[++top] = item;
	}

	public Object peek()
	{
		if (isEmpty())
			throw new ArrayIndexOutOfBoundsException(top);
		return stack_array[top];
	}

	public Object pop()
	{
		Object item = peek();
		top--;
		return item;
	}

}
