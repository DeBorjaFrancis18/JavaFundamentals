package javaFundamentals;

public class Arrays {

	public static void main(String[] args) {
		String email [] = {"Francis", "Andrea", "Carl", "Noaim", "Mel"};
		String username [] = {"Francis123", "Andrea123", "Carl123", "Noaim123", "Mel123"};
		String password [] = {"PFrancis123", "PAndrea123", "PCarl123", "PNoaim123", "PMel123"};
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Index   : " + i);
			System.out.println("Email   : " + email [i]);
			System.out.println("Username: " + username [i]);
			System.out.println("Password: " + password [i]);
			System.out.println();
		}

	}

}
