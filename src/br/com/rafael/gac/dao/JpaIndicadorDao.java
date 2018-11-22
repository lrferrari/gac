package br.com.rafael.gac.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.rafael.gac.modelo.Indicador;

@Repository
public class JpaIndicadorDao implements IndicadorDao {
	@PersistenceContext
	EntityManager manager;

	public void adiciona(Indicador indicador) {
		manager.persist(indicador);
	}
	
	public Indicador buscaPorCD_IN(Long cd_in) {
		return manager.find(Indicador.class, cd_in);
		}	

}