package Questao2;

import Conta.Conta;

public interface Resposta {
	
	void responde(Requisicao req, Conta conta);
	
	void setProxima(Resposta resposta);	
	
}
