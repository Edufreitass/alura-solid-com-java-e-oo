package br.com.alura.aula01.coesao;

import java.time.LocalDate;

public class Funcionario {

	private int id;
	private String nome;
	private Cargo cargo;
	private LocalDate dataDeAdmissao;
	private double salarioBase;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public LocalDate getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	// calcula o salario de acordo com as regras impostas no ENUM
	public double calcularSalario() {
		// this, neste caso significa, calcula para ele mesmo
		return cargo.getRegra().calcula(this);
	}

	// sobreescrita do metodo toString()
	@Override
	public String toString() {
		return "[Funcionario => " + "id: " + id + " | " + "nome: " + nome + " | " + "dataDeAdmissão: " + dataDeAdmissao
				+ " | " + "cargo: " + cargo + " | " + "salarioBase: " + salarioBase + " ]";
	}
}
