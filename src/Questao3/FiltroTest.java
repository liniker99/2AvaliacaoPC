package Questao3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Conta.Conta;


public class FiltroTest {
	
	private Conta c1, c2, c3, c4, c5, c6;
	private FiltroSeSaldoMenorQue100 menorQue100;
	private FiltroSeSaldoMaiorQue500Mil maiorQue500Mil;
	private FiltroSeAberturaNoMesCorrente mesCorrente;
	
	@Before
	public void criaContas() {
		this.c1 = new Conta(123, "Ednan Martins", Calendar.getInstance());
		this.c1.deposita(5200);
		
		this.c2 = new Conta(234, "Sarah Jessica", Calendar.getInstance());
		this.c2.deposita(5450);
		
		this.c3 = new Conta(345, "Ricardo Mariano", Calendar.getInstance());
		this.c3.deposita(30);
		
		this.c4 = new Conta(456, "Daniel Nunes", Calendar.getInstance());
		this.c4.deposita(250);
		
		this.c5 = new Conta(567, "Ulisses Lima", Calendar.getInstance());
		this.c5.deposita(96);
		
		this.c6 = new Conta(678, "Liniker Góis", Calendar.getInstance());
		this.c6.deposita(360);
	}
	
	@Before
	public void criaFiltros() {
		this.menorQue100 = new FiltroSeSaldoMenorQue100();
		this.maiorQue500Mil = new FiltroSeSaldoMaiorQue500Mil();
		this.mesCorrente = new FiltroSeAberturaNoMesCorrente();
	}
	
	@Test
	public void deveEntenderSeSaldoMenorQue100() {
		//cenário
		List<Conta> contas = new ArrayList<>();
		List<Conta> contasFiltradas = new ArrayList<>();
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		contas.add(c5);
		contas.add(c6);
		
		//ação
		contasFiltradas = menorQue100.filtra(contas);
		
		//saída
		Assert.assertEquals(2, (contasFiltradas.size()));
	}

	@Test
	public void deveEntenderSeSaldoMaiorQue500Mil() {
		//cenário
		List<Conta> contas = new ArrayList<>();
		List<Conta> contasFiltradas = new ArrayList<>();
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		contas.add(c5);
		contas.add(c6);
		
		//ação
		contasFiltradas = maiorQue500Mil.filtra(contas);
		
		//saída
		Assert.assertEquals(2, (contasFiltradas.size()));
	}
	
	@Test
	public void deveEntenderSeAberturaNoMesCorrente() {
		//cenário
		List<Conta> contas = new ArrayList<>();
		List<Conta> contasFiltradas = new ArrayList<>();
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		contas.add(c5);
		contas.add(c6);
		
		//ação
		contasFiltradas = mesCorrente.filtra(contas);
		
		//saída
		Assert.assertEquals(6, (contasFiltradas.size()));
	}
	
}
