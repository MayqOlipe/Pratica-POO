package ClasseEObjEletro;

import java.util.Scanner;

public class TestaMp3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a Marca do Mp3: ");
		String marca = scan.next();
		
		System.out.println("Digite a cor do Mp3: ");
		String cor = scan.next();
		
		System.out.println("Digite a Capacidade de Armazenamento do Mp3: ");
		int armazenamento = scan.nextInt();
		
		
		Mp3 mp3 = new Mp3();
		
		mp3.setMarca(marca);
		mp3.setCor(cor);
		mp3.setArmazenamento(armazenamento);
		
		System.out.println("========Meu MP3========");
		System.out.println("Marca: " + mp3.getMarca());
		System.out.println("Cor: " + mp3.getCor());
		System.out.println("Tamanho do disco de armazenamento: " + mp3.getArmazenamento());
		System.out.println("--------------------------------------------------------");
		
		System.out.println("===== Ligando meu Mp3 =====");
		System.out.println();
		mp3.Tocar();
		scan.close();
	}

}
