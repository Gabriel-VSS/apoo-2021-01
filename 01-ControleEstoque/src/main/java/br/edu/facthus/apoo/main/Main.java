package br.edu.facthus.apoo.main;

import br.edu.facthus.apoo.model.Produto;

public class Main {
	
	public static void main(String[] args) {
		
		// Instancia um produto
		Produto p = new Produto();
		
		// Atribui o nome
		p.setNome("Monitor");
		
		// Imprime o nome
		System.out.println(p.getNome());
		
	}

}
