package endtermexam;

public class Checking extends Account{
	
	public Checking(int acctNumber)
	{
		super(acctNumber);
		}
	
	public int getAccountNumber()
	{
		return acctNumber;
		}
	
	public double getBalance()
	{
		return balance;
		}
	
	public String getAccountInfo()
	{
		return("**Checking Account Information"
				+ "\nAcct Num: " + getAccountNumber() 
				+ "\nBalance: " + getBalance());
		}
}