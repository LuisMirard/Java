package Logica;

public class MetodosString {
	public static void main (String [] agrs) {
		
		String frase = "TESTE;STRING";
		String frase1 = "        COMESPACO";
		System.out.println(frase.substring(2, 4));
		System.out.println(frase.split(";"));
		System.out.println(frase1.trim());
		System.out.println(frase.endsWith("T"));
		System.out.println(frase.equals("TESTE;STRING"));
		System.out.println(frase.concat("MAIS PALAVRA"));
		System.out.println(frase.replace("T", "L"));
	}

}
