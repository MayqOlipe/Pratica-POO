package ClasseEObjPatinete;

import java.util.Scanner;

public class TestaPatinete {

	public static void main(String[] args) {
		Patinete pat1 = new Patinete();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite a Marca do Paninete: ");
		String marca = scan.next();
		
		System.out.println("Digite a cor do patinete: ");
		String cor = scan.next();
		
		System.out.println("Digite o Tamanho do Patinete: ");
		int tamanho = scan.nextInt();
		
		pat1.setMarca(marca);
		pat1.setCor(cor);
		pat1.setTamanho(tamanho);
		
		
		System.out.println("A marca do seu Patinete: " + pat1.getMarca());
		System.out.println("A cor do seu Patinete" + pat1.getCor());
		System.out.println("O Tamanho do seu Patinete: " + pat1.getTamanho());
		
		
		System.out.println("Patinete Acelerando");
		System.out.println(pat1.getAceleracao());
		
		System.out.println("Patinete Freiando");
		System.out.println(pat1.getAceleracao());
		scan.close();
	}

}
