package Questao2;

import Conta.Conta;

public class RespostaEmXML implements Resposta{
	
	private Resposta outraResposta;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.XML) {
			System.out.println("<conta> <titular>" + conta.getNomeTitular() + 
					"</titular> <saldo>" + conta.getSaldo() + "</saldo> </conta>");
		} else {
			outraResposta.responde(req, conta);
		}		
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.outraResposta = resposta;		
	}

}
