package org.shkim.stack;

public class ListStack<T>
{
	private class Node
	{

		private Object	data;
		private Node	next_node;

		Node(Object data)
		{
			this.data = data;
			this.next_node = null;
		}
	}

	private Node top;

	public ListStack()
	{
		this.top = null;
	}

	public boolean isEmpty()
	{
		return (top == null);
	}

	public void push(Object item)
	{
		Node new_node = new Node(item);
		new_node.next_node = top;
		top = new_node;
	}

	public Object peek()
	{
		if (isEmpty())
			throw new ArrayIndexOutOfBoundsException();
		return top.data;
	}

	public Object pop()
	{
		Object item = peek();
		top = top.next_node;
		return item;
	}

	public static void main(String[] args)
	{
		ListStack<Integer> a = new ListStack<>();
		a.push("a");
		System.out.println(a.pop());
	}
}
