package Questao3;

import java.util.ArrayList;
import java.util.List;

import Conta.Conta;

public class FiltroSeSaldoMaiorQue500Mil extends Filtro{
	
	public FiltroSeSaldoMaiorQue500Mil(Filtro proximoFiltro) {
		super(proximoFiltro);		
	}
	
	public FiltroSeSaldoMaiorQue500Mil() {
		super();
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> novaListaDeContas = new ArrayList<Conta>();
		for(Conta c : contas) {
			if(c.getSaldo() > 5000) {
				novaListaDeContas.add(c);
			}
		}		
		novaListaDeContas.addAll(proximo(contas));
		return novaListaDeContas;
	}

}
