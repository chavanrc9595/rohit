package logical;

//import java.util.Arrays;

public class ArraySort 
{
public static void main(String[] args) {
	int a[]= {1,1,3,4,5,6,8,1,2,3,4,5,6};
//	Arrays.sort(a);
//	for(int i=0;i<a.length;i++)
//	{
//		System.out.print(a[i]+" ");
//	}
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1; j<a.length;j++)
		{
			int temp=0;
			if(a[i]>a[j]) 
			{
			  temp=a[i];	
			  a[i]=a[j];
			  a[j]=temp;
			}
		}
	}
    for(int i=0; i<a.length;i++) 
    {
    	System.out.print(a[i]+" ");
    }
}
}
