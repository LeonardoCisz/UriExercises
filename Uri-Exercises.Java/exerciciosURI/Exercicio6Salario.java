package exerciciosURI;
import java.util.Scanner;

public class Exercicio6Salario {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite em sequencia, o total de horas trabalhadas,\n o salario por hora e o total de dependentes");
		
		float horaTrab = input.nextFloat();
		float salarioHora = input.nextFloat();
		int numDepend = input.nextInt();
		double descontoINSS = 0;
		
		//SALARIO BRUTO
		double salarioBruto = horaTrab * salarioHora + (50*numDepend);
		System.out.println("O Salário bruto é de: "+salarioBruto);
		
		//DESCONTO INSS
		if(salarioBruto <= 1000) {
			descontoINSS = salarioBruto * (8.5/100);
		}else {
			descontoINSS = salarioBruto * (9/100);
		}
		
		System.out.printf("O desconto do INSS é de: " +descontoINSS);
	}
}
