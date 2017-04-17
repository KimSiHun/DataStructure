package org.shkim.recursion;

public class Recursion
{
	static int tester = 0;

	// factorial recursion
	public static long factorial(int N)
	{
		if (N == 1)
		{
			return 1;
		} else
		{
			return N * factorial(N - 1);
		}
	}

	// recursion
	public static int fib(int N)
	{
		if (N == 0)
		{
			return 0;
		} else if (N == 1)
		{
			return 1;
		}
		return (fib(N - 1) + fib(N - 2));
	}

	// iterate
	public static long fac(int N)
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

	private static long timeDiffSec(long s, long e)
	{
		return (e - s);
	}

	// Test
	public static void main(String[] args)
	{
		long s = System.currentTimeMillis();

		System.out.println(fac(20));
		
		long e = System.currentTimeMillis();

		System.out.println(timeDiffSec(s, e) / 1000 + "sec");
	}
}
