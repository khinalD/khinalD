package s00__assignmentModual2;

class printNumber
{
	public void add(int a , int b)
	{
		int h = a+b;
		System.out.println("r1 :"+h);
	}
	
	public void add(int a , int b , int c)
	{
		int h = a+b+c;
		System.out.println("r2 :"+h);
	}
	
	public void add(double a , int b)
	{
		double h = a+b;
		System.out.println("r3 :"+h);
	}
}

public class QES__8 {

	public static void main(String[] args) {
		
		printNumber p = new printNumber();
		p.add(10, 20);
		p.add(10, 20, 30);
		p.add(10.22, 20);
	}
}



