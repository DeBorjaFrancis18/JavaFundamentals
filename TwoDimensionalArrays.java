package javaFundamentals;

import java.util.Scanner;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String users[][] = {
				{"Francis", "Francis123"}, 
				{"Andrea", "Andrea123"}, 
				{"Baniqued", "Baniqued123", "Brother"}, 
				{"Noaim", "Noaim123", "Brother", "Nice"}, 
			};
		
		for(String user[]:users) {
			for(String info:user) {
				System.out.println(info);
			}
			System.out.println();
		}
	}

}
