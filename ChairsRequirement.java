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
		    int d=X-Y;
		    if(X>Y)
		    System.out.println(d);
		    else
		    System.out.println(0);
		}
	}
}
