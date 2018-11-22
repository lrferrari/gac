package br.com.rafael.gac.dao;

import br.com.rafael.gac.modelo.Indicador;

public interface IndicadorDao {
	Indicador buscaPorCD_IN(Long cd_in);
	void adiciona(Indicador t);
}
