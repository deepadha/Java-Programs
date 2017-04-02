package welcome;

public class Arithmetic {

	public int a;
	public int b;
	public int c;
	public int d;
	public int e;

public void getdetails (int valuea, int valueb){
		a = valuea + valueb;
		b = valuea - valueb;
		c = valuea * valueb;
		d = valuea / valueb;
		e = valuea % valueb;
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arithmetic obj = new Arithmetic (10,5);
		Arithmetic obj = new Arithmetic ();
		obj.getdetails (11,5);
		System.out.println ("Addition:"+obj.a);
		System.out.println ("Subtraction:"+obj.b);
		System.out.println ("Multiplication:"+obj.c);
		System.out.println ("Division:"+obj.d);
		System.out.println ("Mod:"+obj.e);
		
	}
	}

