package s00__assignmentModual2;

class printn
{
	public void add(int n , char c)
	{
		int r = n+c;
		System.out.println("B1 :"+r);
	}
	
	public void add(char c , int n)
	{
		int r = c+n;
		System.out.println("B2 :"+r);
	}

	public void add(int n, int i) {
		{
			int r = n+i;
			System.out.println("B3 : "+r);
		}
		
	}
		
	}


public class QES__9 {
	
	public static void main(String[] args) {
		
		printn p = new printn();
		p.add(10, 40);
		p.add(40, 10);
		
}
}