package s00__assignmentModual2;

class Shapee{
	public void printshape() {
		System.out.println("This is shape");
	}
}

class Rectanglee extends Shapee{
	public void printrectangle() {
		System.out.println("This is rectanguler shape");
	}
}

class circle extends Shapee{
	public void printcircle() {
		System.out.println("This is  circuler shape");
	}
}

class Squaree extends Rectanglee{
	public void printSquare() {
		System.out.println("Square is rectangle");
	}
}
public class QES__22 {
	
	public static void main(String[] args) {
		
		Squaree s = new Squaree();
		s.printshape();
		s.printrectangle();
		
	}

}
