package dailyassignments;

public class Daily0510_Spynumber {

	public static void main(String[] args) {
		int num = 1124;
		int original = num;
		int sumofdigit=0;
		
		for (;num>0;)
		{
		 int lastdigit = num%10;
		 sumofdigit=sumofdigit+lastdigit;
		 num=num/10;
		}

		System.out.println(sumofdigit);
		
		num=original;
		int lastdigit = 0;
		int prodofdigit=1;
		for (;num>0;)
		{
		lastdigit = num%10; //4
		prodofdigit=prodofdigit*lastdigit; //4
		
		num=num/10;
		}
		System.out.println(prodofdigit);
		if (sumofdigit==prodofdigit)
		System.out.println(original + " is a spy number");
		else
		System.out.println(original + " is not a spy number");
		
	}

}
