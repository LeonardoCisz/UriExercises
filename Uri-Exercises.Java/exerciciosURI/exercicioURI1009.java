package exerciciosURI;


import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
	
public class exercicioURI1009 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		
		String nome = input.nextLine();
		double salariof = input.nextDouble();
		double totalV = input.nextDouble();
		
		double totalvenda = ((totalV*15)/100);
		double salariofinal = salariof + totalvenda;
		
		System.out.printf("TOTAL = R$ %.2f\n",salariofinal);
		
	}		

}
