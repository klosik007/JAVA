package classes;

 class A {
	A(){System.out.println("Inside A");}
	}
 class B{
	 B(){System.out.println("Inside B");}
 }
 
 class C extends A{
	 B b = new B();
	 
	 public static void main(String[] args){
		 C c = new C();
		 
	 }
 }


 

