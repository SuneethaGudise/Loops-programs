package methodloops;

public class Astricmethod {
	public static String astric(String str) {
		for(int i=1 ;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
				System.out.print(" ");
				
			}
			System.out.println(" ");
				
		}
		return str;
		
	}

	public static void main(String[] args) {
		String str = null;
		// TODO Auto-generated method stub
		astric(str);

	}

}
