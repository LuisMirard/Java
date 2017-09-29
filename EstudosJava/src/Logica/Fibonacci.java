import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int quantidade = 0;
		int count = 0;
		int v1 = 1;
		int v2 = 1;
		int v3 = 0;
		
		System.out.println("Informe quantidade de nº para gerar a sequencia:");
		quantidade = teclado.nextInt();
		
		while(count != quantidade){
			v3 = v1 + v2;				
			if(count == 0){
				System.out.println(v1);
				System.out.println(v2);
				System.out.println(v3);
			}else{
				System.out.println(v3);
			}
			v1 = v2;
			v2 = v3;
			
			count++;
		}
		
		
	}
}
