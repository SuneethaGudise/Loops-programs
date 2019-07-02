package methodloops;

import java.util.Scanner;

public class Palindromenumber {
	public static int palindrome(int num) {
	int orignum =num;
		int rev=0;
		
		while(num!=0) {
			rev=(rev*10)+(num%10);
			num=num/10;
		}
			
		System.out.println(rev);
		//int n=num;
		if(rev==orignum) {
			System.out.println("palindrome");
			//return rev;
		}
		else
			System.out.println("not palindrome");
		return rev;


		}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number :");
	   int n=scan.nextInt();
	   scan.close();
	  // int num =n;
	  // int rev = n;
	
	int res =palindrome(n );
	  	   
	/*if(n==rev) {
		   System.out.println("The number" +n + "is palindrome");
	   }
	   else
		   System.out.println("The number" +n + "is not a palindrome");*/

	}

}
