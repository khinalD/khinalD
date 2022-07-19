package KeyWORDS;

class Bookstore
{
	static
	{
		System.out.println("calling Bookstore static block method......");
	}
	public Bookstore()
	{
		System.out.println("BookStore construction calling.......");
	}
	static class myBookstore {
		
	public static void display() {
	
		System.out.println("Running display method.....");
	}
	public void run() {
		
		System.out.println("Running run method.....");
	}
	}
}

	public class StaticBlock {
	
	static {
	
		System.out.println("calling static method...");
	}
	public static void main(String[] args) {
		
		Bookstore b = new Bookstore();
		
		System.out.println("Running  main method.....");
		{
		System.out.println("Calling non-static method.....");
		}
		
		//Bookstore.myBookstore.display();
		Bookstore.myBookstore bl = new Bookstore.myBookstore();
		bl.run();
		
	}

}

