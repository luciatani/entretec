package br.gov.sp.etec.exemplojpajsf.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.gov.sp.etec.exemplojpajsf.model.Responsavel;

public class ResponsavelDAO {
	private final DAO<Responsavel> dao;

	public ResponsavelDAO(EntityManager em) {
		dao = new DAO<Responsavel>(em, Responsavel.class);
	}

	public void adiciona(Responsavel t) {
		dao.adiciona(t);
	}

	public Responsavel busca(Integer id) {
		return dao.busca(id);
	}

	public List<Responsavel> lista() {
		return dao.lista();
	}

	public void remove(Responsavel t) {
		dao.remove(t);
	}

	public void altera(Responsavel conta) {
		dao.altera(conta);
	}
}
