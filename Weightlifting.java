import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int A1=sc.nextInt();
        int A2=sc.nextInt();
        int B1=sc.nextInt();
        int B2=sc.nextInt();
        int C1=sc.nextInt();
        int C2=sc.nextInt();
        int A=0;
        int B=0;
        int C=0;
        if(A1>A2)
        A=A1;
        else
        A=A2;
        if(B1>B2)
        B=B1;
        else
        B=B2;
        if(C1>C2)
        C=C1;
        else
        C=C2;
        System.out.println(A+B+C);
	}
}
