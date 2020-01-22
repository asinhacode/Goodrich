package chapter2;

public class Base 
{

	// instance variables
	private String clientName;
	private int cardNumber;
	private double amountInBank;
	protected double creditTaken;
	
	// constructor
	// all start with 0.0 credit
	public Base()
	{
		
	}
	
	public Base(String n, int num, double amt)
	{
		this.clientName = n;
		this.cardNumber = num;
		this.amountInBank = amt;
		
	}

	// Accesors and mutators
	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public double getAmountInBack() {
		return amountInBank;
	}

	public void setAmountInBack(double amountInBack) {
		this.amountInBank = amountInBack;
	}

	public double getCreditTaken() {
		return creditTaken;
	}

	public void setCreditTaken(double creditTaken) {
		this.creditTaken = creditTaken;
	}
	
	// methods to work accordingly
	public void deposit(double d)
	{
		this.amountInBank += d;
	}
	
	public void withdraw(double d)
	{
		this.amountInBank -= d;

	}
	
	public void takeCredit(double d)
	{
		this.creditTaken += d;
		message();
	}
	
	public void creditPaid(double d)
	{
		this.creditTaken -= d;

	}
	
	public double getRealMoney()
	{
		return this.amountInBank - this.creditTaken;
	}
	
	// danger 
	private String message()
	{
		if(this.creditTaken > this.amountInBank)
			return "- IN DANGER!- ";
		
		else
			return "-GOOD CONDITION-";
			
	}
	
	// all info
	public void clientInfo()
	{
		System.out.println("##############");
		System.out.println();
		System.out.println("STATUS: " + message());
		System.out.println("Name : " + this.clientName + "\n" + "Card #" + this.cardNumber + "\n" + "In Bank :" + this.amountInBank + "\n" + "In Credit: " + + this.creditTaken);
		System.out.println("Real Money: " + this.getRealMoney());
		System.out.println();

	}
	
	
}
