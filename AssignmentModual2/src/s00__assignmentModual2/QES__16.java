package s00__assignmentModual2;

abstract class Parent1 {
	
	public abstract void message();
}

class Subclass1 extends Parent1{
	@Override
	public void message() {
		
	System.out.println("This is frist subclass 1");
	}
}

class Subclass2 extends Parent1 {
	
	@Override
	public void message() {
		
		System.out.println("This is second subclass 2");
	}
}
public class QES__16 {
	
	public static void main(String[] args) {
		
		Subclass1 s1 = new Subclass1();
		s1.message();
		
		Subclass2 s2 = new Subclass2();
		s2.message();
		
		
	}

}
