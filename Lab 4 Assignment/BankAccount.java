import java.time.*;
public class BankAccount
{
	private int id = 0;
	protected double balance = 0.00;
	private static double annualInterestRate = 0.00;
	private static double monthlyInterestRate = 0.00;
	private LocalDate dateCreated;
	protected String result = "";
	BankAccount(int aID, double aBalance)
	{
		id = aID;
		balance = aBalance;
		dateCreated = LocalDate.now();
	}
	public int getID()
	{
		return id;
	}
	public void setID(int id)
	{
		this.id = id;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getInterestRate()
	{
		return annualInterestRate;
	}
	public void setInterestRate(double rate)
	{
		annualInterestRate = rate;
	}
	public LocalDate getDateCreated()
	{
		return dateCreated;
	}
	public double getMonthlyInterestRate()
	{
		double monthlyInterestRate = (annualInterestRate/12);
		return monthlyInterestRate;
	}
	public void withdraw(double wAmount)
	{
		balance = balance - wAmount;
	}
	public void deposit(double dAmount)
	{
		balance = balance + dAmount;
	}
	public String toString()
	{
		result = "ID: " + id + "\n";
		result += "Balance: " + balance + "\n";
		result += "Annual Interest Rate: " + annualInterestRate + "\n";
		result += "Monthly Interest Rate: " + monthlyInterestRate + "\n";
		result += "Date Created: " + dateCreated + "\n";
		return result;
	}
}