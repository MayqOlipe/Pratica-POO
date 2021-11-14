package ClasseEObjCliente;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		
		cliente1.nome = "João | ";
		cliente1.endereço = "Avenida Brasil, 1560";
		cliente1.numeroInscricao = 01;
		
		cliente2.nome = "Mayquel | ";
		cliente2.endereço = "Rua Erminia Chiment, 377";
		cliente2.numeroInscricao = 02;
		
		cliente3.nome = "Antonio | ";
		cliente3.endereço = "Rua São Pedro, 265";
		cliente3.numeroInscricao = 03;
		
		cliente1.Cadastro();
		System.out.print(cliente1.nome);
		System.out.println(cliente1.endereço);
		cliente1.Registro();
		System.out.println(cliente1.numeroInscricao);
		
		System.out.println("---------------------------------------------------------");
		
		cliente2.Cadastro();
		System.out.print(cliente2.nome);
		System.out.println(cliente2.endereço);
		cliente2.Registro();
		System.out.println(cliente2.numeroInscricao);
		
		System.out.println("---------------------------------------------------------");
		
		cliente3.Cadastro();
		System.out.print(cliente3.nome);
		System.out.println(cliente3.endereço);
		cliente3.Registro();
		System.out.println(cliente3.numeroInscricao);
	}

}
