package ClassEObjConta;

public class ContaBancaria {
	private String nomeDono, bancoOrigem;
	private double saldo;
	
	
	public String getNomeDono() {
		return nomeDono;
	}
	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
	public String getBancoOrigem() {
		return bancoOrigem;
	}
	public void setBancoOrigem(String bancoOrigem) {
		this.bancoOrigem = bancoOrigem;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	void GuardarDinheiro() {
		
		System.out.println("Guardando dinheiro");
	}
	void Transferencia() {
		System.out.println("Transferindo dinheiro");
	}
	void PagarConta() {
		System.out.println("Pagando conta");
	}
}
