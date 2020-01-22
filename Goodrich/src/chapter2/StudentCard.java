package chapter2;

public class StudentCard extends Base {

	private final double UPPER_LIMIT = 1000;

	public StudentCard(String n, int num, double amt) {
		super(n, num, amt);
	}

	public void studentCreditTaken(double creditTaken) {

		if ((getCreditTaken() + creditTaken) < UPPER_LIMIT) {
			this.creditTaken += creditTaken;

			System.out.println("APPROVED TRANSACTION");
		}

		else
			System.out.println("OVER LIMIT!");
	}
	
	
	public void clientInfo()
	{
		super.clientInfo();
		System.out.println("How close to limit: " + (UPPER_LIMIT - super.getCreditTaken() ));

	}

}
