package br.com.rafael.gac.dao;

import javax.persistence.Entity;
import javax.persistence.PersistenceContext;

import br.com.rafael.gac.modelo.Usuario;

public class JpaUsuarioDao implements UsuarioDao {
	@PersistenceContext
	Entity manager;

	public void adiciona(Usuario usuario) {
		manager.persist(usuario);
	}
	
	public Usuario buscaPorLOGIN(String login) {
		return manager.find(Usuario.class, login);
		}	
	
}
