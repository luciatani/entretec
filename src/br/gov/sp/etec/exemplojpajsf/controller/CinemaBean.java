package br.gov.sp.etec.exemplojpajsf.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.gov.sp.etec.exemplojpajsf.model.Filme;

@ManagedBean
@ViewScoped
public class CinemaBean implements Serializable {

	    /**
	 * 
	 */
	private static final long serialVersionUID = 2151393754424716764L;

		private List<Filme> filmes;
	     
	    private Filme selectedFilme;

	    @PostConstruct
	    public void init() {
	        filmes= new ArrayList<Filme>();
	        filmes.add(new Filme("A"));
	        filmes.add(new Filme("B"));
	        filmes.add(new Filme("C"));
	        
	    }

		public List<Filme> getFilmes() {
			return filmes;
		}

		public void setFilmes(List<Filme> filmes) {
			this.filmes = filmes;
		}

		public Filme getSelectedFilme() {
			return selectedFilme;
		}

		public void setSelectedFilme(Filme selectedFilme) {
			this.selectedFilme = selectedFilme;
		}
	 
	  
	}

