package OO;

public class Caneta {
	public String modelo;
	public String cor;
	public float ponta;
	private int carga;
	public boolean tampa;
	
	public void status() {
		System.out.println("Caneta da cor:" + this.cor);
		System.out.println("Está tampada ?" + this.tampa);
	}
	
	public void rabistar() {
		if(this.tampa == true) {
			System.out.println("Não posso escrever");
		}else {
			System.out.println("Livre para escrever");
		}
	}
	public void destampada(){
		this.tampa = false;
	}
	public void tampar() {
		this.tampa = true;
	}
	
}
