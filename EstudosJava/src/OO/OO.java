package OO;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class OO {
	public static void main(String[] args) throws ParseException {
		/*Caneta caneta1 = new Caneta();
		
		caneta1.cor = "Preto";
		caneta1.ponta = 1.5f;
		caneta1.tampa = false;
		caneta1.rabistar();
		caneta1.status();
		
		Caneta caneta2 = new Caneta();
		caneta2.cor = "Azul";
		caneta2.ponta = 1.5f;
		caneta2.tampa = true;
		
		caneta2.rabistar();
		caneta2.status();
		caneta2.tampar();
		caneta2.rabistar();
		caneta2.status();*/
		
		
		Aluno aluno = new Aluno();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Nome do Aluno:");
		String nome = teclado.nextLine();		
		aluno.setNome(nome);
		System.out.println("Idade:");
		int idade = teclado.nextInt();
		aluno.setIdade(idade);
		System.out.println("Nome do Curso:");
		String curso = teclado.nextLine();
		aluno.setCurso(curso);
		System.out.println("Logradouro: ");
		String logr = teclado.nextLine();		
		System.out.println("Bairro: ");
		String bar = teclado.nextLine();	
		
		Endereco end = new Endereco(logr, bar);
		
		java.util.Date date = new SimpleDateFormat("MM/dd/yyyy").parse("26/04/1996");
		aluno.setDtnasc(date);
		
		aluno.setEndereco(end);
		
		
		aluno.getDtnasc();		
		aluno.listar();
		aluno.enderecolist();
		aluno.validarcurso();
		aluno.maioridade();
	}
}
