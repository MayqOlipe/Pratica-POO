package ClasseEObjAvi�o;

public class TestaAvi�o {

	public static void main(String[] args) {
		
		Avi�o aviao1 = new Avi�o();
		
		
		aviao1.empresa = "Azul";
		aviao1.modelo = "Embraer E-190";
		aviao1.quantLugares = 50;
		aviao1.voar(203);
		
		System.out.println("Empresa: " + aviao1.empresa);
		System.out.println("Modelo: " + aviao1.modelo);
		System.out.println("Quantia de Lugares: " + aviao1.quantLugares);
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Velocidade para Levantar v�o: " + aviao1.velocidade);
		
		aviao1.pousar(50);
		System.out.println("Velocidade para Pouso: " + aviao1.velocidade);
	}

}
