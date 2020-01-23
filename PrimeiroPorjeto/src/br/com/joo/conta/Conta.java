package br.com.joo.conta;

public class Conta {
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private String dataAbertura;

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String saca(double valor) {
		if (valor < this.saldo) {
			this.saldo -= valor;
			return "Saque realizado com sucesso";
		} else {
			return "Saldo insuficiente ligue para seu Banco";
		}
	}

	public String deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return "Deposito realizado com sucesso";
		} else {
			return "Falha ao realizar o depoósito";
		}
	}

	public void calculaRendimento() {
		
	}

}
