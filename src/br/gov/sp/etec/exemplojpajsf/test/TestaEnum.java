package br.gov.sp.etec.exemplojpajsf.test;

import br.gov.sp.etec.exemplojpajsf.model.Turma;
import br.gov.sp.etec.exemplojpajsf.util.PeriodoEnum;

public class TestaEnum {
	public static void main(String[] args) {
		Turma turma = new Turma();
		//criar uma turma
		
		turma.setDescricao("2IL - Segundo módulo informática Ligabue");
		turma.setPeriodo(PeriodoEnum.NOITE);
		
		System.out.println(turma.getDescricao() + " - " + turma.getPeriodo());
	}
}
