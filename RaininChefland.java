import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
		    int X=sc.nextInt();
		    if(X<3)
		    System.out.println("LIGHT");
		    else if(X>=3 && X<7)
		    System.out.println("MODERATE");
		    else
		    System.out.println("HEAVY");
		}
	}
}
