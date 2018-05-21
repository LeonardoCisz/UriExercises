package exerciciosURI;


import java.io.IOException;
import java.util.Scanner;

public class exercicioURI1005 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		String a = input.nextLine();
		String b = input.nextLine();
		
		float notaA = Float.parseFloat(a);
		float notaB = Float.parseFloat(b);
		
		double mediaP = ((notaA*3.5) + (notaB*7.5)) / (7.5 + 3.5);
		
		System.out.printf("MEDIA = %.5f", mediaP);
		
	}
	

}
