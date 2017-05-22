package org.shkim.queue.list;

public class Node
{
	protected int	data;
	protected Node	link;

	/* Constructor */
	public Node(int d, Node n)
	{
		this.data = d;
		this.link = n;
	}

	/* Function */
	/* set link (next node) */
	public void set_link(Node n)
	{
		link = n;
	}

	/* set_data (current Node) */
	public void set_data(int d)
	{
		data = d;
	}

	/* get link (next node) */
	public Node get_link()
	{
		return link;
	}

	/* get data(current Node) */
	public int get_data()
	{
		return data;
	}
}
