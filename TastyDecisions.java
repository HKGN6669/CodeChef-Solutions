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
		    int Y=sc.nextInt();
		    int c=2*X;
		    int d=5*Y;
		    if(c>d)
		    System.out.println("Chocolate");
		    else if(c==d)
		    System.out.println("Either");
		    else
		    System.out.println("Candy");
		}
	}
}
