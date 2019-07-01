package loopsprograms;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib =0;
		int x=0;
		int y =1;
	//	System.out.println(fib);
		while(fib <=10) {
			System.out.println(fib);
			fib = x+y;
			//System.out.println(fib);
			
			int temp =x;
			x =fib;
			y =temp;
		}

	}

}
