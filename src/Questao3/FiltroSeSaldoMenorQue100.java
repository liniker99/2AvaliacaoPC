package Questao3;

import java.util.ArrayList;
import java.util.List;

import Conta.Conta;

public class FiltroSeSaldoMenorQue100 extends Filtro{
	
	public FiltroSeSaldoMenorQue100 (Filtro proximoFiltro) {
		super(proximoFiltro);
	}
	
	public FiltroSeSaldoMenorQue100() {
		super();
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> novaListaDeContas = new ArrayList<>();
		for (Conta c : contas) {
			if(c.getSaldo()<100) {
				novaListaDeContas.add(c);
			}
		}
		novaListaDeContas.addAll(proximo(contas));		
		return novaListaDeContas;
	}

}
