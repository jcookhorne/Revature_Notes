package classes_and_objects;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initializing variables
		Scanner sc = new Scanner(System.in);
		double currentBalance = 500.00;

		
		
		BankAtm bc;
		bc = new BankAtm();
		bc.balance = currentBalance;
		//bc.response = "yes";
		// letting user know they need an account to set up creating one
		
		System.out.println("Please Create your account first");
		
		// getting a user name from user and storing it
		System.out.println("What is your username");
		bc.username = sc.nextLine();
		
		// getting a  password from user and storing it
		System.out.println("What is your password");
		bc.password = sc.nextLine();
		
		
		
		//updating user and createAccount method
		System.out.println("Account Created!!");
		System.out.println(bc.CreateAccount(bc.username, bc.password));
		
		
		//while(bc.response == "yes") {
		// aski8ng if user wants to check the balance
			
		System.out.println("would you like to view your balance. (yes or no)");
		bc.response = sc.nextLine();
		System.out.println(bc.BalanceChoice(bc.response));
		
		
		
		// asking if the user would like to withdraw
		System.out.println("would you like to withdraw any money. (yes or no)");
		bc.response = sc.nextLine();
		System.out.println(bc.WithdrawChoice(bc.response));
		
		//}
		
		sc.close();
	}

}
