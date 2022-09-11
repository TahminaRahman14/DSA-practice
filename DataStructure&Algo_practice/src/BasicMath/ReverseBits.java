package BasicMath;

public class ReverseBits {
	
	public static int reverse (int x) {
		
		int result = 0;
		int bit;
		
		for(int i=0; i < 32; i++) {
			
			bit = (x >> i) & 1; // getting the bits of the number
			
			result = result | bit << (31 -i); // reversing the bits
			
		}
		
		return result;
	}
	
	public static void main (String args[]) {
		
		int x = 4;
		
		
		
		System.out.println(reverse(x));
		
		
	}

}
