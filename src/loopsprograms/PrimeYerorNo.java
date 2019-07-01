package loopsprograms;

import java.util.Scanner;

public class PrimeYerorNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PRIME NUMBER OR NOT
	Scanner scan =new Scanner(System.in);
	
	System.out.println("ENTER THE NUMBER :");
	System.out.println(" ");
	int n =scan.nextInt();
 
	 scan.close();
 
		// for(int i=1;i<=n;i++)
		 // {
		     int count=0;
		     for(int j=1;j<=n;j++)
		       {
		         if(n%j==0)
		           {
		            count++;
		            }
		        }
		          if(count==2)
		            {
		            System.out.println("The given Number is prime");
		             }
		          else
		        	  System.out.println(" The Number is not prime");
		   // }
 }
}
