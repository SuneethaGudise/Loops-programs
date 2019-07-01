package loopsprograms;

public class Divide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=50; i++) {
			if(i % 3 == 0 && i% 5==0) {
				System.out.println("fuzz-buzz");
			}
			else if(i % 3==0){
				System.out.println("fuzz");
				
			}
			else if(i % 5==0){
				System.out.println("buzz");
			}
		}

	}

}
