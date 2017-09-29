package OO;
public class OO {
	public static void main(String[] args) {
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
		
		aluno.setNome("Luis");
		aluno.setIdade(18);
		aluno.setCurso("Sistema da Informação");
		
				
		aluno.listar();
		aluno.validarcurso();
		aluno.maioridade();
	}
}
