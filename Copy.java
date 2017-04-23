package welcome;

public class Copy {
int i;
Copy()
{ 
	System.out.println("copy class");
}
public static void main(String[] args) {
	Copy c1 = new Copy ();
	c1.i=20;
	Copy c2 = new Copy ();
	c2.i=30;
	System.out.println("first print of c2:" +c2.i);
	Copy c3=c2;
	c3.i=40;
	System.out.println(c1.i);
	System.out.println(c2.i);
	System.out.println(c3.i);
}
}
