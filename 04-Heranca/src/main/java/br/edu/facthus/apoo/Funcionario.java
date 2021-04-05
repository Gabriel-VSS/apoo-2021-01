package br.edu.facthus.apoo;

import java.time.LocalDate;

public class Funcionario {
	
	protected String nome;
	
	protected Integer salario;
	
	private LocalDate dataAdmissao;

	public Funcionario(String nome, 
			Integer salario, 
			LocalDate dataAdmissao) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}
	
	public void imprimeRemuneracao() {
		System.out.printf("Nome: %s - Remuneração: R$ %d\n",
				nome, salario);
	}
	
}
