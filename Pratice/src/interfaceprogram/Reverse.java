package interfaceprogram;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the number");
	int no=sc.nextInt();
	int rev=0;
	while(no>0)
	{
		rev=(rev*10)+no%10;
		no=no/10;
		
	}
	System.out.println(rev);
	
	
	}

}
