import java.time.*;
public class Transaction
{
	private LocalDateTime date;
	private char type = '\0';
	private double amount = 0;
	private double balance = 0;
	private String description = "";
	private String detail = "";
	Transaction(char aType,double aAmount,double aBalance,String aDescription)
	{
		type = aType;
		amount = aAmount;
		balance = aBalance;
		description = aDescription;
		date = LocalDateTime.now();
	}
	public String toString()
	{
		detail = "\n" + "Type: " + type + "\n";
		detail += "Amount: " + amount + "\n";
		detail += "Balance: " + balance + "\n";
		detail += "Description: " + description + "\n";
		detail += "Date: " + date + "\n";
		return detail;
	}
}