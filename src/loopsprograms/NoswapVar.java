package loopsprograms;

public class NoswapVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int first =10;
       int sec =20;
       first = first+sec;//10+20=30(first)
       sec = first - sec;//30-20=10(sec)
       first = first - sec;//30-10=20(first)
       System.out.println("Now first is :" + first);
       System.out.println("Now sec is :" + sec);
       
       
	}

}
