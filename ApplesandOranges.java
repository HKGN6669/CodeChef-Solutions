import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int R=A+B;
		if(R<=X)
		System.out.println("YES");
		else
		System.out.println("NO");
	}
}
