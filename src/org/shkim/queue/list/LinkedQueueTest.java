package org.shkim.queue.list;

import java.util.Scanner;

public class LinkedQueueTest
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		LinkedQueue q = new LinkedQueue();
		System.out.println("Linked Queue Test\n");
		char ch = 0;
		do
		{
			System.out.println("\nQueue Operations");
			System.out.println("1. insert");
			System.out.println("2. remove");
			System.out.println("3. peek");
			System.out.println("4. check empty");
			System.out.println("5. size");
			int choice = scan.nextInt();
			switch (choice)
			{
				case 1:
					System.out.println("Enter integer element to insert");
					q.insert(scan.nextInt());
					break;
				case 2:
					try
					{
						System.out.println("Remove Element = " + q.remove());
					} catch (Exception e)
					{
						System.out.println("ERROR! " + e.getMessage());
					}
					break;
				case 3:
					try
					{
						System.out.println("Peek element = " + q.peek());
					} catch (Exception e)
					{
						System.out.println("ERROR! " + e.getMessage());
					}
					break;
				case 4:
					System.out.println("Empty status = "+ q.is_empty());
					break;
				case 5:
					System.out.println("Size = " + q.get_size());
					break;
				default:
					System.out.println("Wrong Entry \n");
					break;
			}
			q.display();
			
			System.out.println("\nDo you Want to Continue (Type y or n) \n");
			ch = scan.next().charAt(0);
		}while (ch == 'Y' || ch == 'y');
		
		scan.close();
	}
}
