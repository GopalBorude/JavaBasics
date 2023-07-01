package Collection1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class A {

	public static void main(String[] args) {
		 List<String> sb=new ArrayList<>();
		 sb.add("ram");
		 sb.add("Doctor");
		 sb.add("Star");
		 sb.add("ram");
		 sb.remove(1);
		
		 
		 
		 System.out.println(sb);
		 
		 
		 Set<String> s1=new LinkedHashSet<>();
		  s1.addAll(sb);
		  System.out.println(s1);
		 

	}

}
