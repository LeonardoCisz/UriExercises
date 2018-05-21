package exerciciosURI;
import java.util.Scanner;

public class Exercicio5Contagem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite dois numeros para a contagem: ");
		int numero1 = input.nextInt();
		int numero2 = input.nextInt();

		while (numero1 != numero2 + 1) {
			numero1 = numero1 + 1;
			System.out.println(numero1 - 1);
		}
	}

}
