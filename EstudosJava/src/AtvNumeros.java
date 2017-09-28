import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AtvNumeros {

	public static void main (String[] args) {
		
		System.out.println("Para finalizar o programa digite valor 0");		
		Scanner teclado = new Scanner(System.in);
				
		ArrayList<Integer> lista = new ArrayList<Integer>();
			
		for(int i=1; i != 0; i++) {			
			System.out.println("Informe um número:");
			int valor = teclado.nextInt();
						
			if(valor == 0){
				System.out.println("Programa Finalizado!");
				System.out.println(lista);				
				System.exit(0);
			}else {
				lista.add(valor);				
			}			
		}		
		
		
	}				
		
}

