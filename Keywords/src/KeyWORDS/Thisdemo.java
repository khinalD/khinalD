package KeyWORDS;

class car
{
	int a = 50;
	public void run()
	{
		System.out.println("Running car method.......");
	}
}
class bike extends car
{
	int a;
	bike(int a)
	{
		this.a=a;
	}
	public void run()
	{
		System.out.println("Runnning run method......");
	}	
	public void display()
	{
		System.out.println(a);
		System.out.println(super.a);
		this.run();
		super.run();
	}
	}


public class Thisdemo {
	
	public static void main(String[] args) {
		
		bike b = new bike(20);
		b.display();
		
	}

}
