package br.gov.sp.etec.exemplojpajsf.business;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.gov.sp.etec.exemplojpajsf.dao.AlunoDAO;
import br.gov.sp.etec.exemplojpajsf.infra.JPAUtil;
import br.gov.sp.etec.exemplojpajsf.model.Aluno;

public class AlunoRN {
	Aluno aluno = new Aluno();
	List<Aluno> alunos = new ArrayList<Aluno>();
	
	public void gravar(Aluno entity) {
		EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        AlunoDAO dao = new AlunoDAO(em);
        dao.adiciona(entity);
        em.getTransaction().commit();
        em.close();
	}

	public void atualizar(Aluno aluno) {
		EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        AlunoDAO dao = new AlunoDAO(em);
		dao.altera(aluno);
		em.getTransaction().commit();
	    em.close();
	}
	
	public void excluir(Aluno aluno) {
		EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        AlunoDAO dao = new AlunoDAO(em);
        Aluno alunoExcluido = dao.busca(aluno.getId());
        dao.remove(alunoExcluido);
        em.getTransaction().commit();
        em.close();
        aluno = new Aluno();
     }
	
	public List<Aluno> listar() {
		EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        AlunoDAO dao = new AlunoDAO(em);
        alunos = dao.lista();
        em.close();
        
		return alunos;
	}

	/*
	 * getters e setters
	 * 
	 * 
	 */

	public Aluno getEntity() {
		return aluno;
	}

	public void setEntity(Aluno entity) {
		this.aluno = entity;
	}

	public List<Aluno> getEntities() {
		return alunos;
	}

	public void setEntities(List<Aluno> entities) {
		this.alunos = entities;
	}

}
