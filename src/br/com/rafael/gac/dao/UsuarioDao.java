package br.com.rafael.gac.dao;

import br.com.rafael.gac.modelo.Usuario;

public interface UsuarioDao {
	Usuario buscaPorLOGIN(Long login);
	void adiciona(Usuario u);
}
