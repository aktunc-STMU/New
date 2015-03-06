
public class TestAccount {
	public static void main(String[] args)
	{
		Account one = new Account(1122, 20000, 4.5);
		one.withdraw(2500);
		one.deposit(3000);
		System.out.println("The balance of the account is $" +one.getBalance());
		System.out.println("The monthly interest rate is " +one.getMonthlyInterestRate()+ "%");
		System.out.println("The account was created " +one.getDateCreated());
	}

}
