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
//@Table(name ="RESPONSAVEL")
@Entity
public class Responsavel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3389726671241497428L;
	@Id
	@GeneratedValue
//	@Column(name = "ID_RESPONSAVEL")
	private Integer id;
	
//	@Column(name = "NM_RESPONSAVEL")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="idAluno")
	private Aluno aluno;
	
	@ManyToMany 
	@JoinTable(name="TelefoneResponsavel", joinColumns=@JoinColumn(name="idResponsavel"), 
	inverseJoinColumns=@JoinColumn(name="idTelefone"))
	private List<Telefone> listaTelefoneResponsavel;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public List<Telefone> getListaTelefoneResponsavel() {
		return listaTelefoneResponsavel;
	}
	public void setListaTelefoneResponsavel(List<Telefone> listaTelefoneResponsavel) {
		this.listaTelefoneResponsavel = listaTelefoneResponsavel;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((listaTelefoneResponsavel == null) ? 0 : listaTelefoneResponsavel.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Responsavel other = (Responsavel) obj;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (listaTelefoneResponsavel == null) {
			if (other.listaTelefoneResponsavel != null)
				return false;
		} else if (!listaTelefoneResponsavel.equals(other.listaTelefoneResponsavel))
			return false;
		return true;
	}
}
