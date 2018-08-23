package Questao4;

import Conta.Conta;

public class Negativo implements EstadosDaConta{
	
	private double porcentagemDeposito = 0.95;

	@Override
	public void deposita(double valor, Conta conta) {
		double valorDepositado = valor * porcentagemDeposito;
		double saldoAtual = conta.getSaldo() + valorDepositado;
		if(saldoAtual>=0) {
			conta.estadoAtual = new Positivo();
		}
		conta.setSaldo(saldoAtual);
	}

	@Override
	public void saca(double valor, Conta conta) {
		throw new RuntimeException("Ação não é permitida, conta com Saldo Negativo!!");
		
	}

}
