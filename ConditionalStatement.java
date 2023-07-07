package javaFundamentals;
import java.util.Scanner;
public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Math: ");
		float math = s.nextFloat();
		
		System.out.print("English: ");
		float english = s.nextFloat();
		
		System.out.print("Science: ");
		float science = s.nextFloat();
		
		System.out.print("Filipino: ");
		float filipino = s.nextFloat();
		
		float average = ((math + english + science + filipino)/4);
		
		System.out.println("Average: " + average);
		
		System.out.print("Remarks: ");
		
		if (average > 100) System.out.println("Invalid Grade");
		else if (average >= 98) System.out.println("With Highest Honors");
		else if (average >= 95) System.out.println("With High Honors");
		else if (average >= 90) System.out.println("With Honors");
		else if (average >= 75) System.out.println("Passed");
		else System.out.println("Failed");
		
	}

}
