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
		int M=2*(X+Y);
		if(M>=1000)
		System.out.println("YES");
		else
		System.out.println("NO");
	}
}
