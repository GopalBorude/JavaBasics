package eduBridge;

import java.util.Scanner;

public class Stringdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the srting ");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c!=' ') {
				System.out.println("the String"+str.substring(i));
			}
		}
		
	}

}
