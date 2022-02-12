package q3;


class CurrentAccount extends Bank {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
		return creditLimit+totalDeposits;}
}
class SavingsAccount extends Bank {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
		return fixedDepositAmount+totalDeposits;}
}

public class Bank {
	
	public int getCash() {
		
		return 0;
	}
	public static void main(String[] args) {
		

		CurrentAccount current=new CurrentAccount();
		SavingsAccount saving=new SavingsAccount();
		
		System.out.println("current account= "+current.getCash());
		System.out.println("savings account= "+saving.getCash());
		
	}

	

}
