package recursion;
//import java.util.*;
/*Permutations. Write a program Permutations.java that take an integer command-line argument n 
 * and prints all n! permutations of the n letters starting at a (assume that n is no greater than 26). 
 * A permutation of n elements is one of the n! possible orderings of the elements. As an example, 
 * when n = 3 you should get the following output (but do not worry about the order in which you enumerate them):*/
public class permutations {

    // print n! permutation of the characters of the string s (in order)
    public  static void perm1(String s) { perm1("", s); }
    private static void perm1(String prefix, String s) {
        int n = s.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
               perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, n));
        }

    }

    // print n! permutation of the elements of array a (not in order)
    public static void perm2(String s) {
        int n = s.length();
        char[] a = new char[n];
        for (int i = 0; i < n; i++)
            a[i] = s.charAt(i);
        perm2(a, n);
    }

    private static void perm2(char[] a, int n) {
        if (n == 1) {
            System.out.println(a);
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(a, i, n-1);
            perm2(a, n-1);
            swap(a, i, n-1);
        }
    }  

    // swap the characters at indices i and j
    private static void swap(char[] a, int i, int j) {
        char c = a[i];
        a[i] = a[j];
        a[j] = c;
    }



    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String elements = alphabet.substring(0, n);
        perm1(elements);
        System.out.println();
        perm2(elements);
    }
}
/*public class permutations {
	
	public static int fraction(int n){
		if (n==0) return 1;
		else return (n*fraction(n-1));
	}
	
	public static void main(String[] args){
		String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l"
				,"m","n","o","p","r","s", "t", "u", "w", "x", "y", "z" };
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		String[] words = new String[n];
		int hm = fraction(n);
		int licznik=0;
		for (int i=0;i<n;i++){
			words[i]=letters[i];
		}
		
		Random mm = new Random();
		for (int i=0;i<hm;i++){
			
		}
		
		
		
		
	}

}*/
