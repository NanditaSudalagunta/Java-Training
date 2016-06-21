package basic;

public class Unsorted {
	public static void main(String[] args)
	{
		int[] array = {1,3,2,4,4,3};
		int[] temp1 = new int[array.length];
		
		for(int i=0;i<array.length;i++)
		{
		   temp1[i]=0;	
		}
		
		
		for(int i=0;i<array.length;i++)
		{
		   int temp2 = array[i];
		   
				if (temp1[temp2]==0)
					temp1[temp2]=1;
				else
					{
					  System.out.println(temp2);
					  break;
					}
							
		}
			
	}
}
