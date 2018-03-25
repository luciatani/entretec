package br.gov.sp.etec.exemplojpajsf.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.gov.sp.etec.exemplojpajsf.model.Aluno;



public class AlunoDAO {


	private final DAO<Aluno> dao;

	public AlunoDAO(EntityManager em) {
		dao = new DAO<Aluno>(em, Aluno.class);
	}

	public void adiciona(Aluno t) {
		dao.adiciona(t);
	}

	public Aluno busca(Integer id) {
		return dao.busca(id);
	}

	public List<Aluno> lista() {
		return dao.lista();
	}

	public void remove(Aluno t) {
		dao.remove(t);
	}

	public void altera(Aluno conta) {
		dao.altera(conta);
	}
}
