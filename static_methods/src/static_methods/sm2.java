package static_methods;

import java.util.Arrays;

public class sm2 {
	public static String[] reversel(String[] text){
		int n = text.length;
		String[] tp = new String[n];
		tp= text;

		for (int i=0;i<n/2;i++){
			String temp = tp[n-i-1];
			
			tp[n-i-1]= tp[i];
			tp[i] = temp;
		}
		return tp;		
}
	
	public static void main(String[] args){
		String[] s1 =
			{"Do domu", "nie smiga", "do domu", "gnat"};
		String[] s2 = reversel(s1);
		System.out.println(Arrays.toString(s1));
		System.out.println(Arrays.toString(s2));
		
	}

}
