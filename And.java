import java.io.*;
import java.util.*;
public class And
{
public static void main(String args[])
{
int x,i,min,count=0;

Scanner s=new Scanner(System.in);
System.out.println("Enter the size of array");
x=s.nextInt();

int a[]=new int[x];
System.out.println("Enter the elements");
for(i=0;i<x;i++)
{
a[i]=s.nextInt();
}
min=a[0];
for(i=0;i<x;i++)
{
if(min>a[i])
{
min=a[i];
}
}
for(i=0;i<x;i++)
{
if(a[i]==min)
{
}
else
{
while(a[i]>min)
{
count++;
a[i]--;
}
}
}
System.out.print("the count is  "+count);
}}
