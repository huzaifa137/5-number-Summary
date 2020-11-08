//its optional to use the java.io package Here.
import java.io.*;
import java.util.*; 
  
class quartile{ 
  
   //We first inquire the logic of geting the median from the given values.
    public static double Median(double nm[], int n) 
    { 
        
        Arrays.sort(nm); 
	
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
//We do first get the First Quartile of the given values
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

//We also get the third quartile as the formulars do indicate in Math
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
				
// The compiling class
    public static void main(String args[]) 
    { 
         
	    
//The sortng Logic
				int i;
				
				double nm[] = new double[6];
				
				System.out.println("Enter any 7 numbers ");
				Scanner scan = new Scanner(System.in);
				
				
				for(i=0;i<6;i++)
				{
					nm[i] =scan.nextDouble();
				}
				
				Arrays.sort(nm);
				
				System.out.printf("Modified arr[] : %s",Arrays.toString(nm));
				
				System.out.println("\n");
				
				
        int n = nm.length; 
        System.out.println("Median = " + Median(nm, n));
		
		System.out.println("Q1 = "+ Q1(n,nm));
		System.out.println("Q3 = "+ Q3(n,nm));
		
    } 
} 
