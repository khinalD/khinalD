
public class ArrayMatrics {
	
	public static void main(String[] args) {
		
		int a[] [] = {{10,20,30}, {20,30,40}, {50,60,70}};
		{
			for(int i=0; i<3; i++) {
				
				for (int j=0; j<3; j++)
				
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
		System.out.println("*****************");
		
	    int b[] [] = {{10,20,30}, {30,40,50},{60,70,80}};
		
		for (int i=0; i<3; i++) {
			
			for (int j=0; j<3; j++)
			{
				System.out.print(b[i][j]+" ");
			}
			
			System.out.println();
		}
		
		System.out.println("**********");
		
		int c [] [] = {{10,20,30},{40,50,60},{70,80,90}};
		int d [] [] = {{1,2,3},{4,5,6},{7,8,9}};
		
            for (int i=0; i<3; i++) {
			
			for (int j=0; j<3; j++)
			{
				System.out.print(c[i][j]+d[i][j] +" ");
			}
			
			System.out.println();
				
			
			}
		}
		
}




