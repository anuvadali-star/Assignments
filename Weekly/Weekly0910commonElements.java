package weeekyassignments;

public class Weekly0910commonElements {

	public static void main(String[] args) {
		
		int a[] = {10, 20, 30, 40, 50};
		int b[] = {30, 30, 40, 60, 70, 50};
		
		System.out.print("Common Elements");
		for(int i=0; i<a.length;i++)
		{	
						
			for(int k=0; k<b.length;k++)
			{
			  			
			 if (a[i]==b[k])
			 {
				 System.out.print(" " + a[i]);	
			     break;
			 }		
}
			
}
           		
	}
}