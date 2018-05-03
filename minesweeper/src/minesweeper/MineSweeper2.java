package minesweeper;

import java.util.Random;
import java.util.Scanner;
/*
 * another variant of minesweeper
 * with separated and extended classes
 * next step: javafx
 * 
 */
class Board {
	 public int m; 
	 public int n; //width and height of board, coordinates m and n
	 public double p; //probability of bomb existence
	 public boolean[][] mines; //board array: true - mine is on, false - mine is off
	 public int[][] sol; //array for printing solution
	 public String[][] dots;//array of dots, then for showing situation step by step
	 public final static String dot = ". ";
}
 class CreateBoardByUser extends Board{
	 public CreateBoardByUser (int m, int n, int hmmines){// constructor
			this.m = m;
			this.n = n;
			mines = new boolean[m+2][n+2];
			dots  = new String[m+2][n+2];
			
			for (int i=0;i<m;i++)
				for (int j=0;j<n;j++){
					mines[i][j] = false;
					dots[i][j] = dot;// fill all values false
				}
			Random rr = new Random();
			int x; 
			int	y;
			for (int i = 0;i < hmmines;i++){
				x = rr.nextInt(m);//shuffle position of each bomb
				y = rr.nextInt(n);
				mines[x][y] = true;//plant a bomb
			}		
	 }
}
 
 class CreateBoardByProb extends Board{
	 public CreateBoardByProb(int m, int n, double p){
			this.m = m;
			this.n = n;
			this.p = p;
			mines = new boolean[m+2][n+2];
			dots  = new String[m+2][n+2];
			for (int i=0;i<m;i++)
				for (int j=0;j<n;j++){
					mines[i][j] = (Math.random() < p); //filling boolean values with probability p
					dots[i][j] = dot;
				}
		}
 }
 
	class ManageInterface extends Board{
		 
		public void fillSolution(){
				sol = new int[m+2][n+2];
				for (int i=1;i<=m;i++)
					for (int j=1; j<=n;j++)
						for (int ii=i-1;ii<=i+1; ii++) //neighbors
							for (int jj=j-1;jj<=j+1;jj++)
								if (mines[ii][jj]) sol[i][j]++; 
			}
		 
		public void printSolution(){
				for (int i=0;i<m;i++){
					for (int j=0;j<n;j++){
						if (mines[i][j]) System.out.print("* ");
						else System.out.print(sol[i][j]+ " "); 			
						}
					System.out.println();
				}
			}
		 
		public void printDots(){
				for (int i=0;i<m;i++){
					for (int j=0;j<n;j++){
						System.out.print(dots[i][j]);
						}
					System.out.println();
					}
			}
		
		public double difficultyLevel(int df){
			if (df == 0) return p = 0.25;//0 - low difficulty level
			if (df == 1) return p = 0.5;//1 - middle  difficulty. level
			else return p = 0.75;	//2 - high difficulty level
		}
		
		public boolean chooseTile(int m, int n){
				if (mines[m][n]){ System.out.println("Game over!"); 
				printSolution();
				return true;}
				else {
					dots[m][n] = Integer.toString(sol[m][n]);
					printDots();
				}
				return false;		
	 }
		public void printInterface(){
				System.out.println("MINESWEEPER");
				System.out.println("CHOOSE GAME MODE");
				System.out.println("1 - Number of bombs and boardsize defined by player");
				System.out.println("2 - Difficulty and boardsize defined in app");
				System.out.println("0 - quit");
			} 
		
		void chooseCase(){
			MineSweeper ms = new MineSweeper();
			Scanner sc = new Scanner(System.in);
			
			try{
				int c = sc.nextInt();
				switch (c){
					case 0: System.exit(0);
							break;
					case 1: System.out.println("How many bombs, width and height of board");
							int mhm = sc.nextInt();
							int mm = sc.nextInt(); 
							int mn = sc.nextInt();
							int cm; 
							int	cn;
							CreateBoardByUser ms1 = new CreateBoardByUser(mm, mn , mhm);
							fillSolution();
							do{
								System.out.println("Type coordinates of tile");
								cm = sc.nextInt();
								cn = sc.nextInt();
								} while (chooseTile(cm, cn));
							break;
									
					case 2: System.out.println("Type width and height of board");
							int m2 = sc.nextInt();
							int n2 = sc.nextInt(); 
							System.out.println("Choose difficulty 0 - low, 1 - mid, 2- high diff.");
							int dif = sc.nextInt();
							ms.difficultyLevel(dif);
							CreateBoardByProb ms2 = new CreateBoardByProb(m2, n2 , p);
							fillSolution();
							do{
								System.out.println("Type coordinates of tile");
								cm = sc.nextInt();
								cn = sc.nextInt();
								} while (chooseTile(cm, cn));
							break;
					default: System.out.println("Wrong choice!");
					sc.close();
				}
			}catch (Exception e){
				System.out.println("Error!");
				System.exit(0);
			}
			
		}
		
 public static void main(String[] args){
		ManageInterface board = new ManageInterface();	
			board.printInterface();
			board.chooseCase();
 	}
 }