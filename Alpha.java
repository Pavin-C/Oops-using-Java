/*2. Write a program to arrange the given string consisting of lower case letters only in alphabetical order?

INPUT:                          
apple                  
OUTPUT:
aelpp*/


import java.io.*;
import java.util.*;
public class Alpha 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.next();
		int n=str.length();
		char arr[]=str.toCharArray();
		char temp;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]!=' ')
			{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		}
	}
	for(int i=0;i<n;i++)
	{
		System.out.printf("%s",arr[i]);
	}
}
}