package br.gov.sp.etec.exemplojpajsf.model;

import javax.faces.bean.ManagedBean;

import br.gov.sp.etec.exemplojpajsf.util.PeriodoEnum;
import br.gov.sp.etec.exemplojpajsf.util.PeriodoEnumExemplo;

@ManagedBean
public class Turma {
	private String curso; // explicar composição, agregação, etc...
	private String descricao;
	private PeriodoEnum periodo;
	private PeriodoEnumExemplo periodoExemplo;
	
	public Turma() {
	
	}

	public Turma(String curso, PeriodoEnumExemplo periodo){
        this.setCurso(curso);
        this.setPeriodoExemplo(periodo);
  }

	public PeriodoEnum getPeriodo() {
		return periodo;
	}

	public void setPeriodo(PeriodoEnum periodo) {
		this.periodo = periodo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public PeriodoEnumExemplo getPeriodoExemplo() {
		return periodoExemplo;
	}

	public void setPeriodoExemplo(PeriodoEnumExemplo periodoExemplo) {
		this.periodoExemplo = periodoExemplo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
