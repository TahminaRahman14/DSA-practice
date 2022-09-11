package BasicMath;

// Count the number of digits in N which evenly divides N.
//GFG

public class CountDigits {
	
	public static int evenlyDivides(int N){
        // code here
        int temp = N;
        int count = 0;
        
        while(N!= 0){
            
            int reminder = N % 10;
            
            if(reminder!=0 && (temp%reminder == 0)){
                
                count++;
            }
           
           N = N/10;
           
        }
        
        return count;
    }
	
	public static void main(String args[]) 
    { 
         int N = 12345;
         
        System.out.println("Number of digits in "+N+" is "+evenlyDivides(N));
    } 

}
