package dailyassignments;

public class Daily0510_Magicnumber {

	public static void main(String[] args) {
		int num = 172;
		int original = num;
		int magicnbr=0;
		
		for(;num>0;)
		{
			int lastdigit=num%10; //2
			magicnbr=magicnbr+lastdigit;
			num=num/10;
		}
		
		System.out.println(magicnbr);
		int magicnbr1=0;
		int lastdigit1=0;
		for(;magicnbr>0;)//10
		{
			lastdigit1=magicnbr%10; //0
			magicnbr1=magicnbr1+lastdigit1; //0
			magicnbr=magicnbr/10; //1
		}
		System.out.println(magicnbr1);
		System.out.println(lastdigit1);
		if (magicnbr1==1)
        System.out.println(original + " is a Magic number");
		else
		System.out.println(original + " is not a Magic number");
	}

}
