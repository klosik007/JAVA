package exp;

public class trig_fn {
	
	public static long silnia(int a){
		if (a==0) return(1);
		else return(a*silnia(a-1));
	}
	/*public static double is_even(int k){
		if (k%2==0) return(0);
		else return(1);
	}*/

	public static void main(String[] args){
		double x=3.14/2;
		double sum1 = 0.0; 
		double sum2 = 0.0;
		int n = 10;
		for (int i=3;i<=n;i+=4){
			long sil1 = silnia(i);
			sum1 -=(Math.pow(x, i)/sil1);
			System.out.println(sum1 + " ");
		}
		for (int i=1;i<=n;i+=4){
			long sil2 = silnia(i);
			sum2 +=(Math.pow(x, i)/sil2);
			System.out.println(sum2 + " ");
		//System.out.println(sil);
		}
		System.out.println(sum1+sum2);
		
		/*double x = Double.parseDouble(args[0]);

        // convert x to an angle between -2 PI and 2 PI
        x = x % (2 * Math.PI);

        // compute the Taylor series approximation
        double term = 1.0;      // ith term = x^i / i!
        double sum  = 0.0;      // sum of first i terms in taylor series

        for (int i = 1; term != 0.0; i++) {
            term *= (x / i);
            if (i % 4 == 1) sum += term;
            if (i % 4 == 3) sum -= term;
        }
        System.out.println(sum);*/
	}
}
