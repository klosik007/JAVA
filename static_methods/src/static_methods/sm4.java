package static_methods;

import java.util.Arrays;
import java.util.Scanner;

public class sm4 {
	public static boolean leapYear(int y){
		//test if year is leap
		boolean isYearLeap;
		
		isYearLeap = (y % 4 == 0);
		isYearLeap = isYearLeap && (y % 100 != 0);
		isYearLeap = isYearLeap || (y%400==0);
		
		return isYearLeap;
	}
	public static int firstDayOfMonth(int m, int y){
		//when the first day of month is 
		int y0 = y - (14 - m)/12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 = m + 12 * ((14-m) / 12) - 2;
		int d0 = (1 + x + 31*m0/12)%7;
		
		return d0;
	}
		
	public static void main(String[] args){
		String[] months = {" ", "January", "February", "March", "April", "May", "June", 
				"July", "August", "September", "October", "November", "December"};
		String[] days = {"Sun", "M", "Tu", "W", "Th", "F", "Sat"};
		int[][] week = new int[8][6];
		
		Scanner sc = new Scanner(System.in);//reading module
		int m = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		boolean leapYear = leapYear(y);
		int f = firstDayOfMonth(m, y);

		int md=0;;//month of year and days in month
		switch (m){
		case 1: md = 31;
			break;
		case 2: if (leapYear) md = 29;
				else md = 28;	
			break;
		case 3: md = 31;
			break;
		case 4: md = 30;
			break;
		case 5: md = 31;
			break;
		case 6: md = 30;
			break;
		case 7: md = 31;
			break;
		case 8: md = 31;
			break;
		case 9: md = 30;
			break;
		case 10: md = 31;
			break;
		case 11: md = 30;
			break;
		case 12: md = 31;
			break;
		default: System.out.print("Invalid month");
			break;
		}
		
		System.out.println(months[m]+ " " + y);
		System.out.println(Arrays.toString(days));
		
		int w = 0;
		week[f][w] = 1;
		int ii = 1;
		do{
			f++;
			if (f==7) {w++; f=0;}
			ii++; 
			week[f][w]=ii;
		}while ((ii<md) && (f<=8) && (w<=6));
	
		for (int j= 0;j<6;j++)
			for (int i=0;i<7;i++){
		System.out.print(week[i][j] + "  ");
			if (i==6) System.out.println();
			}		
		}
		
	}
