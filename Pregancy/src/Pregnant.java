
public class Pregnant {
	public static void main(String[] args){
		int l =0;
	double x=0;
	double i=0,
		   j=0,
		   y=0,
		   z=0;
	int w1, w2;
	w1 = Integer.parseInt(args[0]);
	w2 = Integer.parseInt(args[1]);
	while (true){
		x = - 0.083333333333333333333333333333333333*l;
        y = x + w2;
        i = x + w1;
        z = (int)(5.0 * y);
        j = (int)(i + 6.0);
        l+=1;
        if (z - j == 0) break;
	 }
	 System.out.println(x + " "+ y + " "+ z + " "+ j + " "+ i);
	 System.out.println(Math.abs(x*12));
	}
}
