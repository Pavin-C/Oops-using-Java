import java.io.*;
import java.util.*;
public class Alex
{
public static void main(String args[])
   {
       Scanner s=new Scanner(System.in);
	   System.out.println("Enter the number of testcases");
	   int t=s.nextInt();
	while(t!=0)
	{
		   System.out.println("Enter the number of boxes"); 
           int n=s.nextInt();
		   System.out.println("Enter the target value"); 
           int x=s.nextInt();
		   System.out.println("Enter the number of chocolates");
		   int c[]=new int[n];
        for(int i=0;i<n;i++)
		{
			c[i]=s.nextInt();
		}
	}
   }
}
		