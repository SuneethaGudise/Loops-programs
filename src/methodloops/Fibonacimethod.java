package methodloops;

public class Fibonacimethod {
	public static int fibbo(int fibb) {
		fibb =0;
		int x=0;
		int y=1;
		while(fibb<=10) {
			System.out.println(fibb);
			fibb=x+y;
			int temp=x;
			x=fibb;
			y=temp;
			
		}
		 return fibb ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
      int res = fibbo(n);
	}

}
