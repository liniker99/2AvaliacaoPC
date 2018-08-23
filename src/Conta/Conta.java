package Conta;

import java.util.Calendar;
import Questao4.EstadosDaConta;
import Questao4.Positivo;

public class Conta {
	
	private int id;
	private String nomeTitular;
	private double saldo = 0;
	private Calendar dataAbertura;
	public EstadosDaConta estadoAtual;
	
	public Conta(int id, String nomeTitular, Calendar dataAbertura) {
		this.id = id;
		this.nomeTitular = nomeTitular;
		this.dataAbertura = dataAbertura;
		this.estadoAtual = new Positivo();
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getId() {
		return id;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}
	
	public EstadosDaConta getEstadoAtual() {
		return estadoAtual;
	}
	
	public void saqueDependenteDoEstado(double valor) {
		estadoAtual.saca(valor, this);
	}
	
	public void depositoDependenteDoEstado(double valor) {
		estadoAtual.deposita(valor, this);
	}
	

}
