
public class Print5 {

	public static void main(String[] args) {

		int lines = 5;
		int mid = (lines/2)+1;
		int starCount = 1;
		int spaceCount = lines - 1;
		for (int j = 1; j <= lines; j++) {
			for (int k = 1; k <= spaceCount; k++) {
					System.out.print(" ");
			}

			for (int i = 1; i <= starCount; i++) {
				
				System.out.print("*");
			}
			System.out.println();
			if(j<mid)
			{
			starCount = starCount+2;
			spaceCount--;
			}
			else
			{
				starCount= starCount-2;
				spaceCount++;
			}
		}

	}
	
	
}
