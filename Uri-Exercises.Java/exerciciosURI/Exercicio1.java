package exerciciosURI;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor do produto: ");
		float vProduto = input.nextFloat();
		
		System.out.println("Digite o total de acrescimo seguindo a tabela disponivel : ");
		System.out.println("C�digo %aumento\r\n" + 
				"Op��o 1 15%\r\n" + 
				"Op��o 3 20%\r\n" + 
				"Op��o 4 35%\r\n" + 
				"Op��o 8 40%\r\n");
		int codProduto = input.nextInt();
		
		
		switch(codProduto) {
		
		case 1:
			double vTotal1 = (vProduto * 15/100)+vProduto;
			System.out.println("O valor com acrecimo �: "+ vTotal1);
			break;
			
		case 3:
			double vTotal3 = (vProduto * 20/100)+vProduto;
			System.out.println("O valor com acrecimo �: "+ vTotal3);
			break;
			
		case 4:
			double vTotal4 = (vProduto * 35/100)+vProduto;
			System.out.println("O valor com acrecimo �: "+ vTotal4);
			break;
			
		case 8:
			double vTotal8 = (vProduto * 40/100)+vProduto;
			System.out.println("O valor com acrecimo �: "+ vTotal8);
			break;
		
		default:
			System.out.println("O numero digitado n�o corresponde a nenhum acrescimo! Tente novamente");
			break;
		}
		
	}

}
