/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean flag=false;
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)=='a')||(s.charAt(i)=='b'))
			{
				flag=true;
			}
			else
			{
				c++;
			}
		}
		if((flag==true)&&(c<=1))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
