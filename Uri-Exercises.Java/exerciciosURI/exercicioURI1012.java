package exerciciosURI;

import java.io.IOException;
import java.util.Scanner;

public class exercicioURI1012 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		Double A = input.nextDouble();
		Double B = input.nextDouble();
		Double C = input.nextDouble();

		double triangulo = (A * C) / 2;
		double circulo = 3.14159 * (C * C);
		double trapezio = C * ((A + B) / 2);
		double quadrado = (B * B);
		double retangulo = (A * B);

		System.out.printf("TRIANGULO: %.3f\n", triangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f\n", retangulo);
	}

}
