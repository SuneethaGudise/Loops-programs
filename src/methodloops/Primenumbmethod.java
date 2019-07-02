package methodloops;

public class Primenumbmethod {
	public static int prime(int num) {
				for(int i=2;i<=100;i++)
		{
			int count =0;
			for(int j=1;j<=i;j++) {
				
			
				if(i%j==0)
				{
					count++;
			}
				if(count==2) {
					System.out.println("Number is prime");
				
					
			}
			else
				System.out.println("number is not prime");
			}
		}
		return num;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int res =prime(num);

	}

}
