/**
 * 
 */
package Lab04;

/**
 * @author Amanda X
 *
 */
public class Account {
	private double balance;
	private String name;
	private long acctNum;
	
	//Constructor -- initializes balance,owner, and acc number
	public Account (double initBal, String owner, long number){
		balance = initBal;
		name = owner;
		acctNum = number;
	}
	
	//Checks if balance is sufficient for withdrawal
	public void withdraw(double amount){
		if(balance >= amount){
			balance -= amount;
		}
		else{
			System.out.println("Insufficient funds");
		}
		
	}
	
	//Adds deposit amount to balance
	public void deposit(double amount){
		balance += amount;
	}
	
	//returns balance
	public double getBalance(){
		System.out.println(name + ": " + balance);
		return balance;
	}
	
	//returns string containing name, acc num, balance
	public String toString(){
		String info = name + " " + acctNum + " " + balance;
		System.out.println(info);
		return info;
	}
	
	//deducts $10 service fees
	public void chargeFee(){
		balance -= 10;
		System.out.println("The balance for " + name + " is now: " + balance);
	}
	
	//Changes name on acc
	public void changeName(String newName){
		name = newName;
	}
}
