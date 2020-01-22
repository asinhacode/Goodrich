package chapter2;

public class ClientSide 
{

	public static void main(String[] args) 
	{
		Base Sinha = new Base("Anup", 1000, 1000);
		
		Sinha.takeCredit(1002);
		
		Sinha.clientInfo();
		
		StudentCard Fraud = new StudentCard("John", 1001, 2000);
		Fraud.deposit(33);
		Fraud.studentCreditTaken(300);;
		Fraud.clientInfo();
		
		Base Dynamic = new StudentCard("Johnny", 1002, 10000);
		Dynamic.clientInfo(); // dynamic dispatch
		
	}

}
