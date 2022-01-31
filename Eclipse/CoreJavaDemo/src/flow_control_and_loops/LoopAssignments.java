package flow_control_and_loops;

import java.util.Scanner;

public class LoopAssignments {

	public static void main(String[] args) {
		// Please uncomment the program you want to play!!!
		
		
		// print the greater of 2 numbers
		// input
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Please enter the second number");
		int num2 = sc.nextInt();
		
		// output
		greaterOfTwo(num1, num2);
		
		//Print the greatest of 3 numbers
		//greaterOfThree();
		
		// Print if a number is even or odd
		//evenOdd();
		// input
		System.out.println("Please enter number and I will tell you if its odd or even!!");
		int numChoice = sc.nextInt();
		// output
		evenOdd(numChoice);
		//Print odd numbers up to N
		//oddUpTo();
		
		//Print the factorial of a number
		//factorial();
		
		// Print if a number is prime or not
		//isPrime();
		
		//Print the sum of the digits of a number
		//sumOfDigits();
		
		//Print the fibonacci series 
		//fibonacciSeries();
	}
		//fibonacciSeries()
public static int greaterOfTwo(int num1, int num2) {
		
		if(num1>num2) {
			System.out.println("the first number entered is larger : " + num1);
			return num1 ;
			
		}else {
			System.out.println("The second number entered is larger : " + num2);
			return num2;
		}
		
	}
	
public static void greaterOfThree() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Please enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Please enter the third number");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("the first number entered is larger : " + num1);
			
		}else if(num2 > num1 && num2 > num3){
			System.out.println("The second number entered is larger : " + num2);
		}else if (num3 > num1 && num3 > num2) {
			System.out.println("The third number entered is larger : " + num3);
		}
		
	}

public static void evenOdd(int num1) {
		System.out.println("Please enter number and I will tell you if its odd or even!!");
		String output = "";
		if (num1%2 == 0) {
			System.out.println("The number you entered is even" + num1);
		}else if (num1%2 != 0) {
			System.out.println("The number you entered is even" + num1);
		}
		
}
	
public static void oddUpTo() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the max number you would like the odd counter to go to");
	int num1 = sc.nextInt();
	for (int i = 1; i<=num1; i = i+2) {
		System.out.println(i);
	}
	
}

public static void factorial() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the number you want the factorial of");
	int num1 = sc.nextInt();
	int update = 1;
	for(int i = num1; i > 0; i--) {
		
		update = update *i;
	}
	System.out.println(update);
}

public static void isPrime() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the first number");
	String output = "";
	int num = sc.nextInt();
	for(int i = 2; i <=num; i++) {
		if(num%i == 0) {
			output = "The number is prime";
		}else {
			output = "The number is not prime";
			//System.out.println("the number is not prime");
		}
		
	}
	
	System.out.println( output);

	
}

public static void sumOfDigits() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the first number");
	int num1 = sc.nextInt();
	int sum = 0;
		while(num1 != 0) {
			sum = sum +num1%10;
			num1=num1/10;
		}
		System.out.println(sum);

}

public static void fibonacciSeries() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the first number");
	int num1 = sc.nextInt();
	int num2 = 0, num3 = 1, sum = 0;
	for(int i = 1; i <= num1; i++) {
		System.out.println(num2);
		sum = num2 + num3;
		num2 = num3;
		num3 = sum;
	}
}
}


