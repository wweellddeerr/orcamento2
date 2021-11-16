package br.com.mirante.web.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.apache.log4j.Logger;

@ManagedBean
public class HomeBean {
	
	Logger logger = Logger.getLogger(HomeBean.class);
	
	public void digaOla() {
		logger.info("Olá");
	}

	public String getMessage() {
		return "Olá, mundo";
	}
	
	public List<String> getOrcamentos() {
		List<String> orcamentos = new ArrayList<>();
		orcamentos.add("Orcamento 1");
		orcamentos.add("Orcamento 2");
		orcamentos.add("Orcamento 3");
		return orcamentos;
	}
}
