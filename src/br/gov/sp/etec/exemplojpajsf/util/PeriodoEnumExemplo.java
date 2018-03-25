package br.gov.sp.etec.exemplojpajsf.util;

public enum PeriodoEnumExemplo {
	 DIURNO_INTEGRAL ("seg a sex", 10, 18),
     DIURNO_MATUTINO("seg a sex", 8,12),
     NOTURNO("seg a sex", 19,23),
     MAIS_DIAS("sabado e domingo", 10, 19);
     private String dias; // aqui vai pegar o que é String, no caso os texto entre ? ?, exemplo: ?seg a sex?.
     private int horaTermino; // aqui vai pegar o que é inteiro no caso ele vai seleciona o primeiro numero inteiro exemplo: 10 da constante DIURNO_INTEGRAL
     private int horaInicio; // aqui vai pegar o que é inteiro no caso ele vai seleciona o ultimo numero inteiro exemplo: 18 da constante DIURNO_INTEGRAL
     
     PeriodoEnumExemplo(String dias, int horaInicio, int horaTermino){
           this.dias = dias;
           this.horaInicio = horaInicio;
           this.horaTermino = horaTermino;
     }
     
	public String getDias() {
		return dias;
	}
	public void setDias(String dias) {
		this.dias = dias;
	}
	public int getHoraTermino() {
		return horaTermino;
	}
	public void setHoraTermino(int horaTermino) {
		this.horaTermino = horaTermino;
	}
	public int getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}
}
