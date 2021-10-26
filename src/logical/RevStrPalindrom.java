package logical;

public class RevStrPalindrom 
{
	public static void main(String[] args) 
	{
		   String s="madam";
		   String rev="";
		   for(int i=s.length()-1;i>=0;i--) 
		   {
			   rev=rev+s.charAt(i);
		   }
		   System.out.println(rev);
		   System.out.println("******************************************");
		   
		   if(s.equals(rev))
		   {
			   System.out.println("Its a palindrome string");
		   }
		   else 
		   {
			   System.out.println("Its not a palindrome string");
		   }
	}
}
