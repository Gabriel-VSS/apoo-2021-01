package br.edu.facthus.apoo.main;

import br.edu.facthus.apoo.model.Produto;

public class Main {
	
	public static void main(String[] args) {
		// Instancia um produto
		Produto p = new Produto();
		
		// Atribui o id e o nome
		p.setId(123);
		p.setNome("Monitor");
		
		// Imprime o id e o nome
		System.out.println(p);
		System.out.println("Id: " + p.getId());
		System.out.println("Nome: " + p.getNome());
		
		// Instancia um 2o produto
		Produto p2 = new Produto();
		p2.setId(987);
		p2.setNome("Teclado");
		
		System.out.println(p2);
		System.out.println("Id: " + p2.getId());
		System.out.println("Nome: " + p2.getNome());
		
	}

}
