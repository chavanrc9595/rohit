package rohitJava;

public class Occurence 
{
	public static void main(String[] args) {
		
		String s="rohitchavan";
		int count=1;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(i!=j)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						count++;
					}
				}
			}
			System.out.println(s.charAt(i)+" occurance in the string= "+count);
			count=1;
		}
		
	}
}
