package Questao4;

import Conta.Conta;

public interface EstadosDaConta {
	
	void deposita(double valor, Conta conta);
	
	void saca(double valor, Conta conta);

}
