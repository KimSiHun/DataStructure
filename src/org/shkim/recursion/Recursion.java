package org.shkim.recursion;

public class Recursion
{

	// factorial recursion
	public static long recur_fac(int N)
	{
		if (N == 1)
		{
			return 1;
		} else
		{
			return N * recur_fac(N - 1);
		}
	}

	// iterate
	public static long iter_fac(int N)
	{
		if (N == 0)
		{
			return 0;
		} else
		{
			long t = 1L;
			for (int i = 1; i <= N; i++)
			{
				t *= i;
			}
			return t;
		}
	}

	// recursion fib(45) 5sec
	public static int recur_fib(int N)
	{
		if (N == 0)
		{
			return 0;
		} else if (N == 1)
		{
			return 1;
		}
		return (recur_fib(N - 1) + recur_fib(N - 2));
	}

	// iterate fib(45) 0 sec
	public static int iter_fib(int N)
	{

		if (N == 1)
		{
			return 1;
		} else if (N == 2)
		{
			return 1;
		}

		int  t = 1, b = 1;
		int temp = 1;
		for (int i = 2; i < N; i++)
		{
			if (i == 2)
			{
				temp = 1 + b;
			} else
			{
				t = temp;
				temp = temp + b;
				b = t;
			}
		}
		return temp;
	}

	private static long timeDiffSec(long s)
	{
		long e = System.currentTimeMillis();
		return (e - s);
	}

	// Test
	public static void main(String[] args)
	{
		long s = System.currentTimeMillis();

		System.out.println(iter_fib(45));

		System.out.println(timeDiffSec(s) / 1000 + "sec");
	}
}
