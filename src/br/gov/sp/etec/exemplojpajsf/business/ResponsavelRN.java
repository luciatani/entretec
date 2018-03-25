package br.gov.sp.etec.exemplojpajsf.business;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.gov.sp.etec.exemplojpajsf.dao.ResponsavelDAO;
import br.gov.sp.etec.exemplojpajsf.infra.JPAUtil;
import br.gov.sp.etec.exemplojpajsf.model.Responsavel;

public class ResponsavelRN {
	Responsavel responsavel = new Responsavel();
	List<Responsavel> responsavels = new ArrayList<Responsavel>();
	
	
	
	public void gravar(Responsavel entity) {
		EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        ResponsavelDAO dao = new ResponsavelDAO(em);
        dao.adiciona(entity);
        em.getTransaction().commit();
        em.close();
	}

	public void atualizar(Responsavel responsavel) {
		EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        ResponsavelDAO dao = new ResponsavelDAO(em);
		dao.altera(responsavel);
		em.getTransaction().commit();
	    em.close();
	}
	
	public void excluir(Responsavel responsavel) {
		EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        ResponsavelDAO dao = new ResponsavelDAO(em);
        Responsavel responsavelExcluido = dao.busca(responsavel.getId());
        dao.remove(responsavelExcluido);
        em.getTransaction().commit();
        em.close();
        responsavel = new Responsavel();
     }
	
	public List<Responsavel> listar() {
		EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        ResponsavelDAO dao = new ResponsavelDAO(em);
        responsavels = dao.lista();
        em.close();
        
		return responsavels;
	}

	/*
	 * getters e setters
	 * 
	 * 
	 */

	public Responsavel getEntity() {
		return responsavel;
	}

	public void setEntity(Responsavel entity) {
		this.responsavel = entity;
	}

	public List<Responsavel> getEntities() {
		return responsavels;
	}

	public void setEntities(List<Responsavel> entities) {
		this.responsavels = entities;
	}

}
