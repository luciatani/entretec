package br.gov.sp.etec.exemplojpajsf.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
//
//@Table(name ="TELEFONE")
@Entity
public class Telefone implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1995464386975721781L;
	
	@Id
	@GeneratedValue
//	@Column (name = "ID_TELEFONE")
	private Integer id;
//	
//	@Column (name = "DS_DDD")
	private String ddd;
	
//	@Column (name = "DS_TELEFONE")
	private String telefone;
	
	//bi-directional many-to-one association to Aluno
	@ManyToOne
	@JoinColumn(name="idAluno")
	private Aluno aluno;
	
	//bi-directional many-to-one association to TipoTelefone
	@ManyToOne
	@JoinColumn(name="idTipoTelefone")
	private TipoTelefone tipoTelefone;
	
	@ManyToMany 
	@JoinTable(name="TelefoneResponsavel", joinColumns=@JoinColumn(name="idTelefone"), 
	inverseJoinColumns=@JoinColumn(name="idResponsavel"))
	private List<Responsavel> listaResponsaveis;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
//	public TipoTelefone getTipoTelefone() {
//		return tipoTelefone;
//	}
//	public void setTipoTelefone(TipoTelefone tipoTelefone) {
//		this.tipoTelefone = tipoTelefone;
//	}
	public List<Responsavel> getListaResponsaveis() {
		return listaResponsaveis;
	}
	public void setListaResponsaveis(List<Responsavel> listaResponsaveis) {
		this.listaResponsaveis = listaResponsaveis;
	}
	
	
	

}
