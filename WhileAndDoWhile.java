package javaFundamentals;

import java.util.Scanner;

public class WhileAndDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int lives = 3;
		
		while(lives > 0) {
			System.out.println("Lives: " + lives);
			System.out.println("What is the center of our solar System?");
			System.out.print("Answer: ");
			String answer = s.nextLine();
			System.out.println("");
			if(answer.equalsIgnoreCase("Sun")) {
				break;
			}
			else {
				lives--;
			}
		}
		
		if(lives > 0) {System.out.println("You WON!");}
		else {System.out.println("You LOST!");}
		
	}

}
