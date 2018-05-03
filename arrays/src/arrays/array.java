package arrays;
//minesweeper
import java.util.ArrayList;
public class array {
	public static void main(String[] args){
		ArrayList<String> mylist = new ArrayList<String>();
		int m  = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		double p = Double.parseDouble(args[2]);
		
		boolean[][] mines =  new boolean[m+2][n+2];
		
		for (int i=0;i<=m;i++)
			for (int j=0;j<=n;j++){
				mines[i][j] = (Math.random() < p); //filling with boolean values with probability p
			}
		
		for (int i=1;i<=m;i++){ //important where this { is
			for (int j=1;j<=n;j++)
				if (mines[i][j]) // if true
				System.out.print("* ");
				else System.out.print(". ");
			System.out.println();
			}
		System.out.println();
		//solution
		
		int[][] sol = new int[m+2][n+2];
		
		for (int i=1;i<=m;i++)
			for (int j=1; j<=n;j++)
				for (int ii= i - 1;ii<=i+1; ii++) //neighbors
					for (int jj=j-1;jj<=j+1;jj++)
						if (mines[ii][jj]) sol[i][j]++; 
		
		//printing solution			
		for (int i=1;i<=m;i++){
			for (int j=1;j<=n;j++){
				if (mines[i][j]) System.out.print("* ");
				else System.out.print(sol[i][j]+ " "); 			
			}
			System.out.println();
				
		}
	}
}
		


