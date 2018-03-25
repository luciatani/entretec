package br.gov.sp.etec.exemplojpajsf.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.gov.sp.etec.exemplojpajsf.model.Filme;

public class FilmeDAO {

	private final DAO<Filme> dao;

	public FilmeDAO(EntityManager em) {
		dao = new DAO<Filme>(em, Filme.class);
	}

	public void adiciona(Filme t) {
		dao.adiciona(t);
	}

	public Filme busca(Integer id) {
		return dao.busca(id);
	}

	public List<Filme> lista() {
		return dao.lista();
	}

	public void remove(Filme t) {
		dao.remove(t);
	}

	public void altera(Filme conta) {
		dao.altera(conta);
	}
}
