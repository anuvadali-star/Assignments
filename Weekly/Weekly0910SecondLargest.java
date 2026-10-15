package weeekyassignments;

public class Weekly0910SecondLargest {

	public static void main(String[] args) {
		
	
	    int largest = Integer.MIN_VALUE;
	    int seclargest = Integer.MIN_VALUE;
		
		int a [] = {0 ,-12, -45, -7, -89, -34, -89, -56,-100,100,100};
		
		for(int i=0;i<a.length;i++)
		{
            if(a[i]>largest)
            largest= a[i]; 
           
            		}
		
		for(int i=0;i<a.length;i++)
           
			
		  {
		    if(a[i] >seclargest && a[i] < largest)
		    seclargest=a[i];
		    
		  			    
		  }
		  
		  System.out.println("Largest is :" + largest);
		  System.out.println("Seccond Largest is " + seclargest);
        	  
		  //Trainer method
		  
		  
		  
		  
		  
	}
      
	}

