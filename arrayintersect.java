package basic;

import java.util.ArrayList;
import java.util.List;

public class arrayintersect {

	public static void main(String[] args)
	{
		int[] s1 = {1,2,3,4,5,6};
		int[] s2 = {4,5,6,7,8,9};
		List<Integer> rst = new ArrayList<Integer>();

		
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<s2.length;j++)
			{
				if(s1[i]==s2[j])
				  rst.add(s1[i]);
			}
			
		}
		
		for (int k=0; k<rst.size(); k++)
		     System.out.println(rst.get(k));
	
		
	}
}
