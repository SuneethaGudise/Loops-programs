package loopsprograms;

public class Divisibleby3or5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for(int i=1;i<50;i++) {
    	  if(i%3==0 ) {
    		  System.out.println(i + " Is divisible by 3");
    		  System.out.println("FUZZ");
    		  
    	  }
    	  if(i% 5 ==0) {
    		  System.out.println(i +" Is divivsible by 5");
    		  System.out.println("BUZZ");
    		      	  }
    	  if(i%3==0 && i %5 ==0) {
    		  System.out.println(i + " Is divisible by 3 and 5");
    		  System.out.println("FUZZ-BUZZ");
    	  }
      }
	}

}
