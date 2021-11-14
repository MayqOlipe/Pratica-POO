package ClasseEObjAvião;

public class Avião {
	
	String modelo, empresa;
	int quantLugares, velocidade = 0;
	
	
	void voar(int aceleracao) {
		velocidade += aceleracao;
	}
	void pousar(int reduzir) {
		velocidade -= reduzir;
	}
}