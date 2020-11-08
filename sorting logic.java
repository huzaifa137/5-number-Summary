import java.io.*;
import java.util.*;

class sorting
{
	public static void main(String args[])
	{
		int i;
		
		int nm[] = new int[10];
	
		Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the Numbers");
	
		for(i=0;i<10;i++)
			{
			nm[i] =scan.nextInt();
			}
	
	int max =getMax(nm);
	int min =getMin(nm);
	
System.out.println("The maximum value is " +max);

System.out.println("The minimum value is " +min);
	}
	
	public static int getMax(int[] count)
		{
			
			int max= count[0];
			for(int i =0;i<count.length;i++)
				{	
				if(count[i]>max)
					{
						max = count[i];
					}
				}
			return max;
		}
	
	
	public static int getMin(int[] count)
	{
		int min = count[0];
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