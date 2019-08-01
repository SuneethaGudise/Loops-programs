package loopsprograms;
//INCOMPLETE
public class NoofArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public static boolean isArmstrong(int num2) {
			//int num1 =153;
	//	int num = num2;
		int eachnum =0;
		int temp=0 ;
		int j =0;
		for(int i =1;i<=200;i++)
		{ 
			//j=0;
	    	int origi=i;
			while(i!=0)
			{
		
			eachnum =i % 10;
			i= i/10;
			temp = eachnum*eachnum*eachnum;
			j =temp+j;
			}
		
		if (j==origi)
		{
			System.out.println("Armstrong number: " + origi);
		}
		}
		//return false;
       }
}
