
public class VariableDemo {
	public static void main(String[] args) {
		// declare a variable
		int englishGrade;
		// assigned a value to the variable
		englishGrade = 20;
		// initialize a variable
		int mathGrade = 50;
		
		System.out.println("English Grade : " + englishGrade);
		System.out.println("Math Grade : " + mathGrade);
		// type casting
		byte data = 45;
		int myData = data; // implicit casting
		int myDude = 142464644;
		byte smallData = (byte) myData; // explicit casting
		byte what = (byte)myDude;// because it doesnt have enough space it turns into the max negative
				System.out.println(what);
				
		double socialGrade = 45.67;
		float scienceGrade = 56.78f;
		
		
		//----------------------------------------------------/
		// pre increment
		int b = 30;
		int c = ++b;
		System.out.println(c);
		System.out.println(b);
		// post increment
		 b = 30;
		 c = b++;
		System.out.println(c);
		System.out.println(b);
		//----------------------------------------------------
		int a = 40 ;
		c = a>b?a:b;
		System.out.println(c);
				
	}
}
