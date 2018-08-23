package Questao4;

import Conta.Conta;

public class Positivo implements EstadosDaConta{
	
	private double porcentagemDeposito = 0.98;

	@Override
	public void deposita(double valor, Conta conta) {
		double valorDepositado = valor * porcentagemDeposito;
		double saldoAtual = conta.getSaldo() + valorDepositado;
		
		conta.setSaldo(saldoAtual);
	}

	@Override
	public void saca(double valor, Conta conta) {
		if(valor<=0) {
			throw new RuntimeException("Não é permitido Saque Zero");
		} else {
			double saldoAtual = conta.getSaldo() - valor;
			if(saldoAtual<0) {
				conta.estadoAtual = new Negativo();
			}
			conta.setSaldo(saldoAtual);
		}
	}

}
