package br.gov.sp.etec.exemplojpajsf.test;

import br.gov.sp.etec.exemplojpajsf.model.Turma;
import br.gov.sp.etec.exemplojpajsf.util.PeriodoEnumExemplo;

public class TestaEnumExemplo {
	 public static void main(String[] args) {
         Turma t = new Turma("Curso java", PeriodoEnumExemplo.NOTURNO); // selecione aqui a Constante
         System.out.println("Curso : "+t.getCurso());
         System.out.println("Dias : "+t.getPeriodoExemplo().getDias());
         System.out.println("Hora inicio : "+t.getPeriodoExemplo().getHoraInicio());
         System.out.println("Hora termino : "+t.getPeriodoExemplo().getHoraTermino());
   }
}
