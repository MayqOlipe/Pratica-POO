package ClassEObjConta;

public class TestaConta {
	public static void main(String[] args) {
		ContaBancaria cb = new ContaBancaria();
		
		cb.setBancoOrigem("Bradesco");
		cb.setNomeDono("Mayquel");
		cb.setSaldo(2);
		
		System.out.println("Nome: " + cb.getNomeDono());
		System.out.println("Banco de Origem: " + cb.getBancoOrigem());
		System.out.println("Quantia em Dinheiro na conta: " + cb.getSaldo());
		
		System.out.println();
		System.out.println("=========================================================");
		
		System.out.println("==Gostaria de Depositar uma quantia em dinheiro!==");
		cb.GuardarDinheiro();
		
		System.out.println("==Gostaria de fazer uma transferência==");
		cb.Transferencia();
		
		System.out.println("==Gostaria de Pagar uma conta!==");
		cb.PagarConta();
	}
}
