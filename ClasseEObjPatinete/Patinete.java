package ClasseEObjPatinete;

public class Patinete {
	
	private String marca, cor;
	private int tamanho, aceleracao = 0;
	
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

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getAceleracao() {
		return aceleracao;
	}

	public void setAceleracao(int aceleracao) {
		this.aceleracao = aceleracao;
	}

	void andar(int impulso) {
		aceleracao += impulso; 
	}

	void freiar(int reduzir) {
		aceleracao -= reduzir;
	}
}