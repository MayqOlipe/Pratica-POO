package ClasseEObjFuncionario;

public class Funcionario {
		
	private String Nome, Cargo;
	private int numRegistro;
	
	
	
	void RegistroPonto() {
		
		System.out.println("Bateu o Ponto");
		
	}
	void almoço() {
		
		System.out.println("Saiu para almoçar");
	}
	void FimExpediente() {
		
		System.out.println("Finalizou o Expediente");
	}
	
	
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	public int getNumRegistro() {
		return numRegistro;
	}
	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}
}
