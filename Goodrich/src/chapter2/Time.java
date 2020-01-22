package chapter2;

public class Time 
{

	protected static double TOTAL_HOURS = 16 * 7;
	private double remainingHours;
	
	public Time()
	{
		
	}
	
	public double remainingHours(int currentDay)
	{
		return TOTAL_HOURS - (currentDay * 16);
	}
}
