package s00__assignmentModual2;

import java.util.Scanner;

public class QES__28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value ");
		
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		if(n>=10)
		{
			for(int i=0; i>=10; i++)
			{
				System.out.println(n = (i));
			}
		}
			
			else 
			{
				System.out.println("Number shold be less than 10");
			}
		
		Scanner sc2 = new Scanner(System.in);
		int n1 = sc2.nextInt();
		if(n1<=40) 
		{
			for(int i=0; i<=40; i++)
			{
				System.out.println(n1 = (i));
			}
		
		}
		else
		{
			System.out.println("Number should be geaterthan 40");
		}
}

}



