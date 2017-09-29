package Logica;
import java.util.Scanner;

public class Inverter {
	 private static Scanner teclado;

	 public static void main (String[] args) {
		 
		 String valor;		 
		 int count = 0;
		 int maximo = 0;
		 teclado = new  Scanner(System.in);
		 
		 System.out.println("Informe sua frase: ");
		 valor = teclado.nextLine();
		 
		 maximo = valor.length() - 1;		 
		 char invertido[] = new char[maximo];
		 
		 while(valor.length() > count) {
			 System.out.print(valor.charAt(maximo));			 
			 count++;
			 maximo--;
		 }
		 
	 }
}
