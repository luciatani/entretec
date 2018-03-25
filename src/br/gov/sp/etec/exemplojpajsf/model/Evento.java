package br.gov.sp.etec.exemplojpajsf.model;

import java.util.Date;

public class Evento {
	private int id;
	private String descricao;
	private Date dataEvento;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
