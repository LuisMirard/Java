package OO;

public class Aluno {

	private String nome;
	private int idade;
	private String curso;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}	
		
	public void listar() {
		System.out.println("Aluno:" + this.nome + " de idade:" + this.idade + " estuda o curso:" + this.curso);
	}
	public void maioridade(){
		if(this.idade > 18) {
			System.out.println("Apto a mátricular.");
		}else if(this.idade == 16) {
			System.out.println("Mátricular somente com autorização.");
		}else {
			System.out.println("Não e permitido.");
		}		
	}
	public void validarcurso(){
		if(this.curso == "Sistema da Inforação") {
			System.out.println("Curso valido!");
		}else {
			System.out.println("Curso invalido!");
		}
	}
	
}
