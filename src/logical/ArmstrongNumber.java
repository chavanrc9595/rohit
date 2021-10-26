package logical;
//100=1
//123=1+8+27
//227=8+8+343

public class ArmstrongNumber 
{
  public static void main(String[] args) {
	int num=153;
	int rem=0;
	int sum=0;
	int arm=num;
	
	while(num>0)
	{
		rem= num%10;
		sum=sum+rem*rem*rem;
		num=num/10;
	}
	if(sum==arm) 
	{
	    System.out.println("is armstrong number="+sum);
	}
	else
	{
		System.out.println(arm+" is not armstrong num");
	}
}
}
