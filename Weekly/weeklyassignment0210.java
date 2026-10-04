package weeekyassignments;

public class weeklyassignment0210 {

	public static void main(String[] args) {
		
		//Question 1 : Write a Java program to reverse a given number using a loop
		//Input: 12345 Output: 54321
		
		int num = 12345;
		int order = 0;
		for (;num >0; )
		
		{
						
		  int lastdigit = num%10; //5 4 3 2 1
		  order =  order*10+lastdigit; //5432    2
		  num = num/10; //1
		  		}
		System.out.println(order);
		
		
		//Question 2: Count the number of digits in a given number using while loop
		
		int i = 987654;
		int count = 0;
		for (;i>0;)		
		{
			
			count++;
			i = i/10;
				
			}
		
		System.out.println(count);
		

		//Question 3: Whether a number is an Armstrong number using loop
		
		int num2 = 153;
		int workingnum = 153;
		int sum1 = 0;
		for (;workingnum >0; )
		
		{
					
		  int lastdigit1 = workingnum%10; //3
          sum1 = sum1+lastdigit1*lastdigit1*lastdigit1;   		
		  workingnum = workingnum/10;
		  
		}
		
		 if (num2 == sum1)
		 {
			 System.out.println(num2 +" is a Armstrong number");
		 }
			 else
			 {
			System.out.println(num2 + " is not a Armstrong number");
			 
		 }
		 
		 //Question 4: Print all even and odd numbers using loop
		
		 int k = 0;
		 System.out.println("Even number" + " ");
		 
		 for (k=0;k<=20; k++)
		   if( k%2 == 0)
		 {
		      System.out.print(k +" ");
		 }
		 System.out.println();
		 System.out.println("Odd number" +" ");
		 for (k=0;k<=20;k++)
			if (k%2 !=0)
			{		
			System.out.print(k +" ");	
		 			}
		 
		 //Question 5:  sum of all even numbers between 1-50
		 
		 int sum = 0;
		 int even = 0;
		 for (even=0;even<=50; even =even+2)
	     sum = sum +even;	  
		 {
			   System.out.println();
			   System.out.println(sum); 
		 }	  	 
		       
		//Question 6: check a number is palindrome or not	
		 
		 int p = 1221;
		 int original=p;
		 int num3=0;
		 int lastd= 0;
		 for (;p>0;)
		 {
			 
		 lastd=p%10; //   122
		 num3=num3*10+lastd; //1 2
         p=p/10;//12   		  
		   
		 }   
         
         if(num3==original)
		    
         { 
			System.out.println("The number is a palindrome"); }
         
			else 
			{
				System.out.println("The number is not a palindrome");
          
		  }
           }
		
}
		 
	


