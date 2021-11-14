package ClasseEObjPaciente;

public class TestaPaciente {
	public static void main(String[] args) {
		
		Paciente pac = new Paciente();
		
		pac.setNome("Mayquel");
		pac.setGenero("Masculino");
		pac.setIdade(25);
		
		System.out.println("===========================================");
		System.out.println("Nome do Paciente: " + pac.getNome());
		System.out.println("Gênero do Paciente: " + pac.getGenero());
		System.out.println("Idade do Paciente: " + pac.getIdade());
		System.out.println("===========================================");
		
		System.out.println("Iniciando Cadastro do Paciente");
		pac.FazerCadastro();
		System.out.println("Marcar Consulta do Paciente");
		pac.MarcarConsulta();
		System.out.println("Pedir Receita de Remédio do Paciente");
		pac.PedirReceita();
	}
}
