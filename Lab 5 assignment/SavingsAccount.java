public class SavingsAccount extends BankAccount
{
	SavingsAccount(int id, double balance)
	{
		super(id, balance);
	}
	public void withdraw(double wAmount)
	{
		if(wAmount < balance)
		{
			balance = balance - wAmount;
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