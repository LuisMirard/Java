package OO;

public class Professor extends Pessoa {

	private int registro;
	private String materia;
	
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	
	@Override
	public void validaridade() {
		// TODO Auto-generated method stub
		System.out.print("sobrepor em professor");
	}	
	
	public void tipoprofessor(String professor) {
	
	}
	
	
	
	
	
	
}
