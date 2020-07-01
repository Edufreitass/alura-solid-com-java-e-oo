package br.com.alura.aula01.coesao;

import java.time.LocalDate;

public class TestaCoesao {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.setId(1);
		funcionario.setNome("Eduardo");
		funcionario.setCargo(Cargo.DESENVOLVEDOR);
		funcionario.setDataDeAdmissao(LocalDate.now());
		funcionario.setSalarioBase(500.0);
		System.out.println(funcionario);
		System.out.println("O seu salário é: " + funcionario.calcularSalario());
		
	}

}
