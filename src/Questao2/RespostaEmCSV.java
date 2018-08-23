package Questao2;

import Conta.Conta;

public class RespostaEmCSV implements Resposta {
	
	private Resposta outraResposta;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.CSV) {
			System.out.println(conta.getNomeTitular() + ", " + conta.getSaldo());
		} else {
			outraResposta.responde(req, conta);
		}		
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.outraResposta = resposta;		
	}
	

}
