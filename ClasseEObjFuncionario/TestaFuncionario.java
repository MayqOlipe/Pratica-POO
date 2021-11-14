package ClasseEObjFuncionario;

import java.util.Scanner;

public class TestaFuncionario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu Nome: ");
		String nome = scan.next();
		
		System.out.println("Digite seu Cargo: ");
		String cargo = scan.next();
		
		System.out.println("Digite seu N�mero de Registro: ");
		int num = scan.nextInt();
		
		
		Funcionario func1 = new Funcionario();
		
		func1.setNome(nome);
		func1.setCargo(cargo);
		func1.setNumRegistro(num);
		
		System.out.println("Nome do Funcion�rio: " + func1.getNome());
		System.out.println("Cargo do Funcion�rio: " + func1.getCargo());
		System.out.println("N�mero de Registro do Funcion�rio: " + func1.getNumRegistro());
		System.out.println();
		System.out.println("Inicio do expediente: ");
		System.out.println();
		func1.RegistroPonto();
		System.out.println("========================");
		
		System.out.println("12h00 no Rel�gio: ");
		System.out.println();
		func1.almo�o();
		System.out.println("========================");
		
		System.out.println("Final do Expediente: ");
		System.out.println();
		func1.FimExpediente();
		System.out.println("========================");
		scan.close();
	}	
	

}
