package exerciciosURI;
public class Exercicio4Impares {
	
	
	public static void main(String[] args) {
		int produto = 1;
		for (int i = 1; i < 16; i += 2) {
			produto = produto * i;
		}
		System.out.println("o produto de n�meros �mpares de 1 at� 15 �: " + produto);
	}

}
