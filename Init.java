package welcome;

public class Init {
	static int a;
	int b=10;
	
	public static void main(String[] args) {
		System.out.println(a);
		Init obj = new Init ();
		System.out.println("first value of B from class: " + obj.b);
		obj.b=20;
		System.out.println("initialized B in method: " + obj.b);
		Init obj1 = new Init ();
		obj1.b=30;
		System.out.println("B refered using another object: " + obj1.b);
		int a=50;
		System.out.println("Variable A refered from class: " + Init.a);
		System.out.println("Variable A refered from method: " + a);
		int c=100;
		System.out.println("Local variable C: " + c);
	}
}
