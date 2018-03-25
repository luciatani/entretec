package br.gov.sp.etec.exemplojpajsf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;

import br.gov.sp.etec.exemplojpajsf.business.ResponsavelRN;
import br.gov.sp.etec.exemplojpajsf.model.Responsavel;

public class ResponsavelBean {
	
	private Responsavel responsavel;
	List<Responsavel> responsaveis = new ArrayList<Responsavel>();
	List<Responsavel> responsaveisSelecionados = new ArrayList<Responsavel>();

	
	ResponsavelRN service = new ResponsavelRN();
	@PostConstruct
	public void init() {
		responsaveis = service.listar();
		responsavel = new Responsavel();

	}
	
	public void gravar(ActionEvent actionEvent) {
		if(responsavel.getId() == null){
			service.gravar(responsavel);
        }
        else{
        	service.atualizar(responsavel);
        }
		responsavel = new  Responsavel();
		responsaveis = service.listar();
	}

	public void excluir() {
		service.excluir(this.responsavel);
		responsaveis = service.listar();
		responsavel = new Responsavel();
		responsaveis = service.listar();
	}


	/*
	 * getters e setters
	 * 
	 * 
	 */


	
	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

	public List<Responsavel> getResponsavels() {
		return responsaveis;
	}

	public void setResponsavels(List<Responsavel> responsaveis) {
		this.responsaveis = responsaveis;
	}

	public List<Responsavel> getResponsavelsSelecionados() {
		return responsaveisSelecionados;
	}

	public void setResponsavelsSelecionados(List<Responsavel> responsaveisSelecionados) {
		this.responsaveisSelecionados = responsaveisSelecionados;
	}
	
	
	
	

}
