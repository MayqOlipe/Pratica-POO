package ClasseEObjPaciente;

public class Paciente {
	
	private String nome, genero;
	private int idade;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	void FazerCadastro() {
		System.out.println("Fazendo Cadastro");
	}
	
	void MarcarConsulta() {
		System.out.println("Marcando consulta");
	}
	void PedirReceita() {
		System.out.println("Pedindo Receita");
	}
}
