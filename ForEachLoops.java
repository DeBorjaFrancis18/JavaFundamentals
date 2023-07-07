package javaFundamentals;
import java.util.Scanner;
public class ForEachLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int numbers[] = {1,2,3,4,5,6,7,8,9,10};
		int result = 0;
		for(int x:numbers) {
			result = result+x;
			System.out.print(x + "+" + (result-x) + "= ");
			System.out.println(result);
			
		}
	}

}
