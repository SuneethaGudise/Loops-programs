package loopsprograms;

import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = in.nextInt();
		if(num % 3 == 0 && num% 5==0) {
				System.out.println("fuzz-buzz");
			}
			else if(num % 3==0){
				System.out.println("fuzz");
			}
			
			else if(num % 5==0){
				System.out.println("buzz");
			}
		}

	}


