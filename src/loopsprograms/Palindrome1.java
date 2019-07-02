package loopsprograms;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String str = "madam";
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the String:");
		String str =scan.nextLine();
		int n = str.length();
		System.out.println(str);
	//	char ch1= str.charAt(n);
		System.out.println(n);
		String polind ="";
		for(int i= n-1;i>=0; i--) {
			char ch = str.charAt(i);
		//	System.out.print(ch);
			
			 polind = polind+Character.toString(ch);
			
			//System.out.println(" ");
		}
		System.out.println(polind);
			if(str.equals(polind)) {
				//System.out.print(" ");
				System.out.println("madam is polindrome");
			}
			else
				System.out.println("not polindrome");
		
		
		
	}

}
