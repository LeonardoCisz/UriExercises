package exerciciosURI;


import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class exercicioURI1010 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);

		int peca1 = input.nextInt();
		int numpeca1 = input.nextInt();
		float valorpeca1 = input.nextFloat();
		int peca2 = input.nextInt();
		int numpeca2 = input.nextInt();
		float valorpeca2 = input.nextFloat();

		float valorpago = numpeca1 * valorpeca1;
		float valorpago2 = numpeca2 * valorpeca2;

		float valorTotal = valorpago + valorpago2;

		System.out.printf("VALOR A PAGAR: R$ %.2f\n" , valorTotal);

	}
}
