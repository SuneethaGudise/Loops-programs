package loopsprograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =153;
		int num = num1;
		int eachnum =0;
		int temp ;
		int j =0;
		while(num!=0) {
			eachnum = num % 10;
			num = num/10;
			temp = eachnum*eachnum*eachnum;
			j =temp+j;
		}
		System.out.println(j);
		if(j == num1) {
			System.out.println("num is Armstrong");
		}
		else 
			System.out.println("num is not Armstrong");
		}

	}


