package logical;

import java.util.Scanner;

public class ArrayEleDesc 
{
public static void main(String[] args) {
	int []a=new int [5];
	Scanner r=new Scanner(System.in);
	System.out.println("Enter value in array");
	
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				int temp = a[i];
				     a[i]=a[j];
				     a[j]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++)
	{
		a[i]=r.nextInt();
	}
}
}
