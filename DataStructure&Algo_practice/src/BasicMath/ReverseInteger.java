package BasicMath;

public class ReverseInteger {

	static int reverseInt(int n) {
		
		int max = Integer.MAX_VALUE;
		
		int min = Integer.MIN_VALUE;
		
		int result = 0;
		
		while (n!=0) {
			
			int digit = n % 10;
			
			n = n/10;
			
			if(result > max/10 || result < min/10) {
				
				return 0;
			}
           
           result = (result * 10) + digit;
		}
		
		return result;
	}
	
	public static void main (String args[]) {
		
		int n = 456;
		
		System.out.println(reverseInt(n));
	}
	
	
	

}
