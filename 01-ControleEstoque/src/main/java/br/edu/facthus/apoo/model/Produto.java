package br.edu.facthus.apoo.model;

public class Produto {
	
	private Integer id;
	
	private String nome;
	
	public void setNome(String novoNome) {
		nome = novoNome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setId(Integer novoId) {
		id = novoId;
	}
	
	public Integer getId() {
		return id;
	}
	
}
