package org.shkim.queue.priority;

public class Prisoner implements Comparable<Prisoner>
{
	int		year;
	String	name;

	public Prisoner(int year, String name)
	{
		super();
		this.year = year;
		this.name = name;
	}

	@Override
	public int compareTo(Prisoner o)
	{
		if (this.year > o.year)
		{
			return 1;
		} else if (this.year < o.year)
		{
			return -1;
		}
		return 0;
	}
}
