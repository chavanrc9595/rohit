package logical;

public class PalindromString {

	public static void main(String[] args) {
		
		String s = "Abcdcba";
		String  rev ="";
		
		for( int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		if(s.equalsIgnoreCase(rev))  //s.equals(rev)
		{
			System.out.println("It is a palindrom string");
		}
		else 
		{
		System.out.println("It is not a palindrom string");	
		}
	}
}
