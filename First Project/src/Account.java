import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	Date dateCreated;
	public Account()
	{
		id = 0101;
		balance = 100;
		annualInterestRate = .15;
		dateCreated = new Date();
	}
	
	public Account(int id, double balance, double annualInterestRate)
	{
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		dateCreated = new Date();
	}
	
	public double getId()
	{
		return id;
	}
	public double getBalance()
	{
		return balance;
	}
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated()
	{
		return new Date();
	}
	
	public double getMonthlyInterestRate()
	{
		return annualInterestRate/12;
	}
	
	public void withdraw(double balance)
	{
		this.balance -= balance;
	}
	
	public void deposit(double balance)
	{
		this.balance += balance;
	}
}
