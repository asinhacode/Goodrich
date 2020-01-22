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

public class Details {

	static final int MAX = 10; // constants
	
	public static void main(String[] args) {
		
		//System.out.println("Hello World");
		
		control(0);
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

}
