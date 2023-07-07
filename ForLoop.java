package javaFundamentals;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String usernames[] = {"Francis", "Andrea", "Noaim", "Mel", "Carl", "Baniqued"};
		String passwords[] = {"Pass 1", "Pass 2", "Pass 3", "Pass 4", "Pass 5", "Pass 6"};
		System.out.print("Input Username: ");
		String uname = s.nextLine();
		System.out.print("Input Password: ");
		String pword = s.nextLine();
		
		boolean isExist = false;
		
		for(int i = 0; i< usernames.length; i++) {
			if(usernames[i].equals(uname) && passwords[i].equals(pword)) {
				isExist = true;
				break;
			}
		}
		if (isExist) {System.out.println("Welcome " + uname);}
		else {System.out.println("Access Denied");}
	}

}
