package exerciciosURI;


import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class exercicioURI1008 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);

		int numero = input.nextInt();
		int horaTrab = input.nextInt();
		float vHora = input.nextFloat();
		
		//float salarioFun = horaTrab * vHora;

		System.out.printf("NUMBER = %d\n", numero);
		System.out.printf("SALARY = U$ %.2f\n", horaTrab * vHora);

	}

}
