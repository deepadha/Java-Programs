package welcome;

public class Cclass extends Bclass{
	int i;
	String k = new String ();
 Cclass ()
 {
	 this("Deepa");
	 System.out.println("Cclass extended");
	 
 }
 Cclass(int i)
 {
	 this.i=i;
	 System.out.println("Cclass int: " +i); 
 }
 Cclass (String j)
 {
	 this(25);
	 k=j;
	 System.out.println("Cclass String: " +j); 
 } 
 public static void main(String[] args){
	 Cclass C= new Cclass();
	 System.out.println("Cclass extended method");
	 System.out.println(C.i);
	 System.out.println(C.k);
 }
}
