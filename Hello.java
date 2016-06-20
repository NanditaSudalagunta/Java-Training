package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {

	public static void main(String[] args)
	{
		
		String s = new String();
		String myList = new String();
		String finalstring =  "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] words = s.split("\\s");
		
		for (int i = 0; i < words.length; i++) 
		{
		 	int n = words[i].length();
		    
		    myList = "";
		    for(int j=0;j<n;j++)
		    {		    	
		    	myList = myList+words[i].charAt(n-(j+1));
		    		    	   	
		    }	   		  
		  
		   finalstring = finalstring + myList +" ";   
		}
		
		System.out.println(finalstring.trim());	
		
	}
	
}
