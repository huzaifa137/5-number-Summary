import java.io.*;
import java.util.*;


class quartile{ 
  
//(Median , Q1 and Q3).
    public static double Median(double nm[], int n) 
    { 
        
        //Median Logic
	
		double m;
		
        if (n % 2 != 0) 
		{
            m=nm[n / 2]; 
		}
		else
		{
        m= (nm[(n - 1) / 2] + nm[n / 2]) / 2.0; 
    } 
		return m;
	}
			
		//First Quartile logic (Q1).
		
			 static double Q1(int n,double[] nm)
			 {
					double b,x;
					b=0.25*(n);
					
					if(b%2>0)
					{
						x = nm[(int)b];
					}
					else
					{
						x=(nm[((int)b)-1]+(int)nm[(int)b])/2;
						
					}
				return x;
			 }
		
		
		//Third Quartile Logic (Q3).
		
			 static double Q3(int n,double[] nm)
			 {
					double b,x;
					b=0.75*(n);
					
					if(b%2>0)
					{
						x = nm[(int)b];
					}
					else
					{
						x=(nm[((int)b)-1]+(int)nm[(int)b])/2;
						
					}
				return x;
			 }
}	
		
//(Smallest and Largest value logic).
class sorting extends quartile
	{
		
			//Largest value.
			
	public static double Max(double[] count)
		{
			
			double max= count[0];
			for(int i =0;i<count.length;i++)
				{	
				if(count[i]>max)
					{
						max = count[i];
					}
				}
			return max;
		}
	
	
	public static double Min(double[] count)
	{	
			//Smallest value
		
		double min = count[0];
		for(int i=0;i<count.length;i++)
		{
			if(count[i]<min)
			{
				min=count[i];
			}
		}
		return min;
	}
}
			
class ow extends sorting
	{
		//Sorting of the Array.	
		public static void main(String args[])
			{	
				
				int i;
				int cal;
				
				Scanner scan = new Scanner(System.in);
				System.out.println("\n");
				System.out.println("How many elements do you need ?");
				cal =scan.nextInt();
				
				
				double nm[] = new double[cal];
				
				System.out.println("\n");
				System.out.println("ok, Please enter the elements now ");
				
				for(i=0;i<cal;i++)
				{
					nm[i] =scan.nextDouble();
				}
				
				Arrays.sort(nm);
				System.out.println("\n");
				
				System.out.printf("Sorted array [] : %s",Arrays.toString(nm));
				
				double max =Max(nm);
				double min =Min(nm);
				
	
	//This is the logic for getting the Largest and the Smallest value.
			System.out.println("\n");
			System.out.println("The Smallest value is " +min);
			System.out.println("The Largest value is  " +max);
		
	//invoking the median.
			int n = nm.length;
			System.out.println("Median = " + Median(nm, n)); 
			
	//invoking Q1 and Q3. 
			System.out.println("Q1 = "+ Q1(n,nm));
			System.out.println("Q3 = "+ Q3(n,nm));
			}
		}	