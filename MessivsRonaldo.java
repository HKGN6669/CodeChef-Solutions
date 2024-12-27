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
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int M=2*A+B;
		int R=2*X+Y;
		if(M==R)
		System.out.println("Equal");
		else if(M>R)
		System.out.println("Messi");
		else
		System.out.println("Ronaldo");
	}
}
