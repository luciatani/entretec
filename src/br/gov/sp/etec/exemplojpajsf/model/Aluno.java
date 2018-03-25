package br.gov.sp.etec.exemplojpajsf.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 * The persistent class for the aluno database table.
 * 
 */
//@Table(name ="ALUNO")
@Entity
public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
//	@Column(name="ID_ALUNO")
	private Integer id;
	
//	@Column(name="NM_ALUNO")
	private String nome;
	
	//bi-directional many-to-one association to Telefone
	@OneToMany(mappedBy="aluno", fetch = FetchType.EAGER)
	private List<Telefone> listaTelefone;
	
	//bi-directional many-to-one association to Responsavel
	@OneToMany(mappedBy="aluno" , fetch = FetchType.EAGER)
	private List<Responsavel> listaResponsaveis ;

	public Integer getId() {
		return this.id;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((listaResponsaveis == null) ? 0 : listaResponsaveis.hashCode());
		result = prime * result + ((listaTelefone == null) ? 0 : listaTelefone.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Aluno other = (Aluno) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (listaResponsaveis == null) {
			if (other.listaResponsaveis != null)
				return false;
		} else if (!listaResponsaveis.equals(other.listaResponsaveis))
			return false;
		if (listaTelefone == null) {
			if (other.listaTelefone != null)
				return false;
		} else if (!listaTelefone.equals(other.listaTelefone))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}