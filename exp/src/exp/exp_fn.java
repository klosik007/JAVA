package exp;

public class exp_fn {
	
public static long silnia(int a){
	if (a==0) return(1);
	else return(a*silnia(a-1));
	 	
	}
	public static void main(String[] args){
		
		double x=-2.71;
		double sum = 0.0;
		int n = 10;
		for (int i=1;i<=n;i++){
			long sil = silnia(i);
			sum +=(Math.pow(x, i)/sil);
		//System.out.println(sil);
		}
		System.out.print(sum+1);
	
	}
}
