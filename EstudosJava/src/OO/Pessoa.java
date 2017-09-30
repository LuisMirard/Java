package OO;

public abstract class Pessoa {
	
	private String nome;
	private int idade;
	private String sexo;
	private String mae;
	private float cpf;
	
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
	public String getMae() {
		return mae;
	}
	public void setMae(String mae) {
		this.mae = mae;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}	
	public float getCpf() {
		return cpf;
	}
	public void setCpf(float cpf) {
		this.cpf = cpf;
	}
	
	public abstract void validaridade();
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", mae=" + mae + ", cpf=" + cpf + "]";
	}
	
	
	
}
