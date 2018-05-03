package magic_square;

public class m_s {
	public static void main(String[] args){
		
		int N = Integer.parseInt(args[0]);
		
		int[][] square = new int[N+2][N+2];
		//int[] integers = new int[N*N];
		
		if (N%2 == 0) throw new RuntimeException("N must be odd");
		
		int m = N-1;
		int n = N/2;
		square[m][n]= 1;
		
		for (int i=2;i<=N*N;i++){
		}
			
		/*	for (int i=1; i<=N;i++)
				for (int j=1;j<=N;j++)
					for (int ii= i-1;ii<=i+1; ii++) //neighbors
						for (int jj=j-1;jj<=j+1;jj++)*/
							
							
			}
				
			
			
		
	}

