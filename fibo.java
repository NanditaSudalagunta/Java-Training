package basic;

public class fibo {

	public static void main(String[] args){
		
		
		String[] arr = new String[20]; 
		int[] num = new int[20];
		num[0]= 0;
		num[1]= 1;
		arr[0]="0";
		arr[1] ="1";
		String temp = new String();
		
		System.out.println(num[0]);
		System.out.println(num[1]);

		for(int i=2;i<20;i++){
			
			num[i] = num[i-1]+num[i-2];
	        arr[i]="";
			temp = Integer.toString(num[i]);
			
			if(temp.contains("3")||temp.contains("3")||num[i]%3==0||num[i]%5==0)
			{
				
	         int cnt3 = temp.length() - temp.replaceAll("3", "").length();
			 int cnt5 = temp.length() - temp.replaceAll("5", "").length();	
				
			 if(num[i]%3==0 && num[i]!=3 )
				 arr[i]= arr[i]+"Fizz";
			 
			 for(int j=0;j<cnt3;j++)
			     arr[i] = arr[i]+"Fizz";
			 
			 if(num[i]%5==0 && num[i]!=5)
				 arr[i]= arr[i] + "Buzz";
			 
			 for(int j=0;j<cnt5;j++)
				  arr[i] = arr[i]+"Buzz";
			 
			}
			
			
			else 
				arr[i]= Integer.toString(num[i]);
			System.out.println(num[i]+" " +arr[i]);
			
		}
		
		
		
	}
	
	
}
