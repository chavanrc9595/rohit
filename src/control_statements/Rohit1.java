package control_statements;

public class Rohit1 
{ 
	public void saurabh5()
  {
	  System.out.println("this is my non static method 3");
  }
public void saurabh6()
  {
	  System.out.println("this is my non static method 4");
  }
public static void saurabh7() 
  {
	System.out.println("this is my static method 3");
  }
public static void saurabh8() 
  {
	System.out.println("this is my static method 4");
  }
public static void main(String[] args) 
{
	saurabh7();
	saurabh8();
	Rohit1 b=new Rohit1();
    b.saurabh5();
    b.saurabh6();
    Rohit.saurabh3();
    Rohit.saurabh4();
    Rohit c=new Rohit();
    c.saurabh1();
    c.saurabh2();

}


}
