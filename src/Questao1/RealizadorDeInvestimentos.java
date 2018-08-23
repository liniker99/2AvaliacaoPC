package Questao1;

import Conta.Conta;

public class RealizadorDeInvestimentos {
	
	private double retornoInvestimento = 0.75;
	
	public void calculaInvestimento(Investimento investimento, Conta conta) {
		double valorInicialDoInvestimento = investimento.investir(conta);
		double valorRetornadoDoInvestimento = valorInicialDoInvestimento * retornoInvestimento;
		conta.setSaldo(conta.getSaldo() + valorRetornadoDoInvestimento);
		
	}
	
	

}
