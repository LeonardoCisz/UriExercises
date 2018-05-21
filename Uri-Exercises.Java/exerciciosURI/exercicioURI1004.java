package exerciciosURI;


import java.io.IOException;
import java.util.Scanner;

public class exercicioURI1004 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		String A = input.nextLine();
		String B = input.nextLine();
		
		int A2 = Integer.parseInt(A);
		int B2 = Integer.parseInt(B);
		
		int prod = A2 * B2;
		
		System.out.println("PROD = "+prod);

	}

}
