package s00__assignmentModual2;

class shape
{
	public void getarea()
	{
	}
	
}
class square extends shape
{
	 @Override
	 public void getarea() {
		 int s= 14;
		 int area_square = s*s;
		 System.out.println("Area of square is : "+area_square);
				
	 }
}

class rectangle extends shape
{
	 @Override
	 public void getarea() {
		 double length = 4.5;
		 double breadth= 7.0;
		 double area = length*breadth;
		 System.out.println("Area of rectangle is :"+area);
	 }
}

public class QES__10 {
	
	public static void main(String[] args) {
		
		square s = new square();
		s.getarea();
		rectangle r  = new rectangle();
		r.getarea();
	}

}
