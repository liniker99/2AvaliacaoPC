package Questao2;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import Conta.Conta;

public class RequisicaoTest {
	
	private Conta conta;
	private RespostaEmXML xlm;
	private RespostaEmCSV csv;
	private RespostaEmPorcento porcento;
	
	@Before
	public void criaConta() {
		this.conta = new Conta(123, "Ednan Martins", Calendar.getInstance());
		conta.deposita(50);
	}
	
	@Before
	public void criaRespostas() {
		this.xlm = new RespostaEmXML();
		this.csv = new RespostaEmCSV();
		this.porcento = new RespostaEmPorcento();;
	}
	
	@Before
	public void criaCaminhoASerPercorrido() {
		xlm.setProxima(csv);
		csv.setProxima(porcento);
		porcento.setProxima(xlm);
	}
	
	@Test
	public void deveEntenderRespostaXML() {		
		Requisicao requisicao = new Requisicao(Formato.XML);		
		xlm.responde(requisicao, conta);
	}
	
	@Test
	public void deveEntenderRespostaCSV() {
		Requisicao requisicao = new Requisicao(Formato.CSV);
		csv.responde(requisicao, conta);
	}
	
	@Test
	public void deveEntenderRespostaPorCento() {
		Requisicao requisicao = new Requisicao(Formato.PORCENTO);
		porcento.responde(requisicao, conta);
	}
	
	@Test
	public void deveEntenderTodasRespostas() {		
		Requisicao requisicao1 = new Requisicao(Formato.XML);		
		xlm.responde(requisicao1, conta);
		
		Requisicao requisicao2 = new Requisicao(Formato.CSV);
		csv.responde(requisicao2, conta);
		
		Requisicao requisicao3 = new Requisicao(Formato.PORCENTO);
		porcento.responde(requisicao3, conta);
	}

}
