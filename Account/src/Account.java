import java.util.Date;


public class Account {
	private int id = 0;
	private double balance = 0.0; 
	private double annualInterestRate = 0.0;
	private Date dateCreated;   
	
	//default no argument constructor
	public Account(){
		System.out.println("default constructor called .. ");  
		
		//initialize dateCreated 
		this.dateCreated = new Date();
	}
	
	//constructor with arguments
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		
		//initialize dateCreated 
	    this.dateCreated = new Date();
	}
	
	//accessor methods for id, balance and annualInterestRate
	public int getId(){ return this.id; }
	public double getBalance(){ return this.balance; }
	public double getAnnualInterestRate(){ return this.annualInterestRate; }
	
	//mutator methods for id, balance and annualInterestRate
	public void setId(int id){
		this.id = id; 
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	
	//accessor method for dateCreated 
	public Date getDateCreated(){ return this.dateCreated; }
	
	//methods
	public double getMonthlyInterestRate() { 
		return (this.annualInterestRate)/12;
	}
	
	public void withdraw(double amount){
		if(this.balance > amount){
			this.balance = this.balance - amount;
		}
	}
	
	public void deposit(double amount){
		this.balance = this.balance + amount;
	}
	 
}
