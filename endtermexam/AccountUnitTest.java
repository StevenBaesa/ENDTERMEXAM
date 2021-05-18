package endtermexam;

public class AccountUnitTest{
	
	public static void main(String[] args)
	{
		Account[] accountArray = new Account[10];
		
		accountArray[0] = new Checking(7);
		accountArray[1] = new Checking(10);
		accountArray[2] = new Checking(12);
		accountArray[3] = new Checking(14);
		accountArray[4] = new Checking(18);
		accountArray[5] = new Savings(1934, 0.5);
		accountArray[6] = new Savings(1283, 1);
		accountArray[7] = new Savings(1721, 1.3);
		accountArray[8] = new Savings(1876, 1.8);
		accountArray[9] = new Savings(1978, 2);

		
		for(int i = 0; i < accountArray.length; ++i)
			System.out.println(accountArray[i].getAccountInfo() + "\n");
		}
}