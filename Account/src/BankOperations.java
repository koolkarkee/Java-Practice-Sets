
public class BankOperations {

	public static Account createAccount(int id, double balance){
		//create an account
		Account a = new Account(id, balance);  
		System.out.println("A new account has been created with the balance of $" + balance);  
		return a;
	}
	
	public static void setAnnualInterestRate(double annualInterestRate, Account a){
		//set annual interest
		a.setAnnualInterestRate(annualInterestRate);
		System.out.println("An annual interest of " + annualInterestRate + " has been set .. ");  
	}
	
	public static void withdraw(double amount, Account a){
		//withdraw
		a.withdraw(amount);
		System.out.println("An amount of " + amount + " has been withdrawn .. ");  
	}
	
	public static void deposit(double amount, Account a){
		//deposit 
		a.deposit(amount);
		System.out.println("An amount of " + amount + " has been deposited .. ");  
	}
	
	public static void showAccountDetails(Account a){
		System.out.println();
		System.out.println("---------- Account Details -----------");  
		System.out.println("---------------------"); 
		
		//print out balance 
	    System.out.println("Total Balance is : \t\t" + a.getBalance());  
	    
	    //print monthly interest rate
	    System.out.println("Monthly Interest Rate is : \t" + a.getMonthlyInterestRate());  
	    
	    //print monthly interest rate
	    double monthlyInterest = (a.getMonthlyInterestRate() * a.getBalance())/100;
	    System.out.println("Monthly Interest is : \t\t" + "$" + monthlyInterest);  

	    //print account creation date
	    System.out.println("Account was created at : \t" + a.getDateCreated());  
	    System.out.println("------------------------------------------"); 
	}
	
	public static void main(String[] args) {
		//create an account with id of 1112, a balance of $20,000 
		Account a = createAccount(1112, 20000);
		
		//set annualInterestRate of 4.5%
		setAnnualInterestRate(4.5, a); 
		
		//withdraw 2500 
		withdraw(2500, a); 
		
		//deposit 3000 
		deposit(3000, a); 
		
		//show bank account details 
		showAccountDetails(a); 
		
		//print out balance 
	    //System.out.println("Total balance is : " + a.getBalance());  
	    
	    //print monthly interest
	    //System.out.println("Total Monthly Interest is : " + a.getMonthlyInterestRate());  

	    //print account creation date
	    //System.out.println("Account was created at : " + a.getDateCreated());  

	}

}
