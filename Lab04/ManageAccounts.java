/**
 * 
 */
package Lab04;

/**
 * @author Amanda X
 *
 */
public class ManageAccounts {
	public static void main (String[] args){
		Account acct1,acct2;
		
		//create account1 for Sally with $1k
		acct1 = new Account(1000, "Sally", 1111);
		
		//create account2 for Joe with $500
		acct2 = new Account(500, "Joe", 1112);
		
		acct2.deposit(100);
		acct2.getBalance();
		acct1.withdraw(50);
		acct1.getBalance();
		acct1.chargeFee();
		
		acct2.chargeFee();
		acct2.changeName("Joseph");
		acct1.toString();
		acct2.toString();
		
		
	}

}
