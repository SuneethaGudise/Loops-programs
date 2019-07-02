package methodloops;

import java.util.Scanner;

public class DivideMethod {
	public static int divide(int num) {
		if(num % 3 == 0 && num% 5==0) {
			System.out.println("fuzz-buzz");
		}
		else if(num % 3==0){
			System.out.println("fuzz");
		}
		
		else if(num % 5==0){
			System.out.println("buzz");
		}
		return num;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = in.nextInt();
		int res =divide(num);

	}

}
