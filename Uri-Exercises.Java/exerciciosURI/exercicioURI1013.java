package exerciciosURI;
import java.io.IOException;
import java.util.Scanner;
 

public class exercicioURI1013 {
 
    public static void main(String[] args) throws IOException {
    	Scanner input = new Scanner(System.in);
    	
    	int A = input.nextInt();
    	int B = input.nextInt();
    	int C = input.nextInt();
    	
    	int temp = A;
    	
    	if(A < B || A < C) {
    		if(B < C) {
    			temp = C;
    		}else
    			temp = B;
    	}
    	
    	System.out.println(temp + " eh o maior");
 
    }
 
}