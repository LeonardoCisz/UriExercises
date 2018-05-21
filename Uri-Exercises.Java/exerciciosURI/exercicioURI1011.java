package exerciciosURI;


import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class exercicioURI1011 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);

		double PI = 3.14159d;

		double numero = Double.parseDouble(input.nextLine());
		

		double volume =  (4/3.0d)*PI*numero*numero*numero;
		
		System.out.printf("Volume = %.3f ", volume);
		System.out.println();

	}

}
