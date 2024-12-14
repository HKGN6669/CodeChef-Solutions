import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int x=A*C;
		int y=B*C;
		if(x>y)
		System.out.println(x);
		else
		System.out.println(y);
	}
}
