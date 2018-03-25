package br.gov.sp.etec.exemplojpajsf.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;

import br.gov.sp.etec.exemplojpajsf.infra.JPAUtil;
import br.gov.sp.etec.exemplojpajsf.model.Usuario;

@ManagedBean
@SessionScoped
public class LoginBean {
	
	private Usuario usuario = new Usuario();

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public String efetuarLogin() {
		EntityManager em = new JPAUtil().getEntityManager();
		boolean loginValido = true;
		if (loginValido){
			return "turma?faces-redirect=true";
		}
		else{
			this.usuario = new Usuario();
			
		}
		em.getTransaction().commit();
		em.close();
		return "login";
	}
	
}
