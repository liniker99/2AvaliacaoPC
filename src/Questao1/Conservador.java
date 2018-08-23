package Questao1;

import Conta.Conta;

public class Conservador implements Investimento{

	public double investir(Conta conta) {
		return conta.getSaldo() * 0.008;
	}

}
