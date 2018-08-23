package Questao3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Conta.Conta;

public class FiltroSeAberturaNoMesCorrente extends Filtro{
	
	public FiltroSeAberturaNoMesCorrente(Filtro proximoFiltro) {
		super(proximoFiltro);
	}
	
	public FiltroSeAberturaNoMesCorrente() {
		super();
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> novaListaDeContas = new ArrayList<>();
		for(Conta c : contas) {
			if(c.getDataAbertura().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH) && 
				c.getDataAbertura().get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR)) {
					novaListaDeContas.add(c);
				}
		}
		novaListaDeContas.addAll(proximo(contas));
		return novaListaDeContas;
	}

}
