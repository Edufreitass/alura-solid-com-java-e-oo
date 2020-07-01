package br.com.alura.aula01.coesao;

// Essa classe não esta sendo utilizada, apenas foi criada para exemplo
public class CalculadoraDeSalario {
	
	/*
	 * Nessa minha implementação, talvez essa classe CalculadoraDeSalario passe até
	 * a ser inútil, porque agora ela só tem uma única linha de código,
	 * calculaSalario(). O meu grande segredo aqui foi as classes
	 * DezOuVintePorCento, QuinzeOuVinteECincoPorCento.
	 */

	public double calcula(Funcionario funcionario) {
		return funcionario.calcularSalario();
	}

}