package logical;
//151

public class PalindromeNumber 
{
  public static void main(String[] args) 
  {
	  int num=151;
	  int rev=0;
	  int rem=0;
	  int originalNum=num;
	  while(num>0)
	  {
		  rem=num%10;           //1  //5     //1
		  rev=rev*10+rem;       //1  //10+5  //150+1
		  num=num/10;           //15 //1     //0
	  }
	  if(rev==originalNum)
	  {
		  System.out.println(rev);
	  }
  }
 
}

