import java.io.*;
import java.util.*;
class AA
{
public static void main(String args[])
{
int x=0;
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2=s.nextLine();

char arr1[]=new char[100];
arr1=s1.toCharArray();

char arr2[]=new char[100];
arr2=s2.toCharArray();

for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==arr2[i])
            {
             System.out.println(" ");
             }
         
else if(arr1[i]!=arr2[i])
{
 x=x+1;
}
}  
System.out.println(x);

}
}  


	  
   