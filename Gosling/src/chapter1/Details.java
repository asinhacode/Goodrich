/*
 * KEYWORDS
 * 
 * 1. package
 * 2. public
 * 3. class
 * 4. static
 * 5. void
 * 
 */
package chapter1;

import java.util.Arrays;

public class Details {

	static final int MAX = 10; // constants
	
	public static void main(String[] args) {
		
		//System.out.println("Hello World");
		
		//control(0);
		
		fibonacci(40);
	}
	
	private static void control(int choice)
	{
		if (choice == 1)
		{
			for(int i = 0; i < MAX; i++)
			{
				System.out.println(i + " Hello World");
			}
		}
		
		else
		{
			for(int i = MAX - 1; i >= 0; i--)
			{
				System.out.println(i + " World Hello");
			}
		}
	}
	
	/**
	 * return fibonacci numbers up till the limit
	 * @param limit
	 */
	public static void fibonacci(int limit)
	{
		int first = 0,
		second = 1;
		
		int[] fib = new int[limit];
		
		fib[0] = 0;
		fib[1] = 1;
	
		
		int temp = 0;
		
		for(int i = 2; i < limit; i++)
		{
			fib[i] = first + second;
			int count = 0;

				
			temp = first;
			first = second;
			second = fib[i];
		}
		
		System.out.println(Arrays.toString(fib));

			
	}

}
