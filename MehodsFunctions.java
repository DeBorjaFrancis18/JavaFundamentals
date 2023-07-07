package javaFundamentals;

public class MehodsFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,2,3,4,5};
		int result = summation(num);
		System.out.println(result);
	}
	
	static int summation(int num[]){
		int sum = 0;
		for(int x:num) {
			sum = sum + x;
		}
		return sum;
	}
	
	static void print(String word) {
		System.out.println(word);
	}
}
