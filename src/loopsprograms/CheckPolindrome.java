package loopsprograms;

import java.util.Scanner;

public class CheckPolindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word :");
		String str = scan.nextLine();
		int len =str.length();
		String polind ="";
		System.out.println(len);
		for(int i= len-1;i>=0; i--) {
			char ch = str.charAt(i);
		//	System.out.print(ch);
			 polind =polind+ Character.toString(ch);
			 
		}
			
			System.out.println(polind);
			//System.out.println(" ");
			if(str.equals(polind)) {
				//System.out.print(" ");
				System.out.println("madam is polindrome");
			
			}
			else
				System.out.println("not Polindrome");
	}

}
