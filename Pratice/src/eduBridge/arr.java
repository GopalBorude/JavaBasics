package eduBridge;

public class arr {

	public static void main(String[] args) {
	int intArray[] = {0,1,2,3,4,5,6,7,8,9};
		int cloneArray[] = intArray.clone();
		System.out.println(intArray); 
		System.out.println(cloneArray);
		System.out.println(intArray==cloneArray);
		for(int i=0;i<cloneArray.length;i++)
		{
			System.out.println(cloneArray[i]);
		
		
		
	/*	
		
		int intArray[][] = {{1,2,3,4,5},{6,7,8,9,10}};
		int cloneArray[][] = intArray.clone();
		
		System.out.println(intArray[0]); 
		System.out.println(cloneArray[0]);
		System.out.println(intArray[1] == cloneArray[1]);*/
	}

}
}


/*In a single-dimensional array, a deep copy creates the clones of the original elements or reference elements.
 * 
 * 
• In a multi-dimensional array, a shallow copy is created, which means both arrays are pointing to the same 
memory address*/

