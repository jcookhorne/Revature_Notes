package control_loop_assignment;

import java.util.Scanner;

public class IsPrime {
	
	public static String isItPrime(int num) {
		int i = 2;
			
			if(num == i ) {
				
				return ("The number is prime");
			}
			else if(num%i != 0) {
				
				return ("The number is prime");
			}else {
				return "The number is not prime";	
			}
			
		}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number");
		int num = sc.nextInt();
		sc.close();
		
		System.out.println(isItPrime(num));
		
		

}}
