package control_loop_assignment;

import java.util.Scanner;

public class GreatestOfThree {
	
public static int greaterOfThree(int greatest1, int greatest2, int greatest3) {
	int noth = 0;
		if(greatest1 > greatest2 && greatest1 > greatest3) {
			System.out.println("The first number entered is larger : " + greatest1);
			return greatest1;
			
		}else if(greatest2 > greatest1 && greatest2 > greatest3){
			System.out.println("The second number entered is larger : " + greatest2);
			return greatest2;
			
		}else if (greatest3 > greatest1 && greatest3 > greatest2) {
			System.out.println("The third number entered is larger : " + greatest3);
			return greatest3;
		}else {
			System.out.print("you have entered two or more numbers that are the same.");
		}
		return noth;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number");
		int greatest1 = sc.nextInt();
		System.out.println("Please enter the second number");
		int greatest2 = sc.nextInt();
		System.out.println("Please enter the third number");
		int greatest3 = sc.nextInt();
		sc.close();
		
		
		
		//output
		greaterOfThree(greatest1, greatest2, greatest3);
	}

}
