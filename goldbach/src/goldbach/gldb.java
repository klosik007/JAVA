package goldbach;

public class gldb {

	public static void main(String[] args){
		int N = Integer.parseInt(args[0]);
		//int a[][] = new a[3][3];
		
		for (int i=1;i<N;i++)
			for (int j=1; j < N; j++){
				if ((i+j == N) && (i%2==1) && (j%2==1)) System.out.println(i + " " + j);
			}
		
	}
}
