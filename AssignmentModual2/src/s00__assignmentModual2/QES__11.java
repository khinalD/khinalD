package s00__assignmentModual2;

class parent
{
	public void parent()
	{
		System.out.println("This is parent class");
	}
}
class child extends parent
{
	public void child()
	{
		System.out.println("This is child class");
	}
}

public class QES__11 {
	
	public static void main(String[] args) {
		
		parent p = new parent();
		child c  = new child();
		p.parent();
		c.child();
		
	}

}
