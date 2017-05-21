package welcome;

public class Manager {

	static void method (Ap a2)
	{ 
		System.out.println(a2.i);
		a2.test();
	}
public static void main (String [] args)
{
	Ap a1=new Ap();
	Manager.method(a1);
}
}
