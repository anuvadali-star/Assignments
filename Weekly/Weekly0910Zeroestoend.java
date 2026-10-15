package weeekyassignments;

public class Weekly0910Zeroestoend {

	public static void main(String[] args) {
	
		
		int a[] = {0, 5, 0, 3, 8, 0, 2, 9};
		
		for (int i=0; i<a.length;i++)
		{
		    
			if(a[i] > 0)
				
				System.out.print(a[i] +" ");	
		}
				
		for (int i=0; i<a.length;i++)
		{
			if(a[i] == 0)
			
				
			System.out.print(a[i] +"  ");	
			}
		
		
		//Trainer method
		
		int arr[] = {0, 5, 0, 3, 8, 0, 2, 9};
			
			for (int i=0;i<arr.length;i++)
			{
				for(int j=1+i;j<arr.length;j++)
				{
		           if (arr[i]==0)
		          {
		        	  if (arr[j]!=0)
		        	  {
		        		  int temp = arr[i];
		        		  arr[i] = arr[j];
		        		  arr[j] = temp;
		        		  
		        	  } 
		        	  				
		          }
		 
	
				}
				
				      	
}
			System.out.println();
			for( int k=0;k<arr.length;k++ )
				  System.out.print(arr[k] +  " ");
			  
	}
}