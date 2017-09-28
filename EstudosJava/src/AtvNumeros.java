import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
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
				
				int maiornumero = 0;
				int menornumero = 0;
				int media = 0;
				
				for(int j=0 ; j < lista.size(); j++) {
					int resultado = lista.get(j);		
					media += resultado;
										
					if(resultado > maiornumero) {
						maiornumero = resultado;
					}
					else if(menornumero < resultado){
						menornumero = resultado;
					}else if(resultado < menornumero) {
						menornumero = resultado;
					}
					
				}				
				media = media/lista.size();
								
				System.out.println("Maior:" + maiornumero);
				System.out.println("Menor:" + menornumero);
				System.out.println("Média:" + media);				
						
				System.exit(0);
			}else {
				lista.add(valor);				
			}			
		}		
		
		
	}				
		
}

