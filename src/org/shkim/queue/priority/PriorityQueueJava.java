package org.shkim.queue.priority;

import java.util.PriorityQueue;

public class PriorityQueueJava
{
	private static PriorityQueue<Prisoner> getPrisoners()
	{
		Prisoner prisoner1 = new Prisoner(4, "shkim");
		Prisoner prisoner2 = new Prisoner(14, "dev");
		Prisoner prisoner3 = new Prisoner(24, "opera");
		Prisoner prisoner4 = new Prisoner(34, "mime");
		Prisoner prisoner5 = new Prisoner(44, "tawea");
		Prisoner prisoner6 = new Prisoner(54, "ordw");
		Prisoner prisoner7 = new Prisoner(64, "tales");

		PriorityQueue<Prisoner> pQueue = new PriorityQueue<Prisoner>();

		pQueue.add(prisoner1);
		pQueue.add(prisoner2);
		pQueue.add(prisoner3);
		pQueue.add(prisoner4);
		pQueue.add(prisoner5);
		pQueue.add(prisoner6);
		pQueue.add(prisoner7);

		return pQueue;

	}

	public static void main(String[] args)
	{
		PriorityQueue<Prisoner> pQueue = getPrisoners();

		while (!pQueue.isEmpty())
		{
			Prisoner p = pQueue.poll();
			System.out.println(p.year + " " + p.name);
		}
	}
}
