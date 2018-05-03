package njni;

public class ramacoscos {
	   public static void main(String[] args){
		long n = Long.parseLong(args[0]);
		long a, b = 0;
		
		
		for (a=1;a<=n;a++)
			for (b=1;b<=n;b++){
				if ((a*a*a)+(b*b*b)==n) System.out.println(a + " " + b);
			}
		System.out.println(" ");
				/*for (c=1;c<=n;c++)
					for (d=1;d<=n;d++){
						if ((c*c*c)+(d*d*d)==n) //&& (a !=c && b != d))
							System.out.println(c + " " + d);
					}*/
				
				
		   
		   
		  }
}
		   
	        
		   
		

