package arrayassignments;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfInput {

	public static int arrayReturn(int sum) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		System.out.println("Please enter the numbers you want to be added together.");
		for( int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		//System.out.println(Arrays.toString(arr));
		sc.close();
		return sum;
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		//Find the sum of n numbers taken as input from user
		// so since the input it locked to the process i will just be outputting in main.
		System.out.println("Please enter the numbe;r of elements you want in the array");
		System.out.println(arrayReturn(sum));
		
			
		}
	
	
	}



