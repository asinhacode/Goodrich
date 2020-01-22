package chapter1;

import java.util.Arrays;

public class Introduction {

	public static void main(String[] args)
	{
		int first[] = new int[10];
		int second[] = new int[10];
		int seed = 10;
		
		for(int i = 0; i < 10; i++)
		{
			first[i] = (int)(Math.random() * seed);
			second[i] = (int)(Math.random() * seed);
		}
		
		System.out.println(Arrays.toString(first));
		System.out.println();
		System.out.println(Arrays.toString(second));
		System.out.println();
		System.out.println(Arrays.toString(add(first, second)));
		System.out.println();
		System.out.println(Arrays.toString(diff(first, second)));

		
	}
	
	public static int[] add(int[] first, int[] second)
	{
		int[] sum = new int[first.length];
		
		for(int i = 0; i < first.length; i++)
		{
			sum[i] = first[i] + second[i];
		}
		
		return sum;
		
	}
	
	public static int[] diff(int[] first, int[] second)
	{
		int[] diff = new int[first.length];
		
		for(int i = 0; i < first.length; i++)
		{
			diff[i] = first[i] - second[i];
		}
		
		return diff;
		
	}

}
