package br.com.joo.teste;

import br.com.joo.conta.Conta;

public class TestaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.setTitular("Hugo");
		c1.setNumero(1234);
		c1.setAgencia("45678-9");
		c1.deposita(50);
		c1.setDataAbertura("04/11/1988");


		
		System.out.println("Titular: " + c1.getTitular());
		System.out.println("Numero da Conta: " + c1.getNumero());
		System.out.println("Agência: " + c1.getAgencia());
		System.out.println("Saldo: " + c1.getSaldo());
		System.out.println("Data Abertura: " + c1.getDataAbertura());
		System.out.println("Saque: " + c1.saca(30));
		System.out.println("Saldo Atual: " + c1.getSaldo());
		System.out.println("Deposito: " + c1.deposita(50));
		System.out.println("Saldo Atual: " + c1.getSaldo());
	}
	

}
