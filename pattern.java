package basic;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int noOfLines = in.nextInt();
		
		for(int i=1;i<=noOfLines;i++){
			
			int linecount = 2*i-1;
			int spacecnt = ((2*noOfLines-1)-(2*i -1))/2;
			
			repeat(" ",spacecnt);
			repeat("*",linecount);
			repeat(" ",spacecnt);
			System.out.println();

			
		}

	}
	
	
	public static void repeat(String x,int n){
		int i=0;
		while(i<n)
		{	
			System.out.print(x);
		    i++;
		}
		
	}
	
	
}
