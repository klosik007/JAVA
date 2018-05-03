package classes;

import java.util.*;

class Statistics {
	private final int n;
	private double x;
	private double x2, sx, sd;
	private double[] l;
	
	public Statistics(int n){
		this.n = n;
	}
	
	public Statistics(double[] v){
		n = v.length;
		this.l = new double[n];
		
		for (int i=0; i<n; i++) this.l[i] = v[i];
		
		for (int i=0; i<n; i++){
			x2 += l[i]*l[i];
			sx += l[i];
			}
		for (int j=0;j<n;j++) sd += Math.pow((l[j] - (sx/n)), 2);
	}
	
	public void addPoints(){
		Scanner sc = new Scanner(System.in);
		double[] l = new double[n];
		for (int i=0; i<n; i++){
			x = sc.nextDouble();
			x2 += x*x;
			sx += x;
			l[i] = x;
			}
		for (int j=0;j<n;j++) sd += Math.pow((l[j] - (sx/n)), 2);
		sc.close();
	}
	
	
	public int numPoints(){
		return n;
		}
	
	public double mean(){
		return sx / n;
	}
	
	
	public double variance(){
		return (n*x2 - sx) / (n*(n-1));
	}
	
	public double standardDeviation(){
		return sd / (n-1);
	}
	
	public static void main(String[] args){
		Statistics st = new Statistics(5);
		
		st.addPoints();
		System.out.println("Mean: " + st.mean());
		System.out.println("Variance "+ st.variance());
		System.out.println("Standard deviation " + st.standardDeviation());
		
		double[] x = {8,56,54,5,6};
		Statistics st2 = new Statistics(x);
		System.out.println("Mean: " + st2.mean());
		System.out.println("Variance "+ st2.variance());
		System.out.println("Standard deviation " + st2.standardDeviation());
		
		
	}
}

