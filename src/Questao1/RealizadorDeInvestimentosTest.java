package Questao1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Conta.Conta;

public class RealizadorDeInvestimentosTest {
	private Conta conta;
	private Investimento conservador;
	private Investimento moderado;
	private Investimento arrojado;
	
	@Before
	public void criaConta() {
		this.conta = new Conta(123, "Ednan Martins", Calendar.getInstance());
		this.conta.deposita(100);
	}
	
	@Before
	public void criaInvestimentos() {
		this.conservador = new Conservador();
		this.moderado = new Moderado();
		this.arrojado = new Arrojado();
	}
	
	@Test
	public void deveEntenderConservador() {
		//cenário
		RealizadorDeInvestimentos realiza = new RealizadorDeInvestimentos();
		
		//ação
		realiza.calculaInvestimento(conservador, conta);
		
		//saída
		double retornoConservador = 100.60;
		Assert.assertEquals(retornoConservador, conta.getSaldo(), 0.00001);
	}
		
	@Test
	public void deveEntenderModerado() {
		//cenário
		RealizadorDeInvestimentos realiza = new RealizadorDeInvestimentos();
		
		//ação
		realiza.calculaInvestimento(moderado, conta);
		
		//saída
		List<Double> retornosModerado = new ArrayList<>();
		retornosModerado.add(101.875);
		retornosModerado.add(100.525);
		
		Assert.assertTrue(retornosModerado.contains(conta.getSaldo()));
	}
	
	@Test
	public void deveEntenderArrojado() {
		//cenário
		RealizadorDeInvestimentos realiza = new RealizadorDeInvestimentos();
		
		//ação
		realiza.calculaInvestimento(arrojado, conta);
		
		//saída
		List<Double> retornosArrojado = new ArrayList<>();
		retornosArrojado.add(103.75);
		retornosArrojado.add(102.25);
		retornosArrojado.add(100.45);

		Assert.assertTrue(retornosArrojado.contains(conta.getSaldo()));
	}
	
	
}
