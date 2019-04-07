public class CurrentAccount extends BankAccount
{
	private double limit = 0.00;
	CurrentAccount(int id, double balance, double aLimit)
	{
		super(id, balance);
		limit = aLimit;
	}
	public void withdraw(double wAmount)
	{
		if(wAmount <= balance + limit)
		{
			balance = (balance + limit) - wAmount;
		}
		else
		{
			System.out.println("not enough funds in savings account to perform withdrawl of that size");
		}
	}
	public String toString()
	{
		result = "ID: " + this.getID() + "\n";
		result += "Balance: " + this.getBalance() + "\n";
		result += "Annual Interest Rate: " + this.getInterestRate() + "\n";
		result += "Monthly Interest Rate: " + this.getInterestRate()/12 + "\n";
		result += "Date Created: " + this.getDateCreated() + "\n";
		return result;
	}
}