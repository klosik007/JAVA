package static_methods;

import java.util.*;

public class sm3 {
	public static int sumOfTwoDice(){
		Random rr = new Random();
		int x = rr.nextInt(6);
		int y = rr.nextInt(6);
		return x+y;
	}
	public static boolean winsPassBet(){
		int x1 = sumOfTwoDice();
		
		if ((x1==7) || (x1==11)) return true;
		if ((x1==2) || (x1==3) || (x1==12)) return false;
		
		int x2;
		do{
			x2 = sumOfTwoDice();
		}while ((x2==x1) || (x2==7));
		if (x2==x1) return true;
		else return false;
		
	}
		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);//reading module
		//int n = Integer.parseInt(args[0]);
		int n = sc.nextInt();
		boolean k;
		sc.close();
		
		for (int i=1; i<=n;i++){
			k = winsPassBet();
			System.out.println(k);
		}
	}

}
