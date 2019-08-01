package loopsprograms;

import java.util.Scanner;

public class ArmstronOrnot {
	public static boolean isArmstrong(int num2) {
		//int num1 =153;
		int num = num2;
		int eachnum =0;
		int temp ;
		int j =0;
		while(num!=0) {
			eachnum = num % 10;
			num = num/10;
			temp = eachnum*eachnum*eachnum;
			j =temp+j;
		}
		//System.out.println(j);
		if(j==num2)
		{
			return true;
		}
		else
		return false;
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
				System.out.println("ENTER THE NUMBER");
		int x =scan.nextInt();
			/*for(int i=1;i<=1000;i++) {
				*/
			
			boolean res = isArmstrong(x);
			if(res == true){
				System.out.println(" Armstrong Number  " + x);
			}
			else
				System.out.println("not Armstrong");
			
				
			
			
		}

	}


