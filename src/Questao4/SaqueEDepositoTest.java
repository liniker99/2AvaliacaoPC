package Questao4;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Conta.Conta;

public class SaqueEDepositoTest {
	
	private Conta conta;

	@Before
	public void criaConta() {
		this.conta = new Conta(123, "Ednan Martins", Calendar.getInstance());
	}
	
	@Test
	public void deveEntenderDepositoESaqueComSaldoPositivo() {
		//cenário
		/*Conta criada com status Positivo*/
		
		//ação e teste
		conta.depositoDependenteDoEstado(100);
		double depositoEsperado = 98;
		Assert.assertEquals(depositoEsperado, conta.getSaldo(), 0.00001);
		
		//ação e teste
		conta.saqueDependenteDoEstado(50);
		double saldoEsperado = 48;
		Assert.assertEquals(saldoEsperado, conta.getSaldo(), 0.00001);
	}
	
	@Test
	public void deveEntenderDepositoESaqueComSaldoNegativo() {
		//cenário
		conta.saqueDependenteDoEstado(100); //Conta com saldo negativo
		
		//ação e teste
		conta.depositoDependenteDoEstado(100);
		double depositoEsperado = -5;
		Assert.assertEquals(depositoEsperado, conta.getSaldo(), 0.00001);
		
		try {
			conta.saqueDependenteDoEstado(20);
		} catch(Exception excecao) {
			Assert.assertEquals("Ação não é permitida, conta com Saldo Negativo!!", excecao.getMessage());
		}
	}
	
	@Test
	public void deveEntenderSaqueZero() {
		//cenário
		/*Conta criada com Saldo zero e status Positivo*/
		
		//ação e teste
		try {
			conta.saqueDependenteDoEstado(0);
		} catch(Exception excecao) {
			Assert.assertEquals("Não é permitido Saque Zero", excecao.getMessage());
		}
	}
	
	
}
