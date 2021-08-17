package com.moreclasses;
class BalanceRelatedException extends Exception
{
	public BalanceRelatedException(String msg)
	{
		super(msg);
	}
}
public class Account 
{
	int account_no;
	String account_type;
	private Double balance = 0.0;
	
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	
	
	public void deposit(double amount)
	{
		balance=balance + amount;
		System.out.println("Total Balance =" + balance);
	}
	public void withdraw(double amount)
	{ 
		try
		{
		if(balance <=amount)
		{
			throw new BalanceRelatedException("Balance is insufficent");
		}

		else
		{
			balance= balance -amount;
			
		}
		}
		catch(BalanceRelatedException b)
		{
			System.err.println(b.getMessage());
		}
	}
	public void fundTransefer(double amount)
	{
		System.out.println("Fund Transefer =" + amount);
		balance =balance - amount;	
		
	}
	public void payBill(double amount)
	{
		System.out.println("Pay Bill =" + amount);
		balance =balance - amount;	
	}
	public Double GetBalance() 
	{
		return balance;
	}
	
		public static void main(String[] args)
		{
			Account per = new Account();
			per.setAccount_no(12345678);
			System.out.println("Account no -" +per.getAccount_no());
			per.setAccount_type("Saving");
			System.out.println("Account Type -" +per.getAccount_type());
			per.deposit(1500.00);
			
			per.fundTransefer(100.0);
			per.payBill(200.00);
			per.withdraw(1100.00);
			System.out.println("Remaining Balance=" +per.GetBalance());
		}

}
