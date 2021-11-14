package ClasseEObjEletro;

import java.util.Scanner;

public class Mp3 {
	Scanner scan = new Scanner(System.in);
	
	private String marca, cor;
	private int armazenamento, resposta;
	
	
	
	public Scanner getScan() {
		return scan;
	}



	public void setScan(Scanner scan) {
		this.scan = scan;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public int getArmazenamento() {
		return armazenamento;
	}



	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}



	public int getResposta() {
		return resposta;
	}



	public void setResposta(int resposta) {
		this.resposta = resposta;
	}



	void Tocar() {
		
		System.out.println("Deseja iniciar a música?" +  "\n" +  "1 - Sim " +  "\n" + "0 - Não");
		resposta = scan.nextInt();
		
		if(resposta == 1) {
			System.out.println("Tocando Música");
		}
		else {
			System.out.println("Encerrar");
		}
	scan.close();	
	}
	
}
	

	

