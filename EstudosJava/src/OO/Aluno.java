package OO;

import java.util.Date;
public class Aluno {

	private Endereco endereco;	
	private String nome;
	private int idade;
	private String curso;
	private Date dtnasc;	
	
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
	public Date getDtnasc() {
		return dtnasc;
	}
	public void setDtnasc(Date dtnasc) {
		this.dtnasc = dtnasc;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void enderecolist() {
		System.out.println(this.endereco.getLogradouro() + "-" + this.getEndereco().getBairro());
	}
	
	public void listar() {
		System.out.println("Aluno:" + this.nome + " de idade:" + this.idade + "anos nascido em:" + this.dtnasc + " estuda o curso:" + this.curso);
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
