package contaBancaria;

public class ContaBancaria {
	private String nomeCliente;
	private int numConta;
	private double saldo;

	public void setSaldo(double saldo) {

		this.saldo = saldo;
	}
    public void getSaldo() {
    	this.saldo = saldo;
    }
	public void setConta(int numconta) {
		this.numConta = numconta;
	}

	public void setnome(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
   public String contaCliente() {
      String infos;
      infos = "Conta bancária[";
      infos = "Nome: " + nomeCliente;
      infos = "Numero da conta: " + numConta;
      infos = "Saldo: " + saldo;
      return infos;
   }
	public boolean sacar(Double saldo) {
		double sacar = 0;
		if ((saldo - sacar) >= 0) {
			saldo -= sacar;
			return true;
		}
		return false;

	}
   
	public void depositar(double saldo) {
		double deposito = 0;
		deposito = saldo + deposito;
	}

}
