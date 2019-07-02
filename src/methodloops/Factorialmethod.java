package methodloops;

import java.util.Scanner;

public class Factorialmethod {
	public static int fact(int num) {
		//num=6;
		int fact =1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		return num;
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = in.nextInt();
			
		//int n =0;
		int res = fact(n);
		}

	

}
