package string;

import java.util.Arrays;

public class Anargam {
	
	public static void main(String[] args) {
		
		String x = "keep";
		String y = "peek";
		
		char a[] = x.toCharArray();
		char b[] = y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		Boolean result = Arrays.equals(a, b);
		
		if(result == true)
		{
			System.out.println("String are Anargam");
		}
		else
		{
			System.out.println("String are not Anargram");
		}
	}
	
}

