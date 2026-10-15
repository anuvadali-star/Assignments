package weeekyassignments;

public class Weekly0910Missingnumber {

	public static void main(String[] args) {
		int count = 0;
		
		int a[] = {1, 2, 3, 5, 6, 7, 9, 10};
		
		for(int i =0;i<a.length;i++)
			
		{
		
			count=count+1; // 3
	
			while (count!=a[i])
			{
				 System.out.println(count);
				 count++;
			 
			  	}		
			
		}
		 
		
	}

}
