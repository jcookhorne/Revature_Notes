package control_loop_assignment;

import java.util.Scanner;

public class Factorial {
	public static int factorial(int num1) {
		
		int update = 1;
		for(int i = num1; i > 0; i--) {
			
			update = update *i;
		}
		return update;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number you want the factorial of");
		int num1 = sc.nextInt();
		sc.close();
		
		//output
		System.out.println(factorial(num1));
		

	}

}
