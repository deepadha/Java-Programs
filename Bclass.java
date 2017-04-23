package welcome;

public class Bclass extends Aclass
{
Bclass()
{
	System.out.println("B extended");
}
public static void main(String[] args) {
	Bclass B = new Bclass ();
	System.out.println("method of B");
}
}
