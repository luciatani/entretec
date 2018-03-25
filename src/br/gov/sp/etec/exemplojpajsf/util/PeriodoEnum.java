package br.gov.sp.etec.exemplojpajsf.util;

public enum PeriodoEnum {
	MANHA("Manh�"), TARDE("Tarde"), NOITE ("Noite");
	
	private String descricao;

	PeriodoEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
