package logical;

public class ReassignString 
{
public static void main(String[] args) 
 {
	int a=10;
	a=20;
	System.out.println(a);
	
	//srting reasign
	String s="Aspire";
	s="Aspire Training Institute";
	System.out.println(s);
	String str= new String("Aspire");
	str="Aspire Training Institute";
	System.out.println(str);
	
	//string interchange
	String  s1=new String("Aspire");
	String  s2=new String("Pune");
	String temp = "";
	temp=s1;
	s1=s2;
	s2=temp;
	System.out.println(s1 + " "+s2);
	
 }
}
