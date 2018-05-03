package recursion;

public class binary {
	public static String mystery(String s) {
	    int n = s.length();
	    if (n <= 1) return s;
	    String a = s.substring(0, n/2);
	    String b = s.substring(n/2, n);
	    return mystery(b) + mystery(a);
	}
	public static void main(String[] args){
		
	int n = Integer.parseInt(args[0]);	
	String ss="";
	while (n/2!=0){
		int p = n%2;
		if (p==0) {ss=ss+"0"; /*System.out.print(ss);*/}
		else {ss=ss+"1";/*System.out.print(ss);*/}
		n = n/2;
		if (n/2==0) ss=ss+"1";/*System.out.print("1");*/
	}
	System.out.println(mystery(ss));
}
	
}