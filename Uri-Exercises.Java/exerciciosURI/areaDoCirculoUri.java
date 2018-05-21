package exerciciosURI;


import java.io.IOException;
import java.util.Scanner;

public class areaDoCirculoUri {

	public static void main(String[] args) throws IOException {
		
		double PI = 3.14159d;
		
		Scanner input = new Scanner(System.in);
		String x = input.nextLine();

		double raio = Double.parseDouble(x);
		double a = (PI * (raio * raio));

		System.out.printf("A=%.4f", a);
		System.out.println();
	}

}