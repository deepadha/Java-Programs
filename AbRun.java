package welcome;

public class AbRun extends Abstract {

		public void getname(){
		System.out.println("Deepa");	
		}
		static public void display()
		{
			System.out.println("Hello");
		}
		public static void main(String[] args) {
		AbRun a1=new AbRun();
		AbRun.display();
		a1.getname();
	    a1.getdetails();		
		}
	}


