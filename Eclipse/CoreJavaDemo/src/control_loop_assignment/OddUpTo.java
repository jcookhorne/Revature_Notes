package control_loop_assignment;

import java.util.Scanner;

public class OddUpTo {
	public static int oddUpTo(int num1) {
		int i;
		for ( i = 1; i<=num1; i = i+2) {
			System.out.println(i);
		}
		return i;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number you want to count up to using only odd numbers");
		int num1 = sc.nextInt();
		sc.close();
		
		
		oddUpTo(num1);
	}

}
