package OO;

public class Endereco {
	private String logradouro;
	private String bairro;
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	public Endereco(String log, String bai){
		this.logradouro = log;
		this.bairro = bai;				
	}
	
}
