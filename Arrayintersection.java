import java.util.Arrays;
public class Arrayintersection
{
public static void main(String args[])
{
     int a1[]=new int[]{2,4,8};
	 int a2[]=new int[]{2,3};
for(int i=0;i<4;i++)
{
for(int j=0;j<4;j++)
{
if(a1[i]==a2[j])
{
    System.out.println(a1[i]);
}
}
}
}
 }
	 
	 	 
import java.io.*;
import java.util.Arrays;
class Booltrue{
public static void main(String args[]){

Boolean bool=true;
String str=new Boolean(bool).toString();
System.out.println(str);
}}


import java.io.*;
import java.util.*;
public class Demo
{
public static void main(String args[])
{
    int a=100;
	System.out.println("Integer "+a);
	boolean bool=(a==100);
	System.out.println("Boolean value is "+bool);
}
}


import java.io.*;
import java.util.*;
public class Demo1
{
public static void main(String args[])
{
    String s="false";
	boolean bool=Boolean.parseBoolean(s);
	System.out.println(bool);
	}
	}
		
import java.io.*;
import java.util.*;
public class Demo2
{
public static void main(String args[])
{
     boolean val=false;
	 Boolean res=Boolean.valueOf(val);
	 System.out.println(res);
	 }
	 }
	 
	 
import java.io.*;
public class Demo3
{
public static void main(String args[])
{
     String a="true";
	 Boolean bool=Boolean.valueOf(a);
	 System.out.println(bool);
	 }
	 }
	 
	 
import java.io.*;
public class Demo4
{
public static void main(String args[])
{
     boolean bool=false;
	 System.out.println("Boolean value:" +bool);
	 int val=(bool)?1:0;
	 System.out.println("Integer is " +val);
	 }
	 }


import java.io.*;
public class Demo5
{
public static void main(String args[])
{
     int a=150;
	 String str=Integer.toString(a);
	 System.out.println(str+"yu");
	 }
	 }	 
	 

import java.io.*;
public class Demo6
{
public static void main(String args[])
{
  String str="100";
  int a=Integer.parseInt(str);
  System.out.println(a);
  }
  }
  
  
import java.io.*;
import java.util.*;
public class Demo7
{
public static void main(String args[])
{
    int age=2;
	String a=String.format("%d" ,age);
	String b=String.valueOf(age);
	System.out.println("The child is " +a + " Years old");
	System.out.println("The child is " +b + " Years old");
}
}


import java.io.*;
import java.util.Arrays;
public class Demo8
{
public static void main(String args[])
{
     int [][] intArray={{1,2,3,4},{11,12}};
	 System.out.println(Arrays.deepToString(intArray));
}
}


import java.io.*;
import java.util.Arrays;
public class Demo9
{
public static void main(String args[])
{
   int[] n1={1,2,3,4};
   int[] n2=new int[n1.length];
   int[] n3=new int[n2.length];
   System.arraycopy(n1,0,n2,0,n1.length);
   System.out.println("n2=" +Arrays.toString(n2));
   System.arraycopy(n2,0,n3,0,n2.length);
   System.out.println("n3=" +Arrays.toString(n3));
 }
 }
 
   
   	 

  
	 