package MeetPratice;

public class secoundMaxnumber {

	public static void main(String[] args) {
		int [] num= {12,20,35,45,2};
		 int max=Integer.MIN_VALUE;
		 int secoundMax=Integer.MIN_VALUE;
		  for(int numbers:num)
		  {
			  if(numbers> max)
			  {
				  secoundMax=max;
				  max=numbers;
				  
			  }
			  else if(numbers > secoundMax && numbers<max)
			  {
				  secoundMax=numbers;
				  
			  }
			  
			  
		  }
		  System.out.println("the secound number is "+secoundMax);
	}
}
