package exerciciosURI;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class exercicioURI1014 {

	public static void main(String[] args) throws IOException {
    	
    	Scanner input = new Scanner(System.in);
    	input.useLocale(Locale.US);
    	
    	int totalKM = input.nextInt();
    	double totalGas = input.nextDouble();
    	
    	   	
    	
    	System.out.printf("%.3f km/l\n", totalKM  );
      
 
    }

}