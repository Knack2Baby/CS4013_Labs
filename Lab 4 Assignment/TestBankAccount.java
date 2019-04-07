import java.util.*;
public class TestBankAccount
{
	public static void main(String [] args)
	{
		ArrayList<BankAccount> account = new ArrayList<BankAccount>();
		BankAccount bank = new BankAccount(17234522, 100);
		SavingsAccount saving = new SavingsAccount(17234522, 500.50);
		CurrentAccount current = new CurrentAccount(17234522, 200.75, 400);
		account.add(bank);
		account.add(saving);
		account.add(current);
		account.get(0).setInterestRate(0.75);
		String firstProduct = account.get(0).toString();
		String secondProduct = account.get(1).toString();
		String thirdProduct = account.get(2).toString();
		System.out.println(firstProduct);
		System.out.println(secondProduct);
		System.out.println(thirdProduct);
		account.get(0).deposit(200);
		account.get(1).deposit(200);
		account.get(2).deposit(200);
		String fourthProduct = account.get(0).toString();
		String fifthProduct = account.get(1).toString();
		String sixthProduct = account.get(2).toString();
		System.out.println(fourthProduct);
		System.out.println(fifthProduct);
		System.out.println(sixthProduct);
		account.get(0).withdraw(100);
		account.get(1).withdraw(100);
		account.get(2).withdraw(100);
		String seventhProduct = account.get(0).toString();
		String eigthProduct = account.get(1).toString();
		String ninthProduct = account.get(2).toString();
		System.out.println(seventhProduct);
		System.out.println(eigthProduct);
		System.out.println(ninthProduct);
	}
}