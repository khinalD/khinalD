package s00__assignmentModual2;

import java.util.Scanner;

abstract class Shape2{

	public abstract void RectangleArea1(double lentgh , double width);
	public abstract void SquareArea1(double side);
	public abstract void CircleArea1 (double redius);

}
class Area extends Shape2{

    public void RectangleArea1(double lenght, double width) {
        System.out.println( lenght*width);
 }

    public void SquareArea1(double side) {
        System.out.println(side);
      
    }

    public void CircleArea1(double radius) {
        System.out.println(radius);
       
    }
}

public class QES__20 {
	
	public static void main(String[] args) {
		
			Area a = new Area();
	        Scanner in = new Scanner(System.in);

	        System.out.print("Entrer length for rectangle: ");
	        double length = in.nextDouble();
	        System.out.print("Entrer breadth for rectangle: ");
	        double bredth = in.nextDouble();
	        a.RectangleArea1(length, bredth);

	        System.out.print("Entrer breadth for square: ");
	        double side = in.nextDouble();
	        a.SquareArea1(side);

	        System.out.print("Entrer breadth for circle: ");
	        double radius = in.nextDouble();
	        a.CircleArea1(radius);
	        }
	}


