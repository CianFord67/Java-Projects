
import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
    	
    	//long start = System.nanoTime();
    	
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first: ");
        int first = sc.nextInt();
        System.out.print("Enter last: ");
        int last = sc.nextInt();


if(first >=0 || last >0 || last - first == 0)
{
	if(last < 0)
    {
   	 System.out.println("Enter new Number");
   	 last = sc.nextInt();
    }
   
   
   int length = last - first + 1;

  
  
   	int[] primes = new int[length];
   
  
   
   int totalPrimes = 0; 

   

   for (int i = 0; i < length; i++) {
       
   	primes[i] = first + i;
       
       
       
       if (isPrime(primes[i])) 
       {
           totalPrimes++; 
       }
   }
   
  

   

   System.out.println("\nTotal Primes = " + totalPrimes);
   
   //long end = System.nanoTime();
  // System.out.println((end - start)/1000000000 + "- Time");
   
}
else
{
	System.out.println("Numbers cant be negative, Try again");
}



}
    
    public static boolean isPrime(int num) {
    	   if (num < 2) {
    	       return false;
    	   }
    	   if(num < 0)
    	   {
    	   	return false;
    	   }
    	   	
    	   for (int i = 2; i <= Math.sqrt(num); i++) {
    	       if (num % i == 0) {
    	           return false;
    	       }
    	   }
    	   return true;
    	}
        
        
        
         
}
		
		
		
		
	





