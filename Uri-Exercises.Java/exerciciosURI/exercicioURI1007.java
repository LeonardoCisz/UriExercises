package exerciciosURI;


import java.io.IOException;
import java.util.Scanner;

public class exercicioURI1007 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		String a = input.nextLine();
		String b = input.nextLine();
		String c = input.nextLine();
		String d = input.nextLine();
		
		int numA = Integer.parseInt(a);
		int numB = Integer.parseInt(b);
		int numC = Integer.parseInt(c);
		int numD = Integer.parseInt(d);
		
		int dif = ((numA * numB) - (numC * numD));
		
		System.out.println("DIFERENCA = " + dif);
	}

}
