package s00__assignmentModual2;

class Tringle
{
	    int s1=3;
	    int s2=4;
	    int s3=5;
}
public class QES__14 {
	public static void main (String[] args) {
		
		Tringle t1 = new Tringle();
		int perimeter=(t1.s1+t1.s2+t1.s3);
		System.out.println("perimeter :"+perimeter);
		
		int s1 = (perimeter/2);
		int ar=((((s1*(s1-t1.s1))*(s1-t1.s2))*(s1-t1.s3)));  
		int area =(int)Math.sqrt(ar);
		System.out.println("Area is : "+area);
	}


}
