import java.io.*;
import java.util.*;
public class Apple
{
public static void main(String args[])
{
       Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   System.out.println("Enter the String");
	   String arr[]=new String[n];
for(int i=0;i<n;i++)
{
	arr[i]=s.next();
}
    System.out.println("Enter the input String"); 
    String str=s.next(); 
	int l=str.length();                                                        
for(int i=0;i<n;i++)
{
	int len=arr[i].length();
	//System.out.println(len);  
if(arr[i].equals(str.substring(0,arr[i].length()))&& (arr[i].equals(str.substring(arr[i].length()+1,l-1))) ) ;
{
       System.out.println(str);
}
}
}
}		  






