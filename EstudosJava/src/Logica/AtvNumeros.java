package Logica;
import java.util.ArrayList;
import java.util.Scanner;

public class AtvNumeros {

	private static Scanner teclado;

	public static void main (String[] args) {
		
		System.out.println("Para finalizar o programa digite valor 0");		
		teclado = new Scanner(System.in);
				
		ArrayList<Integer> lista = new ArrayList<Integer>();
			
		int i= 1;
		while (i != 0) {			
			System.out.println("Informe um número:");
			int valor = teclado.nextInt();
						
			if(valor == 0){
				System.out.println("Programa Finalizado!");
				System.out.println(lista);
				
				int maiornumero = 0;
				int menornumero = 0;
				int media = 0;
						
				for (Integer j : lista) {  
					media += j;
										
					if(j > maiornumero) {
						maiornumero = j;
					}
					if(menornumero < j ){
						menornumero = j;
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
			i++;
		}		
		
		
	}				
		
}

