import java.util.*;
import java.io.*;

public class Polibus {//polibius
	public static void main(String[] args){
		String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V",
				"W","X","Y","Z"};
		Integer[] num ={11,12,13,14,15,21,22,23,24,24,25,31,32,33,34,35,41,42,43,44,45,51,52,53,54,55};
		
		//ArrayList<String> letter_s = new ArrayList<String>();
		
		//Scanner sc = new Scanner(System.in);
		//String text = sc.nextLine();
		String text="";
		String text2="";
		String result="";
		int place = 0; 
		int res = 0;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try{
			fin = new FileInputStream(args[0]);//wczytuje nazwe pliku
			fout = new FileOutputStream("wynik.txt");//okreslam nazwe pliku do zapisu
		}catch (FileNotFoundException e){
			System.out.println("No such file!");
			System.exit(-1);
		}
		//DataInputStream out = new DataInputStream(fin);
		DataOutputStream out = new DataOutputStream(fout);
		BufferedReader inbr = new BufferedReader(new InputStreamReader(fin));//przygotowanie do odczytu
		//BufferedReader inbw = new BufferedReader(new InputStreamReader());
		try{
			while ((text = inbr.readLine()) != null){//dopoki nie osiagne konca pliku...
				for (int i=0;i<text.length();i++){//...sprawdzam kazd¹ linie pliku i ja obrabiam
			//text2="";
			text2 = text.substring(i, i+1);
			//System.out.println(text2);
			for (String ch : letters){
				//System.out.print(ch);
				res = text2.compareTo(ch);
				if (res == 0){
					place = Arrays.binarySearch(letters, ch);
					result = result + Integer.toString(num[place]) + " ";
				}
			}
		}		
				out.writeBytes(result+"\r\n");// \r\n - nowa linia
				//System.out.println(result);//drukuje wynik
				result ="";
				//System.out.println();
	}
		}catch(IOException e) {
			System.out.println("I/O failure!");
		}
		
	}
}	


