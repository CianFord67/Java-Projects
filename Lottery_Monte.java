package lab6;

import java.util.*;
import java.text.DecimalFormat;
public class Lottery_Monte {

	public static void main(String[] args) {
		
		
		Random r = new Random();
		
		int NumOFSims = 10000;
		
		
		
		double TicketPrice = 2.5;
		
		
		long start = System.currentTimeMillis();
		

        double Winnings = Simulation(NumOFSims);
        double TotalSpent = TicketPrice * NumOFSims;
        double profit = Winnings - TotalSpent;

        DecimalFormat df = new DecimalFormat("#.##");
        String winningsAmount = df.format(Winnings);
        String roundedProfit = df.format(profit);

        System.out.println("Winnings = " + winningsAmount);
        System.out.println("Spent on Tickets: " + (TotalSpent)); 
        System.out.println("_________________________________________");
        System.out.println("Profit: " + (Double.parseDouble(roundedProfit) - TicketPrice)); 
		
		
		
		
		
		
		
		
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		System.out.println("_________________________________________");
		System.out.println("Time taken to execute- "+ timeElapsed / 1000 + "s");
		
		
	}
	
	
	
	 public static double Simulation(int sims) {
	        Random rnd = new Random();
	        double Winnings = 0 ;
	        
	        for(int i = 0; i<sims ; i++)
	        {
	        	if(rnd.nextInt(139838160) == 0)
	        	{
	        		Winnings+=57667861;
	        	}
	        	if(rnd.nextInt(3107515) == 0)
	        	{
	        		Winnings+=26148.46;
	        	}
	        	if(rnd.nextInt(621503) == 0)
	        	{
	        		Winnings+=1476.95;
	        	}
	        	if(rnd.nextInt(14126) == 0)
	        	{
	        		Winnings+=51.32;
	        	}
	        	if(rnd.nextInt(13812) == 0)
	        	{
	        		Winnings+=31.47;
	        	}
	        	if(rnd.nextInt(986) == 0)
	        	{
	        		Winnings+=10.85;
	        	}
	        	if(rnd.nextInt(707) == 0)
	        	{
	        		Winnings+=8.29;
	        	}
	        	if(rnd.nextInt(314) == 0)
	        	{
	        		Winnings+=6.85;
	        	}
	        	if(rnd.nextInt(188) == 0)
	        	{
	        		Winnings+=5.39;
	        	}
	        	if(rnd.nextInt(50) == 0)
	        	{
	        		Winnings+=4.23;
	        	}
	        	if(rnd.nextInt(22) == 0)
	        	{
	        		Winnings+=2.70;
	        	}
	        }
	        
	        
	        return Winnings;
	    }
}



