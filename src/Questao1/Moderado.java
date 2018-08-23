package Questao1;

import Conta.Conta;

public class Moderado implements Investimento{

	public double investir(Conta conta) {		

		double chance = new java.util.Random().nextDouble();
		double retorno;
		
		if(chance<=0.5) retorno = 0.025;
		else retorno = 0.007;
		
		return conta.getSaldo() * retorno;
	}

}
