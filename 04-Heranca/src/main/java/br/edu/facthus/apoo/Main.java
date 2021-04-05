package br.edu.facthus.apoo;

import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("João",
				2000,
				LocalDate.of(2000, Month.DECEMBER, 1));
		f1.imprimeRemuneracao();
		
		Gerente g1 = new Gerente("Maria",
				3000,
				LocalDate.of(1995, Month.JANUARY, 20),
				1000);
		g1.imprimeRemuneracao();
		
		Funcionario g2 = new Gerente("José",
				4000,
				LocalDate.of(1990, Month.OCTOBER, 10),
				500);
		g2.imprimeRemuneracao();
		
	}

}
