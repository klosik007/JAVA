package static_methods;


public class sm {
	public static boolean areCollinear(int x1, int y1, int x2, int y2, int x3, int y3){
		double a1, a2/*, b*/ = 0;
		
		a1 = (y1-y2)/(x1-x2);
		a2 = (y2-y3)/(x2-x3);
		if (a1==a2){ 
			//b = y1-a1*x1;
			return true;
		}else return false;
	}
	public static void main(String[] args){
		System.out.print(areCollinear(0,0,1,1,2,2));
	}

}
