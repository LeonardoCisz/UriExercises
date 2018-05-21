package exerciciosURI;


import java.io.IOException;
import java.util.Scanner;

public class exercicioURI1006 {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);

		String A = input.nextLine();
		String B = input.nextLine();
		String C = input.nextLine();
		
		double notaA = Double.parseDouble(A);
		double notaB = Double.parseDouble(B);
		double notaC = Double.parseDouble(C);

		double mediaP = ((notaA * 2) + (notaB * 3) + (notaC * 5)) / (2 + 3 + 5);

		String mediaF = String.format("MEDIA = %,.1f", mediaP);
		
		System.out.print(mediaF +"\n");
	}

}