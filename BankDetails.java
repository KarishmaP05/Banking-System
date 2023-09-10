package BANKAssign;
import java.util.Scanner;

public class BankDetails {
	  
	 
	    private String accno;  
	    private String name;  
	    private String acc_type;  
	    private long balance;  
	    Scanner sc = new Scanner(System.in);  
	    //method to open new account  
	    public void openAccount() {  
	        System.out.print("Enter Account No: ");  
	        accno = sc.next();  
	        System.out.print("Enter Account type: ");  
	        acc_type = sc.next();  
	        System.out.print("Enter Name: ");  
	        name = sc.next();  
	        System.out.print("Enter Balance: ");  
	        balance = sc.nextLong();  
	    }  
	    //method to display account details  
	    public void showAccount() {  
	        System.out.println("Name of account holder: " + name);  
	        System.out.println("Account no.: " + accno);  
	        System.out.println("Account type: " + acc_type);  
	        System.out.println("Balance: " + balance);  
	    }  
	    //method to deposit money  
	    public void deposit() {  
	        long amt;  
	        System.out.println("Enter the amount you want to deposit: ");  
	        amt = sc.nextLong();  
	        if (amt<0) {
	        	System.out.println("please enter valid amount");
	        }
	        else {
	        balance = balance + amt;  
	        }
	    }  
	    //method to withdraw money  
	    public void withdrawal() {  
	        long amt;  
	        System.out.println("Enter the amount you want to withdraw: ");  
	        amt = sc.nextLong();  
	        if (amt>=0) {
	        	if (balance >= amt)  {  
	        		System.out.println("Account Type " + acc_type);
		        	if (acc_type.equals("Saving")) {	      
		        		if ((balance - amt)>=1000){
		        			balance = balance - amt;  
		        			System.out.println("Balance after withdrawal: " + balance);  
		        		}
		        		else {
			        		System.out.println("Your account have  insufficient balance for withdraw");  
			        	}
		        	}
		        	else if (acc_type.equals("Current")) {	      
		        		if ((balance - amt)>=5000){
		        			balance = balance - amt;  
		        			System.out.println("Balance after withdrawal: " + balance);  
		        		}
		        		else {
			        		System.out.println("Your account have  insufficient balance  for withdraw");  
			        	}
		        	}
		        	else {
		        		System.out.println("Please Select Correct Account Type");
		        	}
		        	
		        } else {  
		            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
		        }  
	        }
	        else {
	        	 System.out.println("Please enter valid amount" ); 
	        }
	        }  
	    //method to search an account number  
	    public boolean search(String ac_no) {  
	        if (accno.equals(ac_no)) {  
	            showAccount();  
	            return (true);  
	        }  
	        return (false);  
	    }  
	}  
	