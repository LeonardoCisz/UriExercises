package exerciciosURI;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class exercicioURI1015 {
 
    public static void main(String[] args) throws IOException {
    	Scanner input = new Scanner(System.in);
    	input.useLocale(Locale.US);
    	
    	double x1 = input.nextFloat();
    	double y1 = input.nextFloat();
    	
    	double x2 = input.nextFloat();
    	double y2 = input.nextFloat();	
    	
    	double dist = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    	
    	System.out.printf("%.4f\n", dist);

    	
      
    }
 
}