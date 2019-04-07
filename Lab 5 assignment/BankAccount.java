import java.time.*;
import java.util.*;
public class BankAccount
{
	private String name = "";
	private int id = 0;
	protected double balance = 0.00;
	private static double annualInterestRate = 0.00;
	private static double monthlyInterestRate = 0.00;
	private LocalDateTime dateCreated;
	protected String result = "";
	protected ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	BankAccount(int aID, double aBalance)
	{
		id = aID;
		balance = aBalance;
		dateCreated = LocalDateTime.now();
	}
	BankAccount(String aName, int aID, double aBalance)
	{
		name = aName;
		id = aID;
		balance = aBalance;
		dateCreated = LocalDateTime.now();
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
	public LocalDateTime getDateCreated()
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
		Transaction withdraw = new Transaction('W', wAmount, balance, "withdraw");
		transactions.add(withdraw);
	}
	public void deposit(double dAmount)
	{
		balance = balance + dAmount;
		Transaction deposit = new Transaction('D', dAmount, balance, "deposit");
		transactions.add(deposit);
	}
	public String toString()
	{
		result = "ID: " + id + "\n";
		result += "Balance: " + balance + "\n";
		result += "Annual Interest Rate: " + annualInterestRate + "\n";
		result += "Monthly Interest Rate: " + monthlyInterestRate + "\n";
		result += "Date Created: " + dateCreated + "\n";
		result += "Name: " + name + "\n";
		for(int i = 0; i < transactions.size(); i++)
		{
			result += transactions.get(i).toString();
		}
		return result;
	}
}