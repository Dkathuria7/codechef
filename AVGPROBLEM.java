/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    float a= sc.nextInt();
		    float b= sc.nextInt();
		    float c= sc.nextInt();
		    if(a<=10 && b<=10 && c<=10)
		    {
		        float z = (float) (a+b)/2;
		        if (z>c) 
		            System.out.println("YES");
		        else 
		            System.out.println("NO");
  		    }
		}
	}
}
