package Lab4;
import java.util.Random;
import java.util.Scanner;
public class Monte_Carlo_Sim {

	public static void main(String[] args) {
		
////////////////////////////////////////////////////////////////////////////////////////////////
		Random rdm = new Random();
		
		
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("PI(1) or E(2)");
		num = sc.nextInt();
		if (num == 2)
		{
			System.out.println("Enter Number of Runs-");
			int runs = sc.nextInt();
			double e = Math.exp(1);
			int Rtotal = 0;
			
			for(int i = 0; i < runs; i++)
			{
				double num1 = 0;
				int num2 =0;													//Question 1 - find e 
				
				while(num1 <= 1)
				{
					num1 += rdm.nextDouble();
					num2 ++;
				}
				
				Rtotal += num2;
			}
			
			double FinalE = (double) Rtotal / runs;
			
			System.out.println("e = " + FinalE);
			System.out.println("actual e = " + e);
			double error = (Math.abs(FinalE - e) / e) * 100;
			System.out.println("Error = " + error);

		}
		
		
		
		
		
		
		
		else if (num == 1)
		{
			System.out.println("Enter Number of Points-");
			int points = sc.nextInt();
			int inCircle = 0;
			double pi = Math.PI;
			
			for(int i = 0; i < points; i++)
			{
				double x = rdm.nextDouble();
				double y = rdm.nextDouble();
				
				
				double distance = Math.sqrt(x*x + y*y);
				
				if (distance <= 1.0)
				{
					inCircle++;
				}
			}
			
			double ActualPI = 4.0* (double) inCircle / points;
			double error2 = (Math.abs(ActualPI - pi) / pi) * 100;
			
			
			System.out.println("Pi = " + ActualPI);
			System.out.println("actual Pi = " + pi);
			System.out.println("Error = " + error2);

			
			
			
				
		}
		
		
		////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		

	}

}
