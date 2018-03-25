package br.gov.sp.etec.exemplojpajsf.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

import br.gov.sp.etec.exemplojpajsf.model.Turma;
import br.gov.sp.etec.exemplojpajsf.util.PeriodoEnum;

@ManagedBean
public class TurmaBean {
	
	Turma turma = new Turma();

	public PeriodoEnum[] getPeriodoEnum(){
		   return PeriodoEnum.values();
		 }

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public void cadastrar(ActionEvent actionEvent) {
		//cadastrar turma
	}
	
	
}
