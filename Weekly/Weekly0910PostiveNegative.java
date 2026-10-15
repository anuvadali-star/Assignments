package weeekyassignments;

public class Weekly0910PostiveNegative {

	public static void main(String[] args) {
		
		int a [] = {-4, 7, 0, -2, 9, 0, -8, 5};
		
			
	/*	for(int i=0; i<a.length;i++)
		{
			if(a[i]>0)
			   System.out.print(" " + a[i]);
		}
		
		for(int i=0; i<a.length;i++)
		{
			if (a[i]<0)
		    System.out.print(" " + a[i]);
		
		}
		for(int i=0; i<a.length;i++)
		{
			if(a[i]==0)
		    System.out.print(" "+ a[i]);		
	}
*/		
		
		for(int i=0; i<a.length;i++)
		{
			if(a[i]>0)
			{
			   System.out.print(" " + a[i]);
			}
			if(a[i]<0)
			{
				System.out.print(" "+ a[i]);	
			}
			if(a[i]==0)
			{
		       System.out.print(" "+ a[i]);		
			}
		}
		

	}

}
