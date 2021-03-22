package br.edu.facthus.apoo.main;

import br.edu.facthus.apoo.model.Produto;

public class Main {
	
	public static void main(String[] args) {
		// Instancia um produto
		Produto p = new Produto();
		
		// Atribui os campos
		p.setId(123);
		p.setNome("Monitor");
		p.setDescricao("Monitor LED 13 Polegadas");
		p.setQuantidade(10);
		
		// Imprime os campos
		System.out.println("Id: " + p.getId());
		System.out.println("Nome: " + p.getNome());
		System.out.println("Descrição: " + p.getDescricao());
		System.out.println("Quantidade: " + p.getQuantidade());
		
		// Instancia um 2o produto
		Produto p2 = new Produto();
		p2.setId(987);
		p2.setNome("Teclado");
		p2.setDescricao("Teclado Mecânico ABNT 2");
		p2.setQuantidade(50);
		
		System.out.println("Id: " + p2.getId());
		System.out.println("Nome: " + p2.getNome());
		System.out.println("Descrição: " + p2.getDescricao());
		System.out.println("Quantidade: " + p2.getQuantidade());
		
	}

}
