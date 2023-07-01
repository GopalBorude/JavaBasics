package Collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class B {

	public static void main(String[] args) {
		Set<Integer> al=new HashSet<>();
		  al.add(10);
		  al.add(20);
		  al.add(30);
		  System.out.println(al);
		  Iterator<Integer> itr=al.iterator();
		  while(itr.hasNext()) {
			  int i=itr.next();
			  System.out.println(i);
		  }
		  
		
		

	}

}
