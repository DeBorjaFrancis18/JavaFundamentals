package javaFundamentals;

import java.util.Scanner;

public class InputAndArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String emails[] = {"ace@gmail.com", "deborja.francis18@gmail.com", "johnfrancis.deborja@gmail.com", "tribianni.joseph18@gmail.com"};
		String username[] = {"MidnightDishwasher", "JhonnyFrancis", "FrancisJhonny", "TribianniJoey"};
		String password[] = {"acelangmalakas", "francispogi", "cispogi", "andengganda"};
						
		System.out.print("Enter index number: ");
		int x = s.nextInt();
		
		System.out.println("\nIndex   : " + x);
		System.out.println("Email   : " + emails[x]);
		System.out.println("Username: " + username[x]);
		System.out.println("Password: " + password[x] + "\n");
		
		
	}

}
