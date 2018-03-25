package br.gov.sp.etec.exemplojpajsf.controller;


	import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
	 
	@ManagedBean
	public class PrincipalBean {	     
	    private List<String> images;
	     
	    @PostConstruct
	    public void init() {
	        images = new ArrayList<String>();
	        for (int i = 1; i <= 12; i++) {
	            images.add("nature" + i + ".jpg");
	        }
	    }
	 
	    public List<String> getImages() {
	        return images;
	    }
	}

