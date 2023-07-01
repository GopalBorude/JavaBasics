package inheritannce1;

public class B  extends sin{
	
	public void m3()
	{
		System.out.println("this is m3 method ");
	}
	
	public static void main(String[] args) {
		
		B c=new B();
		c.m1();
		c.m2();
		c.m3();
	}

	

}
