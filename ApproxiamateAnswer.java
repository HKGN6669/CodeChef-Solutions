import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc=new Scanner(System.in);
	   int X=sc.nextInt();
	   int Y=sc.nextInt();
	   int K=sc.nextInt();
	   int d=Math.abs(X-Y);
	   if(d<=K)
	   {
	   System.out.println("Yes");
	   }
	   else
	   {
	   System.out.println("No");
	   }
	}
}
