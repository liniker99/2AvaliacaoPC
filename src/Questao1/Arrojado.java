package Questao1;

import Conta.Conta;

public class Arrojado implements Investimento{

	public double investir(Conta conta) {

		double chance = new java.util.Random().nextDouble();
		double retorno;
		
		if(chance<=0.2) retorno = 0.05;
		else if (chance<=0.5) retorno = 0.03;
		else retorno = 0.006;
		
		return conta.getSaldo() * retorno;
		
		
	}

}
