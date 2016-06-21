package basic;


public class ArrayIntersect1 {

	public static void main(String[] args)
	{
		int[] arr1 = {1,4,7,9,11,16};
		int[] arr2 = {2,3,7,11,15,16,17};
		int i=0;
		int j=0;
	    int m = arr1.length;
        int n=  arr2.length;
		
        
        
		while(i<m && j<n)
		{
	        //System.out.println(s1[i]+" "+s2[j]);	

			
				if(arr1[i]<arr2[j])
				   i++;
				
				else if(arr1[i]==arr2[j])
				{
					
					 System.out.println(arr1[i]);
                    i++;
                    j++;
                   
				}
				
				else
					j++;
								
									
		}
		//System.out.println(i);
	

	
		
	}
}
