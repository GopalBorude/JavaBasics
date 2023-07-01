package Constructor;

public class A {
	
	
	public A()
	{
		System.out.println("this non parameterise constructor");
	}
    public A(int a)
    {
    	System.out.println("this parameterise constructor");
    }
    public static void main(String[] args) {
		A a=new A();
		A a1=new A(5);
	}
}
