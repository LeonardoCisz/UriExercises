package exerciciosURI;
import java.io.IOException;
import java.util.Scanner;

public class exercicioURI1114 {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);

		int senha = 2002;
		int testeSenha = input.nextInt();

		while (senha != testeSenha) {
			if (senha == testeSenha) {
				System.out.println("Acesso Permitido");
			} else {
				System.out.println("Senha Invalida");
				testeSenha = input.nextInt();
			}System.out.println("Acesso Permitido");
		}
	}
}