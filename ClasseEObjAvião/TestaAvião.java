package ClasseEObjAvião;

public class TestaAvião {

	public static void main(String[] args) {
		
		Avião aviao1 = new Avião();
		
		
		aviao1.empresa = "Azul";
		aviao1.modelo = "Embraer E-190";
		aviao1.quantLugares = 50;
		aviao1.voar(203);
		
		System.out.println("Empresa: " + aviao1.empresa);
		System.out.println("Modelo: " + aviao1.modelo);
		System.out.println("Quantia de Lugares: " + aviao1.quantLugares);
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Velocidade para Levantar vôo: " + aviao1.velocidade);
		
		aviao1.pousar(50);
		System.out.println("Velocidade para Pouso: " + aviao1.velocidade);
	}

}
