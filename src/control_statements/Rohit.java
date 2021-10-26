package control_statements;

public class Rohit 
{
public void saurabh1() 
  { 
	System.out.println("this is my non static method 1");
  }
public void saurabh2() 
  {
	System.out.println("this is my non static method 2");
  }
public static void saurabh3() 
  {
	System.out.println("this is my static method 1");
  }
public static void saurabh4() 
  {
	System.out.println("this is my static method 2");
  }
public static void main(String[] args) 
  {
	saurabh3();
	saurabh4();
	Rohit a=new Rohit();
	a.saurabh1();
	a.saurabh2();
  }
}
